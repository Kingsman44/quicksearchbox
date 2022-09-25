package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.m */
/* compiled from: PG */
public enum C57330m implements C62957cd {
    UNKNOWN_APP(0),
    GA(1),
    TEST_APP(2),
    CLANK(3),
    BLING(5),
    LINGO(6),
    GOOGLE_GO(7);
    

    /* renamed from: h */
    public final int f153143h;

    private C57330m(int i) {
        this.f153143h = i;
    }

    /* renamed from: a */
    public static C57330m m88321a(int i) {
        if (i == 0) {
            return UNKNOWN_APP;
        }
        if (i == 1) {
            return GA;
        }
        if (i == 2) {
            return TEST_APP;
        }
        if (i == 3) {
            return CLANK;
        }
        if (i == 5) {
            return BLING;
        }
        if (i == 6) {
            return LINGO;
        }
        if (i != 7) {
            return null;
        }
        return GOOGLE_GO;
    }

    /* renamed from: b */
    public static C62959cf m88322b() {
        return C57329l.f153134a;
    }

    public final int getNumber() {
        return this.f153143h;
    }

    public final String toString() {
        return Integer.toString(this.f153143h);
    }
}
