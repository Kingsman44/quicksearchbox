package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.bv */
/* compiled from: PG */
public enum C59668bv implements C62957cd {
    STARTUP_CANCEL_UNKNOWN(0),
    STARTUP_CANCEL_DISABLED(1),
    STARTUP_CANCEL_ACTIVITY_STOPPED(2);
    

    /* renamed from: d */
    public final int f160002d;

    private C59668bv(int i) {
        this.f160002d = i;
    }

    /* renamed from: a */
    public static C59668bv m92476a(int i) {
        if (i == 0) {
            return STARTUP_CANCEL_UNKNOWN;
        }
        if (i == 1) {
            return STARTUP_CANCEL_DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return STARTUP_CANCEL_ACTIVITY_STOPPED;
    }

    /* renamed from: b */
    public static C62959cf m92477b() {
        return C59667bu.f159997a;
    }

    public final int getNumber() {
        return this.f160002d;
    }

    public final String toString() {
        return Integer.toString(this.f160002d);
    }
}
