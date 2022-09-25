package com.google.protos.p4880aq;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aq.bd */
/* compiled from: PG */
public enum C63742bd implements C62957cd {
    GRAVITY_UNKNOWN(0),
    ABOVE(1),
    BELOW(2);
    

    /* renamed from: d */
    private final int f172440d;

    private C63742bd(int i) {
        this.f172440d = i;
    }

    /* renamed from: a */
    public static C63742bd m96296a(int i) {
        if (i == 0) {
            return GRAVITY_UNKNOWN;
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
    public static C62959cf m96297b() {
        return C63741bc.f172435a;
    }

    public final int getNumber() {
        return this.f172440d;
    }

    public final String toString() {
        return Integer.toString(this.f172440d);
    }
}
