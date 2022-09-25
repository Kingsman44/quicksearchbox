package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.p */
/* compiled from: PG */
public enum C57333p implements C62957cd {
    DATA_SAVER_STATE_UNKNOWN(0),
    DISABLED(1),
    ENABLED(2);
    

    /* renamed from: d */
    public final int f153149d;

    private C57333p(int i) {
        this.f153149d = i;
    }

    /* renamed from: a */
    public static C57333p m88323a(int i) {
        if (i == 0) {
            return DATA_SAVER_STATE_UNKNOWN;
        }
        if (i == 1) {
            return DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return ENABLED;
    }

    /* renamed from: b */
    public static C62959cf m88324b() {
        return C57332o.f153144a;
    }

    public final int getNumber() {
        return this.f153149d;
    }

    public final String toString() {
        return Integer.toString(this.f153149d);
    }
}
