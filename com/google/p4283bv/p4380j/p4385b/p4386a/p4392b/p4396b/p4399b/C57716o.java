package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.j.b.a.b.b.b.o */
/* compiled from: PG */
public enum C57716o implements C62957cd {
    RESOURCE_TYPE_UNSPECIFIED(0),
    FONT(2),
    IMAGE(3);
    

    /* renamed from: d */
    public final int f154194d;

    private C57716o(int i) {
        this.f154194d = i;
    }

    /* renamed from: a */
    public static C57716o m88524a(int i) {
        if (i == 0) {
            return RESOURCE_TYPE_UNSPECIFIED;
        }
        if (i == 2) {
            return FONT;
        }
        if (i != 3) {
            return null;
        }
        return IMAGE;
    }

    /* renamed from: b */
    public static C62959cf m88525b() {
        return C57715n.f154189a;
    }

    public final int getNumber() {
        return this.f154194d;
    }

    public final String toString() {
        return Integer.toString(this.f154194d);
    }
}
