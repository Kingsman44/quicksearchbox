package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.notifications.platform.b.d */
/* compiled from: PG */
public final /* synthetic */ class C30064d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f81334a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f81335b;

    public /* synthetic */ C30064d(Runnable runnable, SettableFuture settableFuture) {
        this.f81334a = runnable;
        this.f81335b = settableFuture;
    }

    public final void run() {
        Runnable runnable = this.f81334a;
        SettableFuture settableFuture = this.f81335b;
        int i = C30070j.f81352b;
        try {
            runnable.run();
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
        }
    }
}
