package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59407o;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ez */
/* compiled from: PG */
final class C96203ez extends C59407o {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f269278a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f269279b;

    /* renamed from: c */
    final /* synthetic */ C96206fb f269280c;

    public C96203ez(C96206fb fbVar, AtomicReference atomicReference, C58485gu guVar) {
        this.f269280c = fbVar;
        this.f269278a = atomicReference;
        this.f269279b = guVar;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        Instant a = this.f269280c.f269299n.mo57444a();
        Duration duration = C96206fb.f269287b;
        Instant instant = (Instant) this.f269278a.get();
        if (i < this.f269279b.size() && instant != null) {
            duration = ((Duration) this.f269279b.get(i)).minus(Duration.between(instant, a));
            if (duration.isNegative()) {
                duration = Duration.ZERO;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return duration.toMillis();
    }
}
