package com.google.android.gms.analytics;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.analytics.n */
/* compiled from: PG */
public final class C142761n extends ThreadPoolExecutor {

    /* renamed from: a */
    final /* synthetic */ C142764q f387396a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C142761n(C142764q qVar) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f387396a = qVar;
        setThreadFactory(new C142762o());
        allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C142760m(this, runnable, obj);
    }
}
