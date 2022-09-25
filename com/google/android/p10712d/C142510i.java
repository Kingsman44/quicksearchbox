package com.google.android.p10712d;

/* renamed from: com.google.android.d.i */
/* compiled from: PG */
public enum C142510i {
    GENERIC_ACTION,
    TRANSLATE_ACTION,
    DUO_ACTION,
    ACTION_NOT_SET;

    /* renamed from: a */
    public static C142510i m231093a(int i) {
        if (i == 0) {
            return ACTION_NOT_SET;
        }
        if (i == 1) {
            return GENERIC_ACTION;
        }
        if (i == 2) {
            return TRANSLATE_ACTION;
        }
        if (i != 3) {
            return null;
        }
        return DUO_ACTION;
    }
}
