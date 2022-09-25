package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.c.g */
/* compiled from: PG */
public enum C120988g implements C62957cd {
    UNKNOWN(0),
    ASSISTANT_PRIMARY_LOCALE(1),
    CC_SETTING(2),
    QP_SETTING(3),
    ASSISTANT_PREFERRED_LOCALES(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f336351g;

    private C120988g(int i) {
        this.f336351g = i;
    }

    /* renamed from: a */
    public static C120988g m200287a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ASSISTANT_PRIMARY_LOCALE;
        }
        if (i == 2) {
            return CC_SETTING;
        }
        if (i == 3) {
            return QP_SETTING;
        }
        if (i != 4) {
            return null;
        }
        return ASSISTANT_PREFERRED_LOCALES;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f336351g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
