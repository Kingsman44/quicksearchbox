package com.google.assistant.p3825an.p3830c.p3831a;

/* renamed from: com.google.assistant.an.c.a.ay */
/* compiled from: PG */
public final class C49279ay {
    /* renamed from: a */
    public static int m85401a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m85402b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }
}
