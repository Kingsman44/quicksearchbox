package com.google.common.p4580v;

import com.google.common.base.C58893dc;
import p3186j$.time.Duration;

/* renamed from: com.google.common.v.f */
/* compiled from: PG */
public enum C60947f implements C60946e {
    ;

    private C60947f() {
    }

    /* renamed from: a */
    public final void mo57442a(Duration duration) {
        C60944c.m93095h(duration);
        try {
            long millis = duration.toMillis();
            Duration minusMillis = duration.minusMillis(millis);
            C58893dc.m90997b(minusMillis.getSeconds() == 0);
            Thread.sleep(millis, minusMillis.getNano());
        } catch (ArithmeticException unused) {
            Thread.sleep(Long.MAX_VALUE);
        }
    }

    public final String toString() {
        return "Sleeper.defaultSleeper()";
    }
}
