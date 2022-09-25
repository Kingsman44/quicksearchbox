package com.google.android.libraries.p579ar.sceneviewer.hotspots;

/* renamed from: com.google.android.libraries.ar.sceneviewer.hotspots.ButtonType */
/* compiled from: PG */
public enum ButtonType {
    NONE(0, false),
    LEFT(1, false),
    RIGHT(2, false),
    GET_HELP(3, false);
    

    /* renamed from: id */
    private final int f35631id;
    private boolean valid;

    private ButtonType(int i, boolean z) {
        this.f35631id = i;
        this.valid = z;
    }

    public static ButtonType fromId(int i) {
        for (ButtonType buttonType : values()) {
            if (buttonType.f35631id == i) {
                return buttonType;
            }
        }
        return null;
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setValid(boolean z) {
        this.valid = z;
    }
}
