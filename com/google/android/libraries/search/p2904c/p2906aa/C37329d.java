package com.google.android.libraries.search.p2904c.p2906aa;

import com.google.android.libraries.search.p2904c.C37360ay;

/* renamed from: com.google.android.libraries.search.c.aa.d */
/* compiled from: PG */
public final class C37329d {
    /* renamed from: a */
    public static int m66333a(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 4) {
                return 1;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static int m66334b(C37360ay ayVar) {
        return m66333a(ayVar.f99230e) * Integer.bitCount(ayVar.f99229d) * ayVar.f99228c;
    }

    /* renamed from: c */
    public static int m66335c(C37360ay ayVar) {
        return (m66334b(ayVar) * 20) / 1000;
    }
}
