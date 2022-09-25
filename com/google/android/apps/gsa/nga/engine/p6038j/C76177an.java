package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.an */
/* compiled from: PG */
public final /* synthetic */ class C76177an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76185av f211167a;

    /* renamed from: b */
    public final /* synthetic */ C75077bo f211168b;

    public /* synthetic */ C76177an(C76185av avVar, C75077bo boVar) {
        this.f211167a = avVar;
        this.f211168b = boVar;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f211167a.f211180d, new C76172ai(this.f211168b));
    }
}
