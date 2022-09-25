package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.q */
/* compiled from: PG */
public final /* synthetic */ class C97294q implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C97302y f271719a;

    public /* synthetic */ C97294q(C97302y yVar) {
        this.f271719a = yVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f271719a.f271733a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("subscribe", new C97298u(runnable));
    }
}
