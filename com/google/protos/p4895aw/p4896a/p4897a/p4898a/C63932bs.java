package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.a.a.a.bs */
/* compiled from: PG */
public enum C63932bs implements C62957cd {
    GRAVITY_UNSPECIFIED(0),
    ABOVE(1),
    BELOW(2);
    

    /* renamed from: d */
    private final int f172891d;

    private C63932bs(int i) {
        this.f172891d = i;
    }

    /* renamed from: a */
    public static C63932bs m96320a(int i) {
        if (i == 0) {
            return GRAVITY_UNSPECIFIED;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
    }

    /* renamed from: b */
    public static C62959cf m96321b() {
        return C63931br.f172886a;
    }

    public final int getNumber() {
        return this.f172891d;
    }

    public final String toString() {
        return Integer.toString(this.f172891d);
    }
}
