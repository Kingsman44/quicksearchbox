package com.google.android.apps.gsa.staticplugins.p7681cm;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.ak */
/* compiled from: PG */
public final /* synthetic */ class C97950ak implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C97962aw f273507a;

    public /* synthetic */ C97950ak(C97962aw awVar) {
        this.f273507a = awVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f273507a.f273533d;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("handleGabPreferenceFuture", new C97955ap(runnable));
    }
}
