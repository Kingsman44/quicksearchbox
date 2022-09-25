package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.d */
/* compiled from: PG */
public final /* synthetic */ class C117690d implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f326666a;

    public /* synthetic */ C117690d(C22871g gVar) {
        this.f326666a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f326666a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("background executor", new C117689c(runnable));
    }
}
