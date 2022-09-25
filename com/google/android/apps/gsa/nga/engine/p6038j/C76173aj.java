package com.google.android.apps.gsa.nga.engine.p6038j;

import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.aj */
/* compiled from: PG */
public final /* synthetic */ class C76173aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76185av f211162a;

    public /* synthetic */ C76173aj(C76185av avVar) {
        this.f211162a = avVar;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f211162a.f211180d, C76171ah.f211160a);
    }
}
