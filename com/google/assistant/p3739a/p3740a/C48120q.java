package com.google.assistant.p3739a.p3740a;

/* renamed from: com.google.assistant.a.a.q */
/* compiled from: PG */
public final class C48120q {
    /* renamed from: a */
    public static int m85186a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m85187b(int i) {
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
