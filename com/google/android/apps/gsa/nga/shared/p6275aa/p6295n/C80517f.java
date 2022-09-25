package com.google.android.apps.gsa.nga.shared.p6275aa.p6295n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.n.f */
/* compiled from: PG */
public enum C80517f implements C62957cd {
    UNKNOWN(0),
    GENIE(1),
    ORIGINAL(3),
    NORMALIZER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f221043f;

    private C80517f(int i) {
        this.f221043f = i;
    }

    /* renamed from: a */
    public static C80517f m128187a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return GENIE;
        }
        if (i == 3) {
            return ORIGINAL;
        }
        if (i != 4) {
            return null;
        }
        return NORMALIZER;
    }

    /* renamed from: b */
    public static C62959cf m128188b() {
        return C80516e.f221036a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221043f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
