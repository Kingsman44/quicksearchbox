package com.google.android.apps.gsa.staticplugins.p7918em;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.em.b */
/* compiled from: PG */
public final /* synthetic */ class C100550b implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f281136a;

    public /* synthetic */ C100550b(C22871g gVar) {
        this.f281136a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f281136a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("vaa-consent-status-pds-update", new C100551c(runnable));
    }
}
