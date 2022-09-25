package com.google.lens.p4699e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.e.w */
/* compiled from: PG */
public enum C62242w implements C62957cd {
    POPULARITY_UNSPECIFIED(0),
    POPULAR(1),
    HIGHLY_RATED(2),
    CRITICALLY_ACCLAIMED(3);
    

    /* renamed from: e */
    private final int f168041e;

    private C62242w(int i) {
        this.f168041e = i;
    }

    /* renamed from: a */
    public static C62242w m94761a(int i) {
        if (i == 0) {
            return POPULARITY_UNSPECIFIED;
        }
        if (i == 1) {
            return POPULAR;
        }
        if (i == 2) {
            return HIGHLY_RATED;
        }
        if (i != 3) {
            return null;
        }
        return CRITICALLY_ACCLAIMED;
    }

    /* renamed from: b */
    public static C62959cf m94762b() {
        return C62241v.f168035a;
    }

    public final int getNumber() {
        return this.f168041e;
    }

    public final String toString() {
        return Integer.toString(this.f168041e);
    }
}
