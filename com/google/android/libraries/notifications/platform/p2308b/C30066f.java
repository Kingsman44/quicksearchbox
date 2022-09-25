package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.platform.b.f */
/* compiled from: PG */
final class C30066f implements Runnable {

    /* renamed from: a */
    final Runnable f81342a = this;

    /* renamed from: b */
    final /* synthetic */ Runnable f81343b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f81344c;

    /* renamed from: d */
    final /* synthetic */ C30068h f81345d;

    /* renamed from: e */
    final /* synthetic */ long f81346e;

    /* renamed from: f */
    final /* synthetic */ TimeUnit f81347f;

    /* renamed from: g */
    final /* synthetic */ C30070j f81348g;

    public C30066f(C30070j jVar, Runnable runnable, SettableFuture settableFuture, C30068h hVar, long j, TimeUnit timeUnit) {
        this.f81348g = jVar;
        this.f81343b = runnable;
        this.f81344c = settableFuture;
        this.f81345d = hVar;
        this.f81346e = j;
        this.f81347f = timeUnit;
    }

    public final void run() {
        this.f81348g.execute(new C30065e(this, this.f81343b, this.f81344c, this.f81345d, this.f81346e, this.f81347f));
    }
}
