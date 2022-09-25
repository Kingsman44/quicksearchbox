package com.google.p4283bv.p4287b.p4342b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.b.b.e */
/* compiled from: PG */
public enum C56941e implements C62957cd {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_GWS(1),
    PLATFORM_GUS(2),
    PLATFORM_BOQ(3);
    

    /* renamed from: e */
    public final int f151981e;

    private C56941e(int i) {
        this.f151981e = i;
    }

    /* renamed from: a */
    public static C56941e m88234a(int i) {
        if (i == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return PLATFORM_GWS;
        }
        if (i == 2) {
            return PLATFORM_GUS;
        }
        if (i != 3) {
            return null;
        }
        return PLATFORM_BOQ;
    }

    /* renamed from: b */
    public static C62959cf m88235b() {
        return C56940d.f151975a;
    }

    public final int getNumber() {
        return this.f151981e;
    }

    public final String toString() {
        return Integer.toString(this.f151981e);
    }
}
