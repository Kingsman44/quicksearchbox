package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.r */
/* compiled from: PG */
public final /* synthetic */ class C86057r implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232636a;

    public /* synthetic */ C86057r(C86013ax axVar) {
        this.f232636a = axVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f232636a.f232557e;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("blockingExecutor", new C85990aa(runnable));
    }
}
