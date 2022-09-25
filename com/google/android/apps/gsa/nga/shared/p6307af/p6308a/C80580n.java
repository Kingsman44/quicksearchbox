package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.n */
/* compiled from: PG */
public enum C80580n implements C62957cd {
    UNSPECIFIED(0),
    INVOCATION(1),
    RESPONSE(2),
    AFTER_EXECUTION(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f221188f;

    private C80580n(int i) {
        this.f221188f = i;
    }

    /* renamed from: a */
    public static C80580n m128209a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INVOCATION;
        }
        if (i == 2) {
            return RESPONSE;
        }
        if (i != 3) {
            return null;
        }
        return AFTER_EXECUTION;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221188f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
