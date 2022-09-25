package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ba.a.b.a.ac */
/* compiled from: PG */
public enum C54810ac implements C62957cd {
    UNKNOWN_ORIGIN(0),
    SERVER_ORIGIN(1),
    CLIENT_ORIGIN(2),
    IL_CLIENT(3);
    

    /* renamed from: e */
    public final int f143798e;

    private C54810ac(int i) {
        this.f143798e = i;
    }

    /* renamed from: a */
    public static C54810ac m87534a(int i) {
        if (i == 0) {
            return UNKNOWN_ORIGIN;
        }
        if (i == 1) {
            return SERVER_ORIGIN;
        }
        if (i == 2) {
            return CLIENT_ORIGIN;
        }
        if (i != 3) {
            return null;
        }
        return IL_CLIENT;
    }

    /* renamed from: b */
    public static C62959cf m87535b() {
        return C54809ab.f143792a;
    }

    public final int getNumber() {
        return this.f143798e;
    }

    public final String toString() {
        return Integer.toString(this.f143798e);
    }
}
