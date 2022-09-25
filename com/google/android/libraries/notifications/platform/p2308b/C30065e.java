package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.platform.b.e */
/* compiled from: PG */
public final /* synthetic */ class C30065e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30066f f81336a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f81337b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f81338c;

    /* renamed from: d */
    public final /* synthetic */ C30068h f81339d;

    /* renamed from: e */
    public final /* synthetic */ long f81340e;

    /* renamed from: f */
    public final /* synthetic */ TimeUnit f81341f;

    public /* synthetic */ C30065e(C30066f fVar, Runnable runnable, SettableFuture settableFuture, C30068h hVar, long j, TimeUnit timeUnit) {
        this.f81336a = fVar;
        this.f81337b = runnable;
        this.f81338c = settableFuture;
        this.f81339d = hVar;
        this.f81340e = j;
        this.f81341f = timeUnit;
    }

    public final void run() {
        C30066f fVar = this.f81336a;
        Runnable runnable = this.f81337b;
        SettableFuture settableFuture = this.f81338c;
        C30068h hVar = this.f81339d;
        long j = this.f81340e;
        TimeUnit timeUnit = this.f81341f;
        try {
            runnable.run();
            if (!settableFuture.isDone()) {
                C60872cz d = fVar.f81348g.f81353a.mo29164d(fVar.f81342a, j, timeUnit);
                hVar.f81350a = d;
                if (hVar.isDone()) {
                    d.cancel(false);
                }
            }
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
        }
    }
}
