package com.google.android.apps.gsa.nga.engine.p6038j;

import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.ao */
/* compiled from: PG */
public final /* synthetic */ class C76178ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76185av f211169a;

    public /* synthetic */ C76178ao(C76185av avVar) {
        this.f211169a = avVar;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f211169a.f211180d, C76176am.f211166a);
    }
}
