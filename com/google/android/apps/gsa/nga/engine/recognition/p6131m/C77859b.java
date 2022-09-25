package com.google.android.apps.gsa.nga.engine.recognition.p6131m;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.b */
/* compiled from: PG */
public enum C77859b implements C62957cd {
    DEFAULT_SODA_ONLY(0),
    S3_ONLY(1),
    NETWORK_MONITORING(2),
    HYBRID(3),
    SODA_ONLY_WHEN_POSSIBLE(4),
    S3_UNLESS_OFFLINE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f214466h;

    private C77859b(int i) {
        this.f214466h = i;
    }

    /* renamed from: a */
    public static C77859b m124920a(int i) {
        if (i == 0) {
            return DEFAULT_SODA_ONLY;
        }
        if (i == 1) {
            return S3_ONLY;
        }
        if (i == 2) {
            return NETWORK_MONITORING;
        }
        if (i == 3) {
            return HYBRID;
        }
        if (i == 4) {
            return SODA_ONLY_WHEN_POSSIBLE;
        }
        if (i != 5) {
            return null;
        }
        return S3_UNLESS_OFFLINE;
    }

    /* renamed from: b */
    public static C62959cf m124921b() {
        return C77831a.f214402a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f214466h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
