package com.google.assistant.p4003x.p4004a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.x.a.n */
/* compiled from: PG */
public enum C53537n implements C62957cd {
    UNSPECIFIED(0),
    GAIA(1),
    ZWIEBACK(2),
    DEVICE(3);
    

    /* renamed from: e */
    public final int f140501e;

    private C53537n(int i) {
        this.f140501e = i;
    }

    /* renamed from: a */
    public static C53537n m86858a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return GAIA;
        }
        if (i == 2) {
            return ZWIEBACK;
        }
        if (i != 3) {
            return null;
        }
        return DEVICE;
    }

    /* renamed from: b */
    public static C62959cf m86859b() {
        return C53536m.f140495a;
    }

    public final int getNumber() {
        return this.f140501e;
    }

    public final String toString() {
        return Integer.toString(this.f140501e);
    }
}
