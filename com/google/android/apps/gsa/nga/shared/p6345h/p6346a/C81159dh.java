package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dh */
/* compiled from: PG */
public final /* synthetic */ class C81159dh implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f222280a;

    public /* synthetic */ C81159dh(C22871g gVar) {
        this.f222280a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f222280a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("[NGA] InputPlatePreferencesImpl", new C81155dd(runnable));
    }
}
