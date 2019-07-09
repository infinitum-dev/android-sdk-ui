package pt.fyi.infinitum_ui.modules.object.slideshow;

import android.graphics.Color;

public class SlideshowLayout {

    int background = Color.WHITE;
    int headerBackground = Color.WHITE;
    int titleColor = Color.BLACK;
    int bodyColor = Color.BLACK;

    /**
     *  Empty constructor for default values
     */
    public SlideshowLayout() {}

    /**
     * Constructor for Simple cell
     * @param background
     * @param headerBackground
     * @param titleColor
     * @param bodyColor
     */
    public SlideshowLayout(int background, int headerBackground, int titleColor, int bodyColor) {
        this.background = background;
        this.headerBackground = headerBackground;
        this.titleColor = titleColor;
        this.bodyColor = bodyColor;
    }



}
