package pt.fyi.infinitum_ui.modules.object.list;

import android.graphics.Color;

public class ListLayout {

    int background = Color.WHITE;
    int cellBackground = Color.WHITE;
    int titleColor = Color.BLACK;
    int bodyColor = Color.BLACK;

    /**
     *  Empty constructor for default values
     */
    public ListLayout() {}

    /**
     * Constructor for Simple cell
     * @param background
     * @param cellBackground
     * @param titleColor
     * @param bodyColor
     */
    public ListLayout(int background, int cellBackground, int titleColor, int bodyColor) {
        this.background = background;
        this.cellBackground = cellBackground;
        this.titleColor = titleColor;
        this.bodyColor = bodyColor;
    }

}
