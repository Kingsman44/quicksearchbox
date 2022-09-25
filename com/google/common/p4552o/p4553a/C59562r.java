package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.a.r */
/* compiled from: PG */
public enum C59562r implements C62957cd {
    UNKNOWN(0),
    SYS_UI(1),
    NGA_ON_SHOW(2),
    OPA_ON_SHOW(3);
    

    /* renamed from: e */
    public final int f158049e;

    private C59562r(int i) {
        this.f158049e = i;
    }

    /* renamed from: a */
    public static C59562r m92365a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYS_UI;
        }
        if (i == 2) {
            return NGA_ON_SHOW;
        }
        if (i != 3) {
            return null;
        }
        return OPA_ON_SHOW;
    }

    /* renamed from: b */
    public static C62959cf m92366b() {
        return C59561q.f158043a;
    }

    public final int getNumber() {
        return this.f158049e;
    }

    public final String toString() {
        return Integer.toString(this.f158049e);
    }
}
