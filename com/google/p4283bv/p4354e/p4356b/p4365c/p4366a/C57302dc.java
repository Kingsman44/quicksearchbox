package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.dc */
/* compiled from: PG */
public enum C57302dc implements C62957cd {
    UNKNOWN_REQUEST_VERSION(0),
    FEED_QUERY(1);
    

    /* renamed from: c */
    public final int f152956c;

    private C57302dc(int i) {
        this.f152956c = i;
    }

    /* renamed from: a */
    public static C57302dc m88306a(int i) {
        if (i == 0) {
            return UNKNOWN_REQUEST_VERSION;
        }
        if (i != 1) {
            return null;
        }
        return FEED_QUERY;
    }

    /* renamed from: b */
    public static C62959cf m88307b() {
        return C57301db.f152952a;
    }

    public final int getNumber() {
        return this.f152956c;
    }

    public final String toString() {
        return Integer.toString(this.f152956c);
    }
}
