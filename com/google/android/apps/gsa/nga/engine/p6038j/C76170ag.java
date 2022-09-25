package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.ag */
/* compiled from: PG */
public final /* synthetic */ class C76170ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76185av f211158a;

    /* renamed from: b */
    public final /* synthetic */ C124445ap f211159b;

    public /* synthetic */ C76170ag(C76185av avVar, C124445ap apVar) {
        this.f211158a = avVar;
        this.f211159b = apVar;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f211158a.f211180d, new C76168ae(this.f211159b));
    }
}
