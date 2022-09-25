package com.google.android.libraries.performance.primes.metrics.p2413g;

import android.os.Handler;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.p */
/* compiled from: PG */
final class C31475p {

    /* renamed from: a */
    public final C21370a f84759a;

    /* renamed from: b */
    public final C31463d f84760b;

    /* renamed from: c */
    public final Handler f84761c;

    /* renamed from: d */
    public final C31310m f84762d;

    /* renamed from: e */
    public int f84763e = 0;

    /* renamed from: f */
    public long f84764f = -1;

    /* renamed from: g */
    public volatile long f84765g = -1;

    /* renamed from: h */
    volatile boolean f84766h = false;

    /* renamed from: i */
    final AtomicReference f84767i = new AtomicReference(C60866ct.f164955a);

    /* renamed from: j */
    private final C60888db f84768j;

    public C31475p(C21370a aVar, C60888db dbVar, C31463d dVar, C31310m mVar, Handler handler) {
        this.f84759a = aVar;
        this.f84768j = dbVar;
        this.f84760b = dVar;
        this.f84761c = handler;
        this.f84762d = mVar;
    }

    /* renamed from: a */
    public final void mo37172a(Runnable runnable, int i) {
        if (this.f84766h) {
            SettableFuture settableFuture = new SettableFuture();
            this.f84767i.set(settableFuture);
            if (this.f84766h) {
                settableFuture.mo57358p(this.f84768j.mo29164d(runnable, (long) i, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37173b() {
        if (!this.f84766h) {
            this.f84766h = true;
            this.f84767i.set(C60856cj.m92903l(new C31474o(this), this.f84768j));
        }
    }
}
