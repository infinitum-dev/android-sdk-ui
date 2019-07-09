package pt.fyi.infinitum_ui.modules.object;

public enum ObjectType {
    Simple,
    Slide_Simple;

    public static ObjectType fromInteger(int x) {
        switch (x) {
            case 1:
                return Simple;
            case 2:
                return Slide_Simple;
        }
        return null;
    }
}
