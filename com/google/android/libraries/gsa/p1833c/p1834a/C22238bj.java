package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C22238bj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22239bk f61401a;

    public /* synthetic */ C22238bj(C22239bk bkVar) {
        this.f61401a = bkVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61401a.f61409j;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("gRPC ManagedChannel builder", new C22230bb(runnable));
    }
}
