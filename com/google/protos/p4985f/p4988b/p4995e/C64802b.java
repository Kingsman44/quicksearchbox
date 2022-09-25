package com.google.protos.p4985f.p4988b.p4995e;

@Deprecated
/* renamed from: com.google.protos.f.b.e.b */
/* compiled from: PG */
public final class C64802b {
    /* renamed from: a */
    public static int m96463a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m96464b(int i) {
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
