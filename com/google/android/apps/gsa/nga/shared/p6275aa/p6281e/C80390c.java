package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.c */
/* compiled from: PG */
public enum C80390c implements C62957cd {
    UNKNOWN_TYPE(0),
    MESSAGE(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f220634d;

    private C80390c(int i) {
        this.f220634d = i;
    }

    /* renamed from: a */
    public static C80390c m128124a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i != 1) {
            return null;
        }
        return MESSAGE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220634d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
