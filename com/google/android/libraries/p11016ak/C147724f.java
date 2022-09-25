package com.google.android.libraries.p11016ak;

/* renamed from: com.google.android.libraries.ak.f */
/* compiled from: PG */
public final class C147724f {
    /* renamed from: a */
    public static int m240800a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m240801b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }
}
