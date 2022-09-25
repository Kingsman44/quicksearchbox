package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cb */
/* compiled from: PG */
public enum C125101cb {
    KEYBOARD_VISIBILITY_EVENT,
    KEYBOARD_TIP_EVENT,
    BUTTON_PRESSED_EVENT,
    DICTATION_START,
    DICTATION_END,
    FIELD_CHANGED_EVENT,
    KEYBOARD_UI_EVENT,
    EVENT_NOT_SET;

    /* renamed from: a */
    public static C125101cb m204999a(int i) {
        if (i == 0) {
            return EVENT_NOT_SET;
        }
        if (i == 1) {
            return KEYBOARD_VISIBILITY_EVENT;
        }
        if (i == 2) {
            return KEYBOARD_TIP_EVENT;
        }
        if (i == 3) {
            return BUTTON_PRESSED_EVENT;
        }
        if (i == 4) {
            return DICTATION_START;
        }
        if (i == 5) {
            return DICTATION_END;
        }
        if (i == 7) {
            return FIELD_CHANGED_EVENT;
        }
        if (i != 9) {
            return null;
        }
        return KEYBOARD_UI_EVENT;
    }
}
