package com.google.apps.tiktok.concurrent;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.concurrent.aj */
/* compiled from: PG */
public final class C46423aj {

    /* renamed from: a */
    public final C46420ag f121484a;

    /* renamed from: b */
    public final AtomicLong f121485b = new AtomicLong(m82774a(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET));

    /* renamed from: c */
    public final AtomicReference f121486c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final SettableFuture f121487d;

    /* renamed from: e */
    private final AtomicReference f121488e = new AtomicReference((Object) null);

    /* renamed from: f */
    private final Executor f121489f = new C60904dr(C60826bg.f164896a);

    public C46423aj(C60930r rVar, Executor executor) {
        SettableFuture settableFuture = new SettableFuture();
        this.f121487d = settableFuture;
        C46420ag agVar = new C46420ag(rVar, executor);
        this.f121484a = agVar;
        settableFuture.mo4106b(agVar, C60826bg.f164896a);
    }

    /* renamed from: a */
    public static long m82774a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* renamed from: b */
    public final C60870cx mo50395b() {
        long j;
        int i;
        C60870cx cxVar;
        if (this.f121487d.isDone()) {
            return this.f121487d;
        }
        do {
            j = this.f121485b.get();
            i = (int) (j >>> 32);
        } while (!this.f121485b.compareAndSet(j, m82774a(i, ((int) j) + 1)));
        SettableFuture settableFuture = new SettableFuture();
        C60870cx cxVar2 = (C60870cx) this.f121488e.getAndSet(settableFuture);
        if (cxVar2 == null) {
            cxVar = C60856cj.m92905n(C47810es.m84965e(new C46418ae(this, i)), C60826bg.f164896a);
        } else {
            cxVar = C60846c.m92879h(cxVar2, Throwable.class, C47810es.m84966f(new C46419af(this, i)), this.f121489f);
        }
        settableFuture.mo57358p(cxVar);
        C46421ah ahVar = new C46421ah(this, i);
        settableFuture.mo4106b(new C46417ad(this, settableFuture, ahVar), C60826bg.f164896a);
        return ahVar;
    }

    /* renamed from: c */
    public final C60870cx mo50396c(int i) {
        C46422ai aiVar;
        if (((int) (this.f121485b.get() >>> 32)) > i) {
            return C60856cj.m92898g();
        }
        C46422ai aiVar2 = new C46422ai(i);
        do {
            aiVar = (C46422ai) this.f121486c.get();
            if (aiVar != null && aiVar.f121483a > i) {
                return C60856cj.m92898g();
            }
        } while (!C46416ac.m82770a(this.f121486c, aiVar, aiVar2));
        if (((int) (this.f121485b.get() >>> 32)) > i) {
            aiVar2.cancel(true);
            C46416ac.m82770a(this.f121486c, aiVar2, (Object) null);
            return aiVar2;
        }
        C46420ag agVar = this.f121484a;
        C60930r rVar = agVar.f121479a;
        Executor executor = agVar.f121480b;
        if (rVar == null || executor == null) {
            aiVar2.mo57358p(this.f121487d);
        } else {
            aiVar2.mo57358p(C60856cj.m92905n(C47810es.m84965e(rVar), executor));
        }
        return aiVar2;
    }
}
