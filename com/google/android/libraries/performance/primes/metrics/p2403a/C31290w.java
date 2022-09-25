package com.google.android.libraries.performance.primes.metrics.p2403a;

import p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71317l;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.w */
/* compiled from: PG */
final class C31290w {

    /* renamed from: a */
    public final C71195ae f84256a;

    /* renamed from: b */
    public final Long f84257b;

    /* renamed from: c */
    public final Long f84258c;

    /* renamed from: d */
    public final Long f84259d;

    /* renamed from: e */
    public final Long f84260e;

    /* renamed from: f */
    public final C71317l f84261f;

    /* renamed from: g */
    public final String f84262g;

    /* renamed from: h */
    public final C71207aq f84263h;

    public C31290w(C71195ae aeVar, Long l, Long l2, Long l3, Long l4, C71317l lVar, String str, C71207aq aqVar) {
        this.f84256a = aeVar;
        this.f84257b = l;
        this.f84258c = l2;
        this.f84259d = l3;
        this.f84260e = l4;
        this.f84261f = lVar;
        this.f84262g = str;
        this.f84263h = aqVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", new Object[]{this.f84257b, this.f84258c, this.f84259d, this.f84260e, this.f84262g});
    }
}
