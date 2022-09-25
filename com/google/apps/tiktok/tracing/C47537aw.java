package com.google.apps.tiktok.tracing;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.base.C58838bb;
import java.lang.ref.Reference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.tracing.aw */
/* compiled from: PG */
final class C47537aw implements C47572bw, C47844fy {

    /* renamed from: a */
    public final C47572bw f123378a;

    /* renamed from: b */
    public Thread f123379b;

    /* renamed from: c */
    private final C47843fx f123380c;

    /* renamed from: d */
    private final C47847ga f123381d;

    private C47537aw(C47843fx fxVar, C47537aw awVar) {
        this.f123380c = fxVar;
        this.f123381d = awVar.f123381d;
        this.f123378a = awVar;
        this.f123379b = Thread.currentThread();
    }

    /* renamed from: a */
    public final C47572bw mo51366a() {
        return this.f123378a;
    }

    /* renamed from: b */
    public final String mo51367b() {
        return this.f123380c.f123876a;
    }

    /* renamed from: c */
    public final Thread mo51368c() {
        return this.f123379b;
    }

    public final void close() {
        this.f123379b = null;
        C47831fm.m85018m(this);
    }

    /* renamed from: d */
    public final UUID mo51370d() {
        return this.f123381d.f123892b;
    }

    /* renamed from: e */
    public final int mo51401e() {
        return this.f123380c.f123879d;
    }

    /* renamed from: f */
    public final C47814ew mo51402f() {
        C47845fz b;
        C47847ga gaVar = this.f123381d;
        synchronized (gaVar) {
            b = gaVar.mo51671b();
        }
        return b.f123887d;
    }

    /* renamed from: g */
    public final C47559bj mo51394g(C47560bk bkVar) {
        return C47563bn.m84655i(bkVar, this.f123380c.f123878c);
    }

    /* renamed from: h */
    public final C47572bw mo51395h(String str, C47563bn bnVar, C47833fn fnVar) {
        C47847ga gaVar = this.f123381d;
        C47843fx fxVar = new C47843fx(this.f123380c, str, gaVar.mo51670a(), bnVar);
        loop0:
        while (true) {
            C47843fx fxVar2 = (C47843fx) gaVar.f123895e.get();
            int i = fxVar2.f123879d + 1;
            if (i < gaVar.f123891a.f123778g) {
                fxVar.f123879d = i;
                fxVar.f123880e = fxVar2;
                AtomicReference atomicReference = gaVar.f123895e;
                while (true) {
                    if (atomicReference.compareAndSet(fxVar2, fxVar)) {
                        break loop0;
                    } else if (atomicReference.get() != fxVar2) {
                    }
                }
            } else {
                fxVar.f123879d = -1;
                fxVar.f123880e = null;
                synchronized (gaVar) {
                    gaVar.f123897g++;
                }
                break;
            }
        }
        C47537aw awVar = new C47537aw(fxVar, this);
        if (!C47831fm.m85021p(fnVar, awVar)) {
            awVar.f123380c.f123882g = 3;
        }
        return awVar;
    }

    /* renamed from: i */
    public final void mo51396i(int i) {
        this.f123380c.addAndGet(i);
        Reference.reachabilityFence(this);
    }

    /* renamed from: j */
    public final void mo51397j(boolean z) {
        int a = this.f123381d.mo51670a();
        C47843fx fxVar = this.f123380c;
        int i = a - fxVar.f123877b;
        C58838bb.m90883r(!fxVar.mo51669b());
        fxVar.f123881f = (true != z ? 0 : 1073741824) | LinearLayoutManager.INVALID_OFFSET | (i & 1073741823);
        Reference.reachabilityFence(this);
    }

    /* renamed from: k */
    public final boolean mo51398k() {
        return this.f123381d.f123893c;
    }

    /* renamed from: l */
    public final void mo51399l() {
        this.f123380c.f123882g = 3;
    }

    public final String toString() {
        return C47831fm.m85016k(this);
    }

    public C47537aw(C47843fx fxVar, C47847ga gaVar) {
        this.f123380c = fxVar;
        this.f123381d = gaVar;
        this.f123378a = null;
        this.f123379b = Thread.currentThread();
    }
}
