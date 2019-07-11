package pt.fyi.infinitum_ui.modules.object.slideshow;

import android.graphics.Color;

public class SlideshowLayout {

    public int background = Color.WHITE;
    public int headerBackground = Color.WHITE;
    public int titleColor = Color.BLACK;
    public int bodyColor = Color.BLACK;

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
