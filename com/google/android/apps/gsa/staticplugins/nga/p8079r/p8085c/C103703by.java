package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.by */
/* compiled from: PG */
public final /* synthetic */ class C103703by implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f288824a;

    public /* synthetic */ C103703by(C22871g gVar) {
        this.f288824a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f288824a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] QuickActionsHandler", new C103700bv(runnable));
    }
}
