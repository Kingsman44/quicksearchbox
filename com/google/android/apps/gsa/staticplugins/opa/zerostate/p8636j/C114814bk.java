package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bk */
/* compiled from: PG */
public final /* synthetic */ class C114814bk implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f318576a;

    public /* synthetic */ C114814bk(C22871g gVar) {
        this.f318576a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f318576a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("opa-chip-use-store-update", new C114812bi(runnable));
    }
}
