package com.google.p4283bv.p4369f.p4370a.p4371a;

/* renamed from: com.google.bv.f.a.a.bs */
/* compiled from: PG */
public final class C57602bs {
    /* renamed from: a */
    public static int m88504a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m88505b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }
}
