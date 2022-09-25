package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.z */
/* compiled from: PG */
public final /* synthetic */ class C98706z implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f275697a;

    public /* synthetic */ C98706z(C22871g gVar) {
        this.f275697a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f275697a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("CustomTabsWorkerLightweightExecutor", new C98666i(runnable));
    }
}
