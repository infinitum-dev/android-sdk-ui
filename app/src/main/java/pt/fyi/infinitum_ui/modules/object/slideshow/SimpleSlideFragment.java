package pt.fyi.infinitum_ui.modules.object.slideshow;

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
import pt.fyi.infinitum_ui.model.ObjectEntity;

public class SimpleSlideFragment extends Fragment {

    private SlideshowParams mParams;
    private int mPosition;


    private ImageView mImage;
    private TextView mTitle;
    private LinearLayout mHeader;
    private TextView mBody;

    public static SimpleSlideFragment newInstance(SlideshowParams params, int position) {
        SimpleSlideFragment fragment = new SimpleSlideFragment();
        fragment.mParams = params;
        fragment.mPosition = position;
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(mParams.getType(), container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ObjectEntity obj = mParams.getObjectList().get(mPosition);

        mHeader = view.findViewById(R.id.header_bar);
        mImage = view.findViewById(R.id.image_top);
        mTitle = view.findViewById(R.id.title);
        mBody = view.findViewById(R.id.body);

        mHeader.setBackgroundColor(mParams.getLayout().headerBackground);
        mTitle.setTextColor(mParams.getLayout().titleColor);
        mBody.setTextColor(mParams.getLayout().bodyColor);

        mImage.setImageBitmap(obj.image);
        mTitle.setText(obj.title);
        mBody.setText(obj.body);

    }
}

