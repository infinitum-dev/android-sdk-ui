package pt.fyi.infinitum_ui.modules.object.slideshow;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import pt.fyi.infinitum_ui.R;

public class SlideshowFragment extends Fragment implements SlideCallback{

    private SlideshowParams mParams;

    private RelativeLayout mBackground;
    private ViewPager mPager;
    private LinearLayout mViewPagerIndicators;

    private int dotsCount;
    private ImageView[] dots;

    public static SlideshowFragment newInstance(SlideshowParams params) {
        SlideshowFragment fragment = new SlideshowFragment();
        fragment.mParams = params;
        return  fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.slideshow_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBackground = view.findViewById(R.id.background);
        mPager = view.findViewById(R.id.view_flipper);
        mViewPagerIndicators = view.findViewById(R.id.view_pager_indicators);

        mPager.setVisibility(View.VISIBLE);
        SlideshowAdapter adapter = new SlideshowAdapter(getFragmentManager(),mParams, mPager, this);
        mPager.setAdapter(adapter);
        mPager.setOffscreenPageLimit(adapter.getCount() - 1);
        mPager.addOnPageChangeListener(adapter);
        adapter.notifyDataSetChanged();

        mBackground.setBackgroundColor(mParams.getLayout().background);
        createDots();
    }

    private void createDots() {
        dotsCount = mParams.getObjectList().size();
        dots = new ImageView[dotsCount];
        Context mContext = getContext();
        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(mContext);
            dots[i].setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.custom_view_pager_indicator_non_selected));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(5, 0, 5, 0);

            mViewPagerIndicators.addView(dots[i], params);
        }
        if (dotsCount > 0)
            dots[0].setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.custom_view_pager_indicator_selected));
    }

    @Override
    public void changeToPage(int position) {
        Context mContext = getContext();
        for (int i = 0; i < dotsCount; i++)
            dots[i].setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.custom_view_pager_indicator_non_selected));
        dots[position].setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.custom_view_pager_indicator_selected));
    }
}
