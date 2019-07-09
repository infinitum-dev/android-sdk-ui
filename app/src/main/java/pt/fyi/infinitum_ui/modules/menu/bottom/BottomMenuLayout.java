package pt.fyi.infinitum_ui.modules.menu.bottom;

import android.graphics.Color;

public class BottomMenuLayout {

    int background = Color.WHITE;
    int titleColor = Color.BLACK;

    /**
     *  Empty constructor for default values
     */
    public BottomMenuLayout() {}

    /**
     * Constructor for Bottom layout menu
     * @param background
     * @param titleColor
     */
    public BottomMenuLayout(int background, int titleColor) {
        this.background = background;
        this.titleColor = titleColor;
    }
}
