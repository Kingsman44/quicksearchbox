package com.google.android.apps.gsa.p8839t;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.t.d */
/* compiled from: PG */
public final /* synthetic */ class C118349d implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f328499a;

    public /* synthetic */ C118349d(C22871g gVar) {
        this.f328499a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f328499a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("proactive-client-platform-store", new C118347c(runnable));
    }
}
