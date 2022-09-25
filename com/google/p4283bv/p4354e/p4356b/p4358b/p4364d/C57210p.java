package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.b.d.p */
/* compiled from: PG */
public enum C57210p implements C62957cd {
    ALIGNMENT_UNSPECIFIED(0),
    DEFAULT(1),
    CENTER(2);
    

    /* renamed from: d */
    private final int f152733d;

    private C57210p(int i) {
        this.f152733d = i;
    }

    /* renamed from: a */
    public static C57210p m88269a(int i) {
        if (i == 0) {
            return ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
    }

    /* renamed from: b */
    public static C62959cf m88270b() {
        return C57209o.f152728a;
    }

    public final int getNumber() {
        return this.f152733d;
    }

    public final String toString() {
        return Integer.toString(this.f152733d);
    }
}
