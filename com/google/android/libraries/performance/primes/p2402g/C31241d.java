package com.google.android.libraries.performance.primes.p2402g;

import com.google.common.base.C58838bb;
import java.util.Random;

/* renamed from: com.google.android.libraries.performance.primes.g.d */
/* compiled from: PG */
public final class C31241d {

    /* renamed from: a */
    private final float f84161a;

    /* renamed from: b */
    private final Random f84162b;

    public C31241d(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C58838bb.m90869d(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.f84161a = f;
        this.f84162b = random;
    }

    /* renamed from: a */
    public final boolean mo36965a() {
        return this.f84162b.nextFloat() < this.f84161a;
    }
}
