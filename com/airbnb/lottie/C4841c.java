package com.airbnb.lottie;

import com.airbnb.lottie.p245f.C4947d;
import com.airbnb.lottie.p245f.C4954k;

/* renamed from: com.airbnb.lottie.c */
/* compiled from: PG */
final class C4841c implements C4827ae {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9783a(Object obj) {
        Throwable th = (Throwable) obj;
        if (C4954k.m13727j(th)) {
            C4947d.m13696a("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
