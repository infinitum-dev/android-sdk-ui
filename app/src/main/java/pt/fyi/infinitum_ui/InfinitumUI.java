package pt.fyi.infinitum_ui;

import android.support.v4.app.Fragment;

import pt.fyi.infinitum_ui.modules.menu.bottom.BottomMenuFragment;
import pt.fyi.infinitum_ui.modules.menu.bottom.BottomMenuParams;
import pt.fyi.infinitum_ui.modules.object.detail.DetailFragment;
import pt.fyi.infinitum_ui.modules.object.detail.DetailParams;
import pt.fyi.infinitum_ui.modules.object.list.ListFragment;
import pt.fyi.infinitum_ui.modules.object.list.ListParams;
import pt.fyi.infinitum_ui.modules.object.slideshow.SlideshowFragment;
import pt.fyi.infinitum_ui.modules.object.slideshow.SlideshowParams;

public class InfinitumUI {

    public static class Object {

        public static Fragment list(ListParams params) {
            return ListFragment.newInstance(params);
        }

        public static Fragment detail(DetailParams params) {
            return DetailFragment.newInstance(params);
        }

        public static Fragment slideshow(SlideshowParams params) {
            return SlideshowFragment.newInstance(params);
        }

    }

    public static class Menu {

        public static Fragment bottom(BottomMenuParams params) {
            return BottomMenuFragment.newInstance(params);
        }

    }

}
