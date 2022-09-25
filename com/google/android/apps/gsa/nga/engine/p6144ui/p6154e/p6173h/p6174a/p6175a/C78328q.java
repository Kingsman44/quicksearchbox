package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82443fj;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C78328q implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78335x f215647a;

    /* renamed from: b */
    public final /* synthetic */ Instant f215648b;

    public /* synthetic */ C78328q(C78335x xVar, Instant instant) {
        this.f215647a = xVar;
        this.f215648b = instant;
    }

    public final void run() {
        C78335x xVar = this.f215647a;
        xVar.f215665i.mo75579d(new C82443fj("NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIME", Double.valueOf((double) Duration.between(this.f215648b, xVar.f215666j.mo57444a()).toMillis())));
    }
}
