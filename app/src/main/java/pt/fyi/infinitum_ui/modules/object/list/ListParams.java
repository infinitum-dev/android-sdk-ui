package pt.fyi.infinitum_ui.modules.object.list;

import java.util.ArrayList;

import pt.fyi.infinitum_ui.Utils;
import pt.fyi.infinitum_ui.modules.object.ObjectEntity;
import pt.fyi.infinitum_ui.modules.object.ObjectType;

public class ListParams {

    private ListLayout layout;
    private ArrayList<ObjectEntity> objectList;
    private ListCallback callback;
    private int type;

    public ListParams(ListLayout layout, ArrayList<ObjectEntity> list, ObjectType type, ListCallback callback) {
        this.layout = layout;
        this.objectList = list;
        this.type = Utils.getLayoutForType(type);
        this.callback = callback;
    }

    ListLayout getLayout() {
        return layout;
    }

    ArrayList<ObjectEntity> getObjectList() {
        return objectList;
    }

    ListCallback getCallback() {
        return callback;
    }

    int getType() {
        return type;
    }
}
