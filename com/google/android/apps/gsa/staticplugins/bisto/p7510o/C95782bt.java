package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bt */
/* compiled from: PG */
public final /* synthetic */ class C95782bt implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C95786bx f268201a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f268202b;

    public /* synthetic */ C95782bt(C95786bx bxVar, Runnable runnable) {
        this.f268201a = bxVar;
        this.f268202b = runnable;
    }

    public final Object call() {
        C95786bx bxVar = this.f268201a;
        Runnable runnable = this.f268202b;
        C22871g gVar = bxVar.f268208b;
        Objects.requireNonNull(runnable);
        return gVar.mo28207g("audio-decoder", new C95781bs(runnable));
    }
}
