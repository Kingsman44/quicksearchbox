package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ea */
/* compiled from: PG */
public final class C6894ea {

    /* renamed from: a */
    private final C6892dz f21948a;

    /* renamed from: b */
    private final C6891dy f21949b;

    /* renamed from: c */
    private final C6912es f21950c;

    /* renamed from: d */
    private int f21951d;

    /* renamed from: e */
    private Object f21952e;

    /* renamed from: f */
    private final Handler f21953f;

    /* renamed from: g */
    private final int f21954g;

    /* renamed from: h */
    private final long f21955h = -9223372036854775807L;

    /* renamed from: i */
    private final boolean f21956i = true;

    /* renamed from: j */
    private boolean f21957j;

    /* renamed from: k */
    private boolean f21958k;

    /* renamed from: l */
    private boolean f21959l;

    public C6894ea(C6891dy dyVar, C6892dz dzVar, C6912es esVar, int i, Handler handler) {
        this.f21949b = dyVar;
        this.f21948a = dzVar;
        this.f21950c = esVar;
        this.f21953f = handler;
        this.f21954g = i;
    }

    /* renamed from: a */
    public final C6912es mo15764a() {
        return this.f21950c;
    }

    /* renamed from: b */
    public final C6892dz mo15765b() {
        return this.f21948a;
    }

    /* renamed from: c */
    public final int mo15766c() {
        return this.f21951d;
    }

    /* renamed from: d */
    public final Object mo15767d() {
        return this.f21952e;
    }

    /* renamed from: e */
    public final Handler mo15768e() {
        return this.f21953f;
    }

    /* renamed from: f */
    public final long mo15769f() {
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final int mo15770g() {
        return this.f21954g;
    }

    /* renamed from: h */
    public final boolean mo15771h() {
        return true;
    }

    /* renamed from: i */
    public final synchronized boolean mo15772i() {
        return false;
    }

    /* renamed from: j */
    public final synchronized void mo15773j(boolean z) {
        this.f21958k = z | this.f21958k;
        this.f21959l = true;
        notifyAll();
    }

    /* renamed from: k */
    public final synchronized void mo15774k(long j) {
        mo15775l(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final synchronized boolean mo15775l(long j) {
        ary.m19464q(this.f21957j);
        ary.m19464q(this.f21953f.getLooper().getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.f21959l) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f21958k;
    }

    /* renamed from: m */
    public final void mo15776m() {
        ary.m19464q(!this.f21957j);
        ary.m19462o(true);
        this.f21957j = true;
        this.f21949b.mo15592g(this);
    }

    /* renamed from: n */
    public final void mo15777n(Object obj) {
        ary.m19464q(!this.f21957j);
        this.f21952e = obj;
    }

    /* renamed from: o */
    public final void mo15778o(int i) {
        ary.m19464q(!this.f21957j);
        this.f21951d = i;
    }
}
