package pt.fyi.infinitum_ui.modules.object.detail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import pt.fyi.infinitum_ui.R;

public class DetailFragment extends Fragment {

    private DetailParams mParams;

    private LinearLayout mBackground;
    private ImageView mImage;
    private TextView mTitle;
    private TextView mBody;


    public static DetailFragment newInstance(DetailParams params) {
        DetailFragment fragment = new DetailFragment();
        fragment.mParams = params;
        return  fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detail_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBackground = view.findViewById(R.id.background);
        mImage = view.findViewById(R.id.image_detail);
        mTitle = view.findViewById(R.id.title_detail);
        mBody = view.findViewById(R.id.body_detail);

        mBackground.setBackgroundColor(mParams.getLayout().background);
        mImage.setImageBitmap(mParams.getObject().image);
        mTitle.setTextColor(mParams.getLayout().titleColor);
        mTitle.setText(mParams.getObject().title);
        mBody.setTextColor(mParams.getLayout().bodyColor);
        mBody.setText(mParams.getObject().body);
    }

}
