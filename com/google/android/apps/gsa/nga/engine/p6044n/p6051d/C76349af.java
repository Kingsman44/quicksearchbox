package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.af */
/* compiled from: PG */
public final /* synthetic */ class C76349af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76363at f211444a;

    /* renamed from: b */
    public final /* synthetic */ C80401n f211445b;

    /* renamed from: c */
    public final /* synthetic */ C76401e f211446c;

    public /* synthetic */ C76349af(C76363at atVar, C80401n nVar, C76401e eVar) {
        this.f211444a = atVar;
        this.f211445b = nVar;
        this.f211446c = eVar;
    }

    public final void run() {
        C76363at atVar = this.f211444a;
        C81442m.m129549k(this.f211445b, C80294ap.REPORT_AUM_RESULTS_OP).ifPresent(new C76356am(atVar, this.f211446c));
    }
}
