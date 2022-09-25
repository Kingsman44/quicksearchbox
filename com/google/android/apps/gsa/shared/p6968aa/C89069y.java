package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.aa.y */
/* compiled from: PG */
public final /* synthetic */ class C89069y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f241384a;

    /* renamed from: b */
    public final /* synthetic */ C89068x f241385b;

    public /* synthetic */ C89069y(SettableFuture settableFuture, C89068x xVar) {
        this.f241384a = settableFuture;
        this.f241385b = xVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f241384a;
        C89068x xVar = this.f241385b;
        if (settableFuture.value instanceof C60873d.C60875b) {
            xVar.mo27475d();
        }
    }
}
