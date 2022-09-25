package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ba */
/* compiled from: PG */
public final /* synthetic */ class C114580ba implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114582bc f317806a;

    /* renamed from: b */
    public final /* synthetic */ Duration f317807b;

    public /* synthetic */ C114580ba(C114582bc bcVar, Duration duration) {
        this.f317806a = bcVar;
        this.f317807b = duration;
    }

    public final void run() {
        C114582bc bcVar = this.f317806a;
        bcVar.f317810b.mo28213m("[OPA] scheduleRefreshZeroStateBackgroundTask.rebound", this.f317807b.toMillis(), new C114581bb(bcVar));
        C58976aa aaVar = C58975e.f156826a;
        bcVar.f317811c.mo103754e(C118522by.REFRESH_ZERO_STATE, C118472ag.f328819i);
    }
}
