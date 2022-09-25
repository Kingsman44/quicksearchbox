package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.p */
/* compiled from: PG */
public enum C120100p implements C62957cd {
    SETTING_UNKNOWN(0),
    SETTING_LOCALE(1),
    SETTING_ASSISTANT_ENABLED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f334323e;

    private C120100p(int i) {
        this.f334323e = i;
    }

    /* renamed from: a */
    public static C120100p m199027a(int i) {
        if (i == 0) {
            return SETTING_UNKNOWN;
        }
        if (i == 1) {
            return SETTING_LOCALE;
        }
        if (i != 2) {
            return null;
        }
        return SETTING_ASSISTANT_ENABLED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f334323e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
