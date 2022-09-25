package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.b.d */
/* compiled from: PG */
public enum C80479d implements C62957cd {
    UNKNOWN_TYPE(0),
    PARTIAL(1),
    PREFETCH(2),
    FINAL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f220909f;

    private C80479d(int i) {
        this.f220909f = i;
    }

    /* renamed from: a */
    public static C80479d m128175a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return PARTIAL;
        }
        if (i == 2) {
            return PREFETCH;
        }
        if (i != 3) {
            return null;
        }
        return FINAL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220909f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
