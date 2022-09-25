package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.libraries.performance.primes.ax */
/* compiled from: PG */
public final class C31167ax {

    /* renamed from: b */
    public static final /* synthetic */ int f84030b = 0;

    /* renamed from: c */
    private static final C59071e f84031c = C59071e.m91332i("com.google.android.libraries.performance.primes.ax");

    /* renamed from: d */
    private static final C31167ax f84032d;

    /* renamed from: e */
    private static volatile boolean f84033e = true;

    /* renamed from: f */
    private static volatile C31167ax f84034f;

    /* renamed from: a */
    public final C31168ay f84035a;

    static {
        C31167ax axVar = new C31167ax(new C31165av());
        f84032d = axVar;
        f84034f = axVar;
    }

    public C31167ax(C31168ay ayVar) {
        ayVar.getClass();
        this.f84035a = ayVar;
    }

    /* renamed from: a */
    public static C31167ax m58112a() {
        if (f84034f == f84032d && f84033e) {
            f84033e = false;
            ((C59052c) ((C59052c) f84031c.mo56224b()).mo56372aa(50337)).mo56386p("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return f84034f;
    }

    /* renamed from: b */
    public static synchronized C31167ax m58113b(C31166aw awVar) {
        C31167ax axVar;
        synchronized (C31167ax.class) {
            if (!m58114g()) {
                if (!C19559g.m37305d(Thread.currentThread())) {
                    ((C59052c) ((C59052c) f84031c.mo56226d()).mo56372aa(50338)).mo56386p("Primes.initialize() should only be called from the main thread.");
                }
                f84034f = awVar.mo36887a();
            }
            axVar = f84034f;
        }
        return axVar;
    }

    /* renamed from: g */
    public static boolean m58114g() {
        return f84034f != f84032d;
    }

    /* renamed from: c */
    public final C31520m mo36912c() {
        return this.f84035a.mo36896a();
    }

    /* renamed from: d */
    public final void mo36913d(C31447f fVar) {
        this.f84035a.mo36899d(fVar);
    }

    /* renamed from: e */
    public final void mo36914e(C31164au auVar) {
        this.f84035a.mo36902g(auVar);
    }

    /* renamed from: f */
    public final void mo36915f(C31164au auVar) {
        this.f84035a.mo36911p(auVar, 1);
    }

    /* renamed from: h */
    public final boolean mo36916h() {
        return this.f84035a.mo36905j();
    }

    /* renamed from: i */
    public final void mo36917i(C31164au auVar) {
        this.f84035a.mo36906k(auVar);
    }

    /* renamed from: j */
    public final void mo36918j(C31520m mVar, C31164au auVar, int i) {
        this.f84035a.mo36910o(mVar, auVar, (C71207aq) null, i);
    }

    /* renamed from: k */
    public final void mo36919k(C31520m mVar, C31164au auVar, C71207aq aqVar, int i) {
        this.f84035a.mo36910o(mVar, auVar, aqVar, i);
    }
}
