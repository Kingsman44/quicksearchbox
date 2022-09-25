package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agb */
/* compiled from: PG */
final class agb extends agt {

    /* renamed from: a */
    final /* synthetic */ agt f20608a;

    public agb(agt agt) {
        this.f20608a = agt;
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        return new AtomicLong(((Number) this.f20608a.read(alb)).longValue());
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        this.f20608a.write(ald, Long.valueOf(((AtomicLong) obj).get()));
    }
}
