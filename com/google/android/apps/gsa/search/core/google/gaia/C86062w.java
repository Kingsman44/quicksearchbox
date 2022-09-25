package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.w */
/* compiled from: PG */
public final /* synthetic */ class C86062w implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232644a;

    public /* synthetic */ C86062w(C86013ax axVar) {
        this.f232644a = axVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f232644a.f232558f;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("LoginHelperImpl::sequenceBroadcasts", new C85990aa(runnable));
    }
}
