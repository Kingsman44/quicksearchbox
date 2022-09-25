package com.google.android.libraries.p1963i;

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

/* renamed from: com.google.android.libraries.i.ac */
/* compiled from: PG */
public final class C23828ac extends C60844by implements C60888db {

    /* renamed from: b */
    public static final /* synthetic */ int f65247b = 0;

    /* renamed from: a */
    public final C60888db f65248a;

    /* renamed from: c */
    private final C60887da f65249c;

    public C23828ac(C60887da daVar, C60888db dbVar) {
        this.f65249c = daVar;
        this.f65248a = dbVar;
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C60871cy cyVar = new C60871cy(runnable);
        if (j <= 0) {
            return new C23827ab(this.f65249c.mo19398a(runnable), System.nanoTime());
        }
        return new C23826aa(cyVar, this.f65248a.mo29164d(new C23917u(this, cyVar), j, timeUnit));
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new C23827ab(this.f65249c.mo19399b(callable), System.nanoTime());
        }
        C60871cy cyVar = new C60871cy(callable);
        return new C23826aa(cyVar, this.f65248a.mo29164d(new C23918v(this, cyVar), j, timeUnit));
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C60904dr drVar = new C60904dr(this);
        SettableFuture settableFuture = new SettableFuture();
        Runnable runnable2 = runnable;
        return new C23826aa(settableFuture, this.f65248a.mo29166f(new C23919w(drVar, runnable, settableFuture), j, j2, timeUnit));
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        C23826aa aaVar = new C23826aa(settableFuture, (C60872cz) null);
        long j3 = j;
        aaVar.f65245a = this.f65248a.mo29164d(new C23921y(this, runnable, settableFuture, aaVar, j2, timeUnit), j, timeUnit);
        return aaVar;
    }

    /* renamed from: h */
    public final C60887da mo29168h() {
        return this.f65249c;
    }

    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f65249c;
    }

    /* renamed from: i */
    public final /* synthetic */ ExecutorService mo29169i() {
        return this.f65249c;
    }
}
