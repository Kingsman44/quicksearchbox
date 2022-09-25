package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.s */
/* compiled from: PG */
public final /* synthetic */ class C98699s implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f275687a;

    public /* synthetic */ C98699s(C22871g gVar) {
        this.f275687a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f275687a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("CustomTabsWorkerBackgroundExecutor", new C98666i(runnable));
    }
}
