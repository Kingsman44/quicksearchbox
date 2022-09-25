package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.av */
/* compiled from: PG */
public final class C94873av {

    /* renamed from: a */
    public final AtomicInteger f265322a = new AtomicInteger(0);

    /* renamed from: b */
    public final AtomicInteger f265323b = new AtomicInteger(0);

    /* renamed from: c */
    public final AtomicInteger f265324c = new AtomicInteger(0);

    /* renamed from: d */
    public final AtomicInteger f265325d = new AtomicInteger(0);

    /* renamed from: e */
    public final AtomicInteger f265326e = new AtomicInteger(0);

    /* renamed from: f */
    public final AtomicInteger f265327f = new AtomicInteger(0);

    /* renamed from: g */
    public final AtomicInteger f265328g = new AtomicInteger(0);

    /* renamed from: h */
    public final AtomicInteger f265329h = new AtomicInteger(0);

    /* renamed from: i */
    public final AtomicInteger f265330i = new AtomicInteger(0);

    /* renamed from: j */
    public final AtomicInteger f265331j = new AtomicInteger(0);

    /* renamed from: k */
    public final AtomicInteger f265332k = new AtomicInteger(0);

    /* renamed from: l */
    public final AtomicInteger f265333l = new AtomicInteger(0);

    /* renamed from: m */
    public final AtomicInteger f265334m = new AtomicInteger(0);

    /* renamed from: n */
    public final AtomicInteger f265335n = new AtomicInteger(0);

    /* renamed from: o */
    public final AtomicInteger f265336o = new AtomicInteger(0);

    /* renamed from: p */
    public final AtomicInteger f265337p = new AtomicInteger(0);

    /* renamed from: q */
    public final AtomicBoolean f265338q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicInteger f265339r = new AtomicInteger(0);

    /* renamed from: s */
    private final AtomicInteger f265340s = new AtomicInteger(0);

    /* renamed from: t */
    private final C58872ci f265341t;

    /* renamed from: u */
    private final C58872ci f265342u;

    public C94873av(C58889cz czVar) {
        this.f265341t = new C58872ci(czVar);
        this.f265342u = new C58872ci(czVar);
    }

    /* renamed from: l */
    private static void m156534l(C58872ci ciVar) {
        if (!ciVar.f156708a) {
            ciVar.mo56161f();
        }
    }

    /* renamed from: m */
    private final void m156535m(C58872ci ciVar) {
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            this.f265338q.set(true);
        }
    }

    /* renamed from: a */
    public final synchronized int mo88718a() {
        return this.f265340s.getAndSet(0);
    }

    /* renamed from: b */
    public final synchronized int mo88719b() {
        return this.f265339r.getAndSet(0);
    }

    /* renamed from: c */
    public final synchronized Duration mo88720c() {
        return m156533k(this.f265342u);
    }

    /* renamed from: d */
    public final synchronized Duration mo88721d() {
        return m156533k(this.f265341t);
    }

    /* renamed from: e */
    public final synchronized void mo88722e() {
        this.f265338q.set(true);
        this.f265339r.getAndIncrement();
    }

    /* renamed from: f */
    public final synchronized void mo88723f() {
        this.f265338q.set(true);
        this.f265340s.getAndIncrement();
    }

    /* renamed from: g */
    public final synchronized void mo88724g() {
        m156534l(this.f265342u);
    }

    /* renamed from: h */
    public final synchronized void mo88725h() {
        m156534l(this.f265341t);
    }

    /* renamed from: i */
    public final synchronized void mo88726i() {
        m156535m(this.f265342u);
    }

    /* renamed from: j */
    public final synchronized void mo88727j() {
        m156535m(this.f265341t);
    }

    /* renamed from: k */
    private static Duration m156533k(C58872ci ciVar) {
        if (ciVar.f156708a) {
            return Duration.ZERO;
        }
        Duration ofNanos = Duration.ofNanos(ciVar.mo56159b());
        ciVar.mo56160e();
        return ofNanos;
    }
}
