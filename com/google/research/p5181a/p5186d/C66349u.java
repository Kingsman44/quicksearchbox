package com.google.research.p5181a.p5186d;

import java.util.Random;

/* renamed from: com.google.research.a.d.u */
/* compiled from: PG */
public final class C66349u {
    /* renamed from: a */
    public static void m97073a(C66343o oVar) {
        int i = oVar.f180407a;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = oVar.f180408b;
            Random random = new Random();
            for (int i4 = 0; i4 < i3; i4++) {
                oVar.mo59559k(i2, i4, random.nextGaussian() * 0.1d);
            }
        }
    }
}
