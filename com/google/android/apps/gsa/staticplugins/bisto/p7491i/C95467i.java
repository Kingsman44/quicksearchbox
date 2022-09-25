package com.google.android.apps.gsa.staticplugins.bisto.p7491i;

import com.google.common.p4543n.p4545b.C59365af;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i.i */
/* compiled from: PG */
final class C95467i extends C59407o {

    /* renamed from: a */
    final /* synthetic */ C60950i f267141a;

    /* renamed from: b */
    final /* synthetic */ C95469k f267142b;

    public C95467i(C95469k kVar, C60950i iVar) {
        this.f267142b = kVar;
        this.f267141a = iVar;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        Instant a = this.f267141a.mo57444a();
        Instant instant = (Instant) this.f267142b.f267153e.get();
        Duration duration = C95469k.f267149b;
        Duration ofMillis = Duration.ofMillis(C95469k.f267150c.mo56909a(i));
        ofMillis.getClass();
        if (C59365af.m92281a(C95469k.f267149b, ofMillis) && instant != null) {
            duration = Duration.ofMillis(C95469k.f267150c.mo56909a(i)).minus(Duration.between(instant, a));
            if (duration.isNegative()) {
                duration = Duration.ZERO;
            }
        }
        return duration.toMillis();
    }
}
