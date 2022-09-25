package com.google.lens.p4707j;

/* renamed from: com.google.lens.j.cy */
/* compiled from: PG */
public final class C62475cy {
    /* renamed from: a */
    public static int m94781a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m94782b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }
}
