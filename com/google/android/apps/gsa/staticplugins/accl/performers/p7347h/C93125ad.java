package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ad */
/* compiled from: PG */
public final /* synthetic */ class C93125ad implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C22871g f259760a;

    public /* synthetic */ C93125ad(C22871g gVar) {
        this.f259760a = gVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f259760a;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("background executor", new C93123ab(runnable));
    }
}
