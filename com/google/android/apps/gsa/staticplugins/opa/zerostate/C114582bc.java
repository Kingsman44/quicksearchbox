package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bc */
/* compiled from: PG */
public final class C114582bc {

    /* renamed from: a */
    public final AtomicBoolean f317809a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C22871g f317810b;

    /* renamed from: c */
    public final C118561t f317811c;

    public C114582bc(C22871g gVar, C118561t tVar) {
        this.f317810b = gVar;
        this.f317811c = tVar;
    }

    /* renamed from: a */
    public final void mo101439a(Duration duration, Duration duration2) {
        if (!this.f317809a.getAndSet(true)) {
            C58976aa aaVar = C58975e.f156826a;
            duration.toMillis();
            duration2.toMillis();
            this.f317810b.mo28213m("[OPA] scheduleRefreshZeroStateBackgroundTask.schedule", duration.toMillis(), new C114580ba(this, duration2));
        }
    }
}
