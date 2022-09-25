package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bw */
/* compiled from: PG */
public final /* synthetic */ class C118006bw implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C118024cn f327509a;

    public /* synthetic */ C118006bw(C118024cn cnVar) {
        this.f327509a = cnVar;
    }

    public final void execute(Runnable runnable) {
        C22871g gVar = this.f327509a.f327551j;
        Objects.requireNonNull(runnable);
        gVar.mo28212l("background executor", new C118003bt(runnable));
    }
}
