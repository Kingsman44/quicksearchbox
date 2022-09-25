package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bb */
/* compiled from: PG */
public enum C119807bb {
    START_INTERACTION,
    STOP_INTERACTION,
    STOP_LISTENING,
    PROCEDURE_NOT_SET;

    /* renamed from: a */
    public static C119807bb m198714a(int i) {
        if (i == 0) {
            return PROCEDURE_NOT_SET;
        }
        if (i == 1) {
            return START_INTERACTION;
        }
        if (i == 2) {
            return STOP_INTERACTION;
        }
        if (i != 3) {
            return null;
        }
        return STOP_LISTENING;
    }
}
