package com.google.android.apps.gsa.nga.engine.p6243v.p6244a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.a.j */
/* compiled from: PG */
public final /* synthetic */ class C79345j implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C79351p f217868a;

    public /* synthetic */ C79345j(C79351p pVar) {
        this.f217868a = pVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f217868a.f217877b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaLifecycleManager.lifecycleFuture", new C79348m(runnable));
    }
}
