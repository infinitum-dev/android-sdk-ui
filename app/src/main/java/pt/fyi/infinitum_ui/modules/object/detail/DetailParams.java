package pt.fyi.infinitum_ui.modules.object.detail;

import pt.fyi.infinitum_ui.modules.object.ObjectEntity;

public class DetailParams {

    private DetailLayout layout;
    private ObjectEntity object;
    private DetailCallback callback;

    public DetailParams(DetailLayout layout, ObjectEntity object, DetailCallback callback) {
        this.layout = layout;
        this.object = object;
        this.callback = callback;
    }

    public DetailLayout getLayout() {
        return layout;
    }

    public ObjectEntity getObject() {
        return object;
    }

    public DetailCallback getCallback() {
        return callback;
    }

}
