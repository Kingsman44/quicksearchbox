package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bv */
/* compiled from: PG */
public final /* synthetic */ class C90925bv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f254120a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f254121b;

    /* renamed from: c */
    public final /* synthetic */ Callable f254122c;

    public /* synthetic */ C90925bv(C60870cx cxVar, SettableFuture settableFuture, Callable callable) {
        this.f254120a = cxVar;
        this.f254121b = settableFuture;
        this.f254122c = callable;
    }

    public final void run() {
        C60870cx cxVar = this.f254120a;
        SettableFuture settableFuture = this.f254121b;
        Callable callable = this.f254122c;
        if (cxVar.isCancelled()) {
            settableFuture.mo57357o(new CancellationException());
            return;
        }
        try {
            settableFuture.mo57358p((C60870cx) callable.call());
        } catch (Exception e) {
            settableFuture.mo57357o(e);
        }
    }
}
