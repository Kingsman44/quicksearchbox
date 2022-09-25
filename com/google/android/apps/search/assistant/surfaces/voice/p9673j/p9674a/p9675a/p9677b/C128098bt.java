package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt */
/* compiled from: PG */
public enum C128098bt {
    IDLE,
    FULL_LISTENING,
    HALF_LISTENING,
    EXECUTING,
    STATE_NOT_SET;

    /* renamed from: a */
    public static C128098bt m209216a(int i) {
        if (i == 0) {
            return STATE_NOT_SET;
        }
        if (i == 1) {
            return IDLE;
        }
        if (i == 2) {
            return FULL_LISTENING;
        }
        if (i == 3) {
            return HALF_LISTENING;
        }
        if (i != 4) {
            return null;
        }
        return EXECUTING;
    }
}
