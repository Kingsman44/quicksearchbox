package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.i */
/* compiled from: PG */
public final /* synthetic */ class C77991i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f214783a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f214784b;

    public /* synthetic */ C77991i(C60870cx cxVar, SettableFuture settableFuture) {
        this.f214783a = cxVar;
        this.f214784b = settableFuture;
    }

    public final void run() {
        C60870cx cxVar = this.f214783a;
        SettableFuture settableFuture = this.f214784b;
        try {
            C60856cj.m92909r(cxVar);
            settableFuture.mo57356n(C118826c.f331422a);
        } catch (RuntimeException | ExecutionException e) {
            settableFuture.mo57357o(new IOException(e));
        }
    }
}
