package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.notifications.platform.b.b */
/* compiled from: PG */
public final /* synthetic */ class C30062b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Executor f81329a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f81330b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f81331c;

    public /* synthetic */ C30062b(Executor executor, Runnable runnable, SettableFuture settableFuture) {
        this.f81329a = executor;
        this.f81330b = runnable;
        this.f81331c = settableFuture;
    }

    public final void run() {
        this.f81329a.execute(new C30064d(this.f81330b, this.f81331c));
    }
}
