package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.y */
/* compiled from: PG */
public final /* synthetic */ class C86064y implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232647a;

    public /* synthetic */ C86064y(C86013ax axVar) {
        this.f232647a = axVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f232647a.f232556d;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("LoginHelperImpl::sendBroadcast(SEARCH_APP_PACKAGE)", new C85990aa(runnable));
    }
}
