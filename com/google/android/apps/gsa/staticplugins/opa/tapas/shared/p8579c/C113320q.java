package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q */
/* compiled from: PG */
public enum C113320q implements C62957cd {
    UNKNOWN(0),
    TEXT(1),
    CALL(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f313831e;

    private C113320q(int i) {
        this.f313831e = i;
    }

    /* renamed from: a */
    public static C113320q m187477a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return TEXT;
        }
        if (i != 2) {
            return null;
        }
        return CALL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f313831e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
