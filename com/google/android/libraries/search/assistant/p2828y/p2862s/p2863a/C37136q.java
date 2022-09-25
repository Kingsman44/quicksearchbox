package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.common.p4535g.C59203do;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.q */
/* compiled from: PG */
public final class C37136q {

    /* renamed from: a */
    private static final double[] f96731a = new double[100];

    /* renamed from: b */
    private final Instant f96732b;

    static {
        for (int i = 0; i < 100; i++) {
            f96731a[i] = Math.pow(0.9501d, (double) i);
        }
    }

    public C37136q(C60950i iVar) {
        C69664n.m101061g(iVar, "timeSource");
        Instant a = iVar.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        this.f96732b = a;
    }

    /* renamed from: a */
    public final double mo40650a(Instant instant) {
        long days = Duration.between(instant, this.f96732b).toDays();
        if (days >= 100) {
            return C59203do.f157270a;
        }
        if (days < 0) {
            return 1.0d;
        }
        return f96731a[(int) days];
    }
}
