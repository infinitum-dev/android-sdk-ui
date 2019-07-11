package pt.fyi.infinitum_ui.modules.object.slideshow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import pt.fyi.infinitum_ui.modules.object.slideshow.controllers.SimpleSlideFragment;

public class SlideshowAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener {

    private SlideshowParams mParams;
    private ViewPager mViewPager;
    private SlideCallback mCallback;

    SlideshowAdapter(FragmentManager fm, SlideshowParams params, ViewPager pager, SlideCallback callback) {
        super(fm);
        mParams = params;
        mViewPager = pager;
        mCallback = callback;
    }

    @Override
    public Fragment getItem(int i) {
        return SimpleSlideFragment.newInstance(mParams, i);
    }

    @Override
    public int getCount() {
        return mParams.getObjectList().size();
    }

    /**
     *
     * On page change methods
     *
     */

    private int mCurrentPosition;
    private int mScrollState;

    @Override
    public void onPageSelected(final int position) {
        mCurrentPosition = position;
        mCallback.changeToPage(position);
    }

    @Override
    public void onPageScrollStateChanged(final int state) {
        handleScrollState(state);
        mScrollState = state;
    }

    private void handleScrollState(final int state) {
        if (state == ViewPager.SCROLL_STATE_IDLE) {
            setNextItemIfNeeded();
        }
    }

    private void setNextItemIfNeeded() {
        if (!isScrollStateSettling()) {
            handleSetNextItem();
        }
    }

    private boolean isScrollStateSettling() {
        return mScrollState == ViewPager.SCROLL_STATE_SETTLING || mScrollState == ViewPager.SCROLL_STATE_IDLE;
    }

    private void handleSetNextItem() {
        final int lastPosition = mViewPager.getAdapter().getCount() - 1;
        if (mCurrentPosition == 0) {
            mViewPager.setCurrentItem(lastPosition, true);
        } else if (mCurrentPosition == lastPosition) {
            mViewPager.setCurrentItem(0, true);
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {
        // Nothing
    }

}
