package com.google.android.libraries.performance.primes.p2402g;

import java.util.Random;

/* renamed from: com.google.android.libraries.performance.primes.g.a */
/* compiled from: PG */
public final class C31238a {

    /* renamed from: a */
    public final short[] f84151a = new short[256];

    /* renamed from: b */
    public final short[] f84152b = new short[256];

    /* renamed from: c */
    public final int f84153c;

    /* renamed from: d */
    public long f84154d;

    public C31238a(Random random) {
        this.f84153c = (random.nextInt() & -131075) | 65537;
        this.f84154d = 0;
    }
}
