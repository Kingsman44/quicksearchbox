package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ah */
/* compiled from: PG */
public final /* synthetic */ class C85997ah implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232518a;

    public /* synthetic */ C85997ah(C86013ax axVar) {
        this.f232518a = axVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f232518a.f232556d;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("LoginHelperImpl::notifySignedInAccountChanged", new C85990aa(runnable));
    }
}
