package com.google.p4283bv.p4354e.p4367c.p4368a;

/* renamed from: com.google.bv.e.c.a.am */
/* compiled from: PG */
public final class C57361am {
    /* renamed from: a */
    public static /* synthetic */ String m88330a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CONTENTTYPE_NOT_SET" : "TEMPLATE_BINDING" : "TEMPLATE_INVOCATION" : "BOUND_ELEMENT" : "ELEMENT";
    }

    /* renamed from: b */
    public static int m88331b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
