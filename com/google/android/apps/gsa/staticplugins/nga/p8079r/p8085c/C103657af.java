package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.af */
/* compiled from: PG */
public final /* synthetic */ class C103657af implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f288739a;

    public /* synthetic */ C103657af(C22871g gVar) {
        this.f288739a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f288739a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] InvocationSuggestionsHandler", new C103659ah(runnable));
    }
}
