package pt.fyi.infinitum_ui.modules.object.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import pt.fyi.infinitum_ui.R;
import pt.fyi.infinitum_ui.modules.object.ObjectEntity;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.AdapterViewHolder>{

    private ListParams mParams;

    ListAdapter(ListParams params) {
        mParams = params;
    }

    @NonNull
    @Override
    public ListAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(mParams.getType(), viewGroup, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mParams.getCallback().onClick(mParams.getObjectList().get(i));
            }
        });
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.AdapterViewHolder viewHolder, int i) {
        ObjectEntity objectEntity = mParams.getObjectList().get(i);

        viewHolder.setBackground(mParams.getLayout().cellBackground);
        viewHolder.setTitle(objectEntity.title, mParams.getLayout().titleColor);
        viewHolder.setBody(objectEntity.body, mParams.getLayout().bodyColor);

    }

    @Override
    public int getItemCount() {
        return mParams.getObjectList().size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout mBackground;
        private TextView mTitle;
        private TextView mBody;

        AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            mBackground = itemView.findViewById(R.id.background);
            mTitle = itemView.findViewById(R.id.title_text);
            mBody = itemView.findViewById(R.id.body_text);

        }

        void setTitle(String title, int color) {
            if (mTitle != null) {
                this.mTitle.setTextColor(color);
                this.mTitle.setText(title);
            }
        }

        void setBody(String body, int color) {
            if (mBody != null) {
                this.mBody.setTextColor(color);
                this.mBody.setText(body);
            }
        }

        void setBackground(int background) {
            mBackground.setBackgroundColor(background);
        }
    }
}
