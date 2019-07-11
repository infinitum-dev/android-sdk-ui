package pt.fyi.infinitum_ui.modules.object.slideshow;

import java.util.ArrayList;

import pt.fyi.infinitum_ui.Utils;
import pt.fyi.infinitum_ui.modules.object.ObjectEntity;
import pt.fyi.infinitum_ui.modules.object.ObjectType;

public class SlideshowParams {

    private SlideshowLayout layout;
    private ArrayList<ObjectEntity> objectList;
    private SlideshowCallback callback;
    private int type;

    public SlideshowParams(SlideshowLayout layout, ArrayList<ObjectEntity> list, ObjectType type, SlideshowCallback callback) {
        this.layout = layout;
        this.objectList = list;
        this.type = Utils.getLayoutForType(type);
        this.callback = callback;
    }

    public SlideshowLayout getLayout() {
        return layout;
    }

    public ArrayList<ObjectEntity> getObjectList() {
        return objectList;
    }

    public SlideshowCallback getCallback() {
        return callback;
    }

    public int getType() {
        return type;
    }
}
