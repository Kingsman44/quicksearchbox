package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59407o;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.v */
/* compiled from: PG */
final class C124975v extends C59407o {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f344826a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f344827b;

    public C124975v(AtomicReference atomicReference, C58485gu guVar) {
        this.f344826a = atomicReference;
        this.f344827b = guVar;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        Instant now = Instant.now();
        Duration duration = C124977x.f344836b;
        Instant instant = (Instant) this.f344826a.get();
        if (i < this.f344827b.size() && instant != null) {
            duration = ((Duration) this.f344827b.get(i)).minus(Duration.between(instant, now));
            if (duration.isNegative()) {
                duration = Duration.ZERO;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return duration.toMillis();
    }
}
