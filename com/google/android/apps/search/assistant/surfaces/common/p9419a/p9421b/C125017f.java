package com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.a.b.f */
/* compiled from: PG */
public enum C125017f {
    HOTWORD,
    LAUNCHER,
    SELF_TRIGGER,
    TRIGGER_NOT_SET;

    /* renamed from: a */
    public static C125017f m204944a(int i) {
        if (i == 0) {
            return TRIGGER_NOT_SET;
        }
        if (i == 1) {
            return HOTWORD;
        }
        if (i == 2) {
            return LAUNCHER;
        }
        if (i != 3) {
            return null;
        }
        return SELF_TRIGGER;
    }
}
