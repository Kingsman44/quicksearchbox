package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.a.bc */
/* compiled from: PG */
public enum C64676bc implements C62957cd {
    UNSPECIFIED(0),
    NAME(1),
    DEVICE(2),
    ENDPOINT(3),
    PROVIDER(4),
    INSTANCE(5);
    

    /* renamed from: g */
    public final int f175326g;

    private C64676bc(int i) {
        this.f175326g = i;
    }

    /* renamed from: a */
    public static C64676bc m96428a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NAME;
        }
        if (i == 2) {
            return DEVICE;
        }
        if (i == 3) {
            return ENDPOINT;
        }
        if (i == 4) {
            return PROVIDER;
        }
        if (i != 5) {
            return null;
        }
        return INSTANCE;
    }

    /* renamed from: b */
    public static C62959cf m96429b() {
        return C64675bb.f175318a;
    }

    public final int getNumber() {
        return this.f175326g;
    }

    public final String toString() {
        return Integer.toString(this.f175326g);
    }
}
