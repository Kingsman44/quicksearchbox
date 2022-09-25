package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.understanding.C78974aa;
import com.google.android.apps.gsa.nga.engine.understanding.C78977ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.an */
/* compiled from: PG */
final class C76485an implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f211672a;

    /* renamed from: b */
    final /* synthetic */ C78977ad f211673b;

    /* renamed from: c */
    final /* synthetic */ C76490as f211674c;

    public C76485an(C76490as asVar, C60870cx cxVar, C78977ad adVar) {
        this.f211674c = asVar;
        this.f211672a = cxVar;
        this.f211673b = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!this.f211672a.isCancelled()) {
            ((C58970a) ((C58970a) ((C58970a) this.f211674c.f211679a.mo56225c()).mo56382g(th)).mo56372aa(3577)).mo56386p("Fulfillment orchestration has failed");
        }
        C78977ad adVar = this.f211673b;
        synchronized (adVar.f217236a) {
            if (adVar.f217242g) {
                adVar.f217242g = false;
                Collection.EL.stream(adVar.f217237b).forEach(C78974aa.f217232a);
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
    }
}
