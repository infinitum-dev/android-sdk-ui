package pt.fyi.infinitum_ui.modules.menu.bottom;

import java.util.ArrayList;

import pt.fyi.infinitum_ui.modules.menu.MenuEntity;

public class BottomMenuParams {

    private BottomMenuLayout layout;
    private ArrayList<MenuEntity> menuList;
    private BottomMenuCallback callback;

    public BottomMenuParams(BottomMenuLayout layout, ArrayList<MenuEntity> list, BottomMenuCallback callback) {
        this.layout = layout;
        this.menuList = list;
        this.callback = callback;
    }

    BottomMenuLayout getLayout() {
        return layout;
    }

    ArrayList<MenuEntity> getObjectList() {
        return menuList;
    }

    BottomMenuCallback getCallback() {
        return callback;
    }

}
