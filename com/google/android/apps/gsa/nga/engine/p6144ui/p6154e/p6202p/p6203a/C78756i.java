package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6202p.p6203a;

import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.p.a.i */
/* compiled from: PG */
public final /* synthetic */ class C78756i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78757j f216805a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f216806b;

    public /* synthetic */ C78756i(C78757j jVar, SettableFuture settableFuture) {
        this.f216805a = jVar;
        this.f216806b = settableFuture;
    }

    public final void run() {
        C78757j jVar = this.f216805a;
        SettableFuture settableFuture = this.f216806b;
        jVar.f216808b.mo76660b(true);
        jVar.mo73609g(true);
        jVar.f216809c.mo28213m("[NGA] Timeout for UI to be suppressed.", jVar.f216810d.mo85399d(C90040cs.f248642I), new C78754g(jVar, settableFuture));
    }
}
