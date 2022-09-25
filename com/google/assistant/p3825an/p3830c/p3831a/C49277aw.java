package com.google.assistant.p3825an.p3830c.p3831a;

/* renamed from: com.google.assistant.an.c.a.aw */
/* compiled from: PG */
public final class C49277aw {
    /* renamed from: a */
    public static int m85399a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m85400b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }
}
