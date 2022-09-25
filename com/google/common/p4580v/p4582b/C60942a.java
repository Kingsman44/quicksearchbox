package com.google.common.p4580v.p4582b;

import com.google.common.p4580v.C60944c;
import kotlinx.coroutines.C71608bi;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;

/* renamed from: com.google.common.v.b.a */
/* compiled from: PG */
public final class C60942a {

    /* renamed from: a */
    private static final int f165054a = ((int) Duration.ofMillis(1).toNanos());

    /* renamed from: a */
    public static final long m93083a(Duration duration) {
        C60944c.m93095h(duration);
        return duration.toMillis() + ((long) (duration.getNano() % f165054a > 0 ? 1 : 0));
    }

    /* renamed from: b */
    public static final Object m93084b(Duration duration, C69577g gVar) {
        Object c = C71608bi.m104551c(m93083a(duration), gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }
}
