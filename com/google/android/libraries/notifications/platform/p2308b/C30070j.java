package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.C60844by;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.platform.b.j */
/* compiled from: PG */
public final class C30070j extends C60844by implements C60888db {

    /* renamed from: b */
    public static final /* synthetic */ int f81352b = 0;

    /* renamed from: a */
    public final C60888db f81353a;

    /* renamed from: c */
    private final C60887da f81354c;

    public C30070j(C60887da daVar, C60888db dbVar) {
        this.f81354c = daVar;
        this.f81353a = dbVar;
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C60871cy cyVar = new C60871cy(runnable);
        if (j <= 0) {
            return new C30069i(this.f81354c.mo19398a(runnable), System.nanoTime());
        }
        return new C30068h(cyVar, this.f81353a.mo29164d(new C30061a(this, cyVar), j, timeUnit));
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new C30069i(this.f81354c.mo19399b(callable), System.nanoTime());
        }
        C60871cy cyVar = new C60871cy(callable);
        return new C30068h(cyVar, this.f81353a.mo29164d(new C30063c(this, cyVar), j, timeUnit));
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C60904dr drVar = new C60904dr(this);
        SettableFuture settableFuture = new SettableFuture();
        Runnable runnable2 = runnable;
        return new C30068h(settableFuture, this.f81353a.mo29166f(new C30062b(drVar, runnable, settableFuture), j, j2, timeUnit));
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        C30068h hVar = new C30068h(settableFuture, (C60872cz) null);
        long j3 = j;
        hVar.f81350a = this.f81353a.mo29164d(new C30066f(this, runnable, settableFuture, hVar, j2, timeUnit), j, timeUnit);
        return hVar;
    }

    /* renamed from: h */
    public final C60887da mo29168h() {
        return this.f81354c;
    }

    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f81354c;
    }

    /* renamed from: i */
    public final /* synthetic */ ExecutorService mo29169i() {
        return this.f81354c;
    }
}
