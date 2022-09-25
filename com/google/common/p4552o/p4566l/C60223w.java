package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.l.w */
/* compiled from: PG */
public enum C60223w implements C62957cd {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2);
    

    /* renamed from: d */
    public final int f162943d;

    private C60223w(int i) {
        this.f162943d = i;
    }

    /* renamed from: a */
    public static C60223w m92548a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STARTUP;
        }
        if (i != 2) {
            return null;
        }
        return TELEDOCTOR;
    }

    /* renamed from: b */
    public static C62959cf m92549b() {
        return C60222v.f162938a;
    }

    public final int getNumber() {
        return this.f162943d;
    }

    public final String toString() {
        return Integer.toString(this.f162943d);
    }
}
