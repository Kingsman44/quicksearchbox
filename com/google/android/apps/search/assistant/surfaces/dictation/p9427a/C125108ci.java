package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ci */
/* compiled from: PG */
public enum C125108ci {
    KEYBOARD_OPENED,
    KEYBOARD_CLOSED,
    VISIBILITY_NOT_SET;

    /* renamed from: a */
    public static C125108ci m205001a(int i) {
        if (i == 0) {
            return VISIBILITY_NOT_SET;
        }
        if (i == 1) {
            return KEYBOARD_OPENED;
        }
        if (i != 2) {
            return null;
        }
        return KEYBOARD_CLOSED;
    }
}
