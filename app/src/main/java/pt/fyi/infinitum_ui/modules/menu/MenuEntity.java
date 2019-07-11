package pt.fyi.infinitum_ui.modules.menu;

import android.graphics.drawable.Drawable;

public class MenuEntity {

    public int id;
    public String title;
    public Drawable image;

    /**
     * Initializer for Bottom Menu
     * @param id
     * @param title
     * @param image
     */
    public MenuEntity(int id, String title, Drawable image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }
}
