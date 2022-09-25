package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.l */
/* compiled from: PG */
public final class C133989l {

    /* renamed from: a */
    public final double f364973a;

    /* renamed from: b */
    public final double f364974b;

    /* renamed from: c */
    private final Duration f364975c;

    public C133989l(double d, double d2, long j) {
        this.f364973a = d;
        this.f364974b = d2;
        this.f364975c = Duration.ofMillis(j);
    }

    /* renamed from: a */
    public final boolean mo111509a(Duration duration) {
        C69664n.m101061g(duration, "duration");
        return duration.compareTo(this.f364975c) > 0;
    }
}
