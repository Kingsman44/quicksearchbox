package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ln */
/* compiled from: PG */
public enum C14500ln implements C62957cd {
    NAVIGATION_UNKNOWN(0),
    NAVIGATION_OFF(1),
    FREE_NAV(2),
    GUIDED_NAV(3),
    RUNNING_IN_BACKGROUND(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f43862g;

    private C14500ln(int i) {
        this.f43862g = i;
    }

    /* renamed from: a */
    public static C14500ln m30627a(int i) {
        if (i == 0) {
            return NAVIGATION_UNKNOWN;
        }
        if (i == 1) {
            return NAVIGATION_OFF;
        }
        if (i == 2) {
            return FREE_NAV;
        }
        if (i == 3) {
            return GUIDED_NAV;
        }
        if (i != 4) {
            return null;
        }
        return RUNNING_IN_BACKGROUND;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43862g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
