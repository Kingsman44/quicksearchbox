package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cp */
/* compiled from: PG */
public final /* synthetic */ class C103970cp implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289360a;

    public /* synthetic */ C103970cp(C104026er erVar) {
        this.f289360a = erVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f289360a.f289448b;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] NgaInitialDownloader.enqueueAction", new C104001dt(runnable));
    }
}
