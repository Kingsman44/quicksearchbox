package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.h */
/* compiled from: PG */
public enum C64123h implements C62957cd {
    STYLE_UNKNOWN(0),
    STYLE_NUMERIC(1),
    STYLE_NAMED(2);
    

    /* renamed from: d */
    private final int f173359d;

    private C64123h(int i) {
        this.f173359d = i;
    }

    /* renamed from: a */
    public static C64123h m96358a(int i) {
        if (i == 0) {
            return STYLE_UNKNOWN;
        }
        if (i == 1) {
            return STYLE_NUMERIC;
        }
        if (i != 2) {
            return null;
        }
        return STYLE_NAMED;
    }

    /* renamed from: b */
    public static C62959cf m96359b() {
        return C64122g.f173354a;
    }

    public final int getNumber() {
        return this.f173359d;
    }

    public final String toString() {
        return Integer.toString(this.f173359d);
    }
}
