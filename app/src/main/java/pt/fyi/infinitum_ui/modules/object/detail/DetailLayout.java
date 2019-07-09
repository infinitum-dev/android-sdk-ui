package pt.fyi.infinitum_ui.modules.object.detail;

import android.graphics.Color;

public class DetailLayout {

    int background = Color.WHITE;
    int titleColor = Color.BLACK;
    int bodyColor = Color.BLACK;

    /**
     * Empty constructor for default options
     */
    public DetailLayout() {}


    /**
     * Simple detail layout constructor
     * @param background
     * @param titleColor
     * @param bodyColor
     */
    public DetailLayout(int background, int titleColor, int bodyColor) {
        this.background = background;
        this.titleColor = titleColor;
        this.bodyColor = bodyColor;
    }

}
