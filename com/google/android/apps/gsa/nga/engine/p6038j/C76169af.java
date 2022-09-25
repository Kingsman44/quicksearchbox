package com.google.android.apps.gsa.nga.engine.p6038j;

import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.af */
/* compiled from: PG */
public final /* synthetic */ class C76169af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76185av f211157a;

    public /* synthetic */ C76169af(C76185av avVar) {
        this.f211157a = avVar;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f211157a.f211180d, C76175al.f211165a);
    }
}
