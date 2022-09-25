package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.b.en */
/* compiled from: PG */
public enum C64085en implements C62957cd {
    UNKNOWN(0),
    ACCEPTED(1),
    REJECTED(2),
    DELTA_FAILURE(3);
    

    /* renamed from: e */
    private final int f173251e;

    private C64085en(int i) {
        this.f173251e = i;
    }

    /* renamed from: a */
    public static C64085en m96348a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACCEPTED;
        }
        if (i == 2) {
            return REJECTED;
        }
        if (i != 3) {
            return null;
        }
        return DELTA_FAILURE;
    }

    /* renamed from: b */
    public static C62959cf m96349b() {
        return C64084em.f173245a;
    }

    public final int getNumber() {
        return this.f173251e;
    }

    public final String toString() {
        return Integer.toString(this.f173251e);
    }
}
