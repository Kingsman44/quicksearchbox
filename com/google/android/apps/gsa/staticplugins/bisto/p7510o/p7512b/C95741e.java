package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.e */
/* compiled from: PG */
public final /* synthetic */ class C95741e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C95759w f268048a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f268049b;

    public /* synthetic */ C95741e(C95759w wVar, Runnable runnable) {
        this.f268048a = wVar;
        this.f268049b = runnable;
    }

    public final Object call() {
        C95759w wVar = this.f268048a;
        Runnable runnable = this.f268049b;
        C22871g gVar = wVar.f268095f;
        Objects.requireNonNull(runnable);
        return gVar.mo28207g("bisto-hotword", new C95738b(runnable));
    }
}
