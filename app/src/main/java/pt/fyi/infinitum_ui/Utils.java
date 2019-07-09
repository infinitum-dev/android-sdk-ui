package pt.fyi.infinitum_ui;

import pt.fyi.infinitum_ui.modules.object.ObjectType;

public class Utils {

    public static int getLayoutForType(ObjectType type){
        switch (type) {
            case Simple:
                return R.layout.simple_cell;
            case Slide_Simple:
                return R.layout.simple_slide;
        }
        return 0;
    }

}
