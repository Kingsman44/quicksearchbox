package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c;

import com.google.common.p4522b.C58485gu;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.c.c */
/* compiled from: PG */
public final /* synthetic */ class C122763c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122766f f340078a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f340079b;

    public /* synthetic */ C122763c(C122766f fVar, C65753ak akVar) {
        this.f340078a = fVar;
        this.f340079b = akVar;
    }

    public final void run() {
        C58485gu j;
        C122766f fVar = this.f340078a;
        C65753ak akVar = this.f340079b;
        synchronized (fVar) {
            j = C58485gu.m89842j(fVar.f340083b);
        }
        Collection.EL.forEach(j, new C122765e(akVar));
    }
}
