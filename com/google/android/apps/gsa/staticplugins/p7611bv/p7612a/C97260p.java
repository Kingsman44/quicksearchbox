package com.google.android.apps.gsa.staticplugins.p7611bv.p7612a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.a.p */
/* compiled from: PG */
public final /* synthetic */ class C97260p implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f271670a;

    public /* synthetic */ C97260p(C22871g gVar) {
        this.f271670a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f271670a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("mdh-gmscore-executor", new C97259o(runnable));
    }
}
