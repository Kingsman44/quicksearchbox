package org.chromium.base;

import p000J.C0000N;

/* renamed from: org.chromium.base.j */
/* compiled from: PG */
final class C72384j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f192530a;

    /* renamed from: b */
    final /* synthetic */ JavaHandlerThread f192531b;

    public C72384j(JavaHandlerThread javaHandlerThread, long j) {
        this.f192531b = javaHandlerThread;
        this.f192530a = j;
    }

    public final void run() {
        this.f192531b.f192497a.quit();
        C0000N.MYwg$x8E(this.f192530a);
    }
}
