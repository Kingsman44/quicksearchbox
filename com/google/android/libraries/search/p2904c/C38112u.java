package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.u */
/* compiled from: PG */
public enum C38112u implements C62957cd {
    UNKNOWN_TYPE(0),
    ANDROID_TIMESTAMP(1),
    EXTRAPOLATED_TIMESTAMP(2);
    

    /* renamed from: d */
    public final int f100989d;

    private C38112u(int i) {
        this.f100989d = i;
    }

    /* renamed from: a */
    public static C38112u m67285a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return ANDROID_TIMESTAMP;
        }
        if (i != 2) {
            return null;
        }
        return EXTRAPOLATED_TIMESTAMP;
    }

    /* renamed from: b */
    public static C62959cf m67286b() {
        return C37972t.f100604a;
    }

    public final int getNumber() {
        return this.f100989d;
    }

    public final String toString() {
        return Integer.toString(this.f100989d);
    }
}
