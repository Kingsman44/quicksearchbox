package com.google.android.apps.gsa.staticplugins.bisto.p7517s;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.s.h */
/* compiled from: PG */
public final /* synthetic */ class C95866h implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f268427a;

    public /* synthetic */ C95866h(C22871g gVar) {
        this.f268427a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f268427a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("bisto.HotwordComponent", new C95865g(runnable));
    }
}
