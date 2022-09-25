package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.m */
/* compiled from: PG */
public enum C64128m implements C62957cd {
    WIDTH_UNKNOWN(0),
    WIDTH_LONG(1),
    WIDTH_SHORT(2),
    WIDTH_NARROW(3);
    

    /* renamed from: e */
    public final int f173377e;

    private C64128m(int i) {
        this.f173377e = i;
    }

    /* renamed from: a */
    public static C64128m m96362a(int i) {
        if (i == 0) {
            return WIDTH_UNKNOWN;
        }
        if (i == 1) {
            return WIDTH_LONG;
        }
        if (i == 2) {
            return WIDTH_SHORT;
        }
        if (i != 3) {
            return null;
        }
        return WIDTH_NARROW;
    }

    /* renamed from: b */
    public static C62959cf m96363b() {
        return C64127l.f173371a;
    }

    public final int getNumber() {
        return this.f173377e;
    }

    public final String toString() {
        return Integer.toString(this.f173377e);
    }
}
