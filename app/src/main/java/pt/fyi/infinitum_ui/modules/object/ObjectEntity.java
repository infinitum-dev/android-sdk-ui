package pt.fyi.infinitum_ui.modules.object;

import android.graphics.Bitmap;

public class ObjectEntity {

    public int id;
    public String title;
    public String body;

    public Bitmap image;

    /**
     * Initializer for Simple List Object
     * @param id
     * @param title
     * @param body
     */
    public ObjectEntity(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }


    /**
     * Initializer for Detail Object
     * @param id
     * @param title
     * @param body
     * @param image
     */
    public ObjectEntity(int id, String title, String body, Bitmap image) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.image = image;
    }

}
