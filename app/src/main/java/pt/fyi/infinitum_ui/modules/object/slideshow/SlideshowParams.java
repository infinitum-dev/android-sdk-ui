package pt.fyi.infinitum_ui.modules.object.slideshow;

import java.util.ArrayList;

import pt.fyi.infinitum_ui.Utils;
import pt.fyi.infinitum_ui.model.ObjectEntity;
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

    SlideshowLayout getLayout() {
        return layout;
    }

    ArrayList<ObjectEntity> getObjectList() {
        return objectList;
    }

    SlideshowCallback getCallback() {
        return callback;
    }

    int getType() {
        return type;
    }
}
