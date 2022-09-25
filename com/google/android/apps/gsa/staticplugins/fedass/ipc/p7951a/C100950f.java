package com.google.android.apps.gsa.staticplugins.fedass.ipc.p7951a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.a.f */
/* compiled from: PG */
public final /* synthetic */ class C100950f implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C100963s f282002a;

    public /* synthetic */ C100950f(C100963s sVar) {
        this.f282002a = sVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f282002a.f282020b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[FedAss] Unbind TrainCommServ", new C100956l(runnable));
    }
}
