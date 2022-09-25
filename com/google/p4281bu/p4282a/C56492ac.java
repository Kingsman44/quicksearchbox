package com.google.p4281bu.p4282a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.bu.a.ac */
/* compiled from: PG */
public enum C56492ac implements C62957cd {
    COMPLETION_STYLE_UNKNOWN(0),
    COMPLETION_STYLE_CARD(1),
    COMPLETION_STYLE_TOAST(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f150886e;

    private C56492ac(int i) {
        this.f150886e = i;
    }

    /* renamed from: a */
    public static C56492ac m88203a(int i) {
        if (i == 0) {
            return COMPLETION_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return COMPLETION_STYLE_CARD;
        }
        if (i != 2) {
            return null;
        }
        return COMPLETION_STYLE_TOAST;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f150886e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
