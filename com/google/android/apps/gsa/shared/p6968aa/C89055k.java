package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.aa.k */
/* compiled from: PG */
public final /* synthetic */ class C89055k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f241361a;

    /* renamed from: b */
    public final /* synthetic */ C89068x f241362b;

    public /* synthetic */ C89055k(SettableFuture settableFuture, C89068x xVar) {
        this.f241361a = settableFuture;
        this.f241362b = xVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f241361a;
        C89068x xVar = this.f241362b;
        if (settableFuture.value instanceof C60873d.C60875b) {
            xVar.mo27475d();
        }
    }
}
