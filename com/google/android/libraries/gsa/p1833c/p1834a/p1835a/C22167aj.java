package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C22167aj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f61177a;

    public /* synthetic */ C22167aj(C22871g gVar) {
        this.f61177a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61177a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("start/stop task", new C22165ah(runnable));
    }
}
