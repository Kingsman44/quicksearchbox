package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.x */
/* compiled from: PG */
public final /* synthetic */ class C22272x implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f61547a;

    public /* synthetic */ C22272x(C22871g gVar) {
        this.f61547a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f61547a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("RequestInfoLogging", new C22269u(runnable));
    }
}
