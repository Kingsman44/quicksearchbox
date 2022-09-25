package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C22271w implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f61546a;

    public /* synthetic */ C22271w(C22871g gVar) {
        this.f61546a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61546a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("RequestInfoLogging", new C22269u(runnable));
    }
}
