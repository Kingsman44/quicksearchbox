package com.google.android.libraries.performance.primes.metrics.p2415i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.metrics.p2416j.C31548p;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.t */
/* compiled from: PG */
final class C31527t extends C31521n implements C31313p, C31510c {

    /* renamed from: a */
    private static final Callable f84897a = C31526s.f84896a;

    /* renamed from: b */
    private final C31524q f84898b;

    /* renamed from: c */
    private final C31548p f84899c;

    public C31527t(C31524q qVar, C58833ax axVar) {
        this.f84898b = qVar;
        this.f84899c = (C31548p) ((C69464a) axVar.mo56107c()).mo17428b();
    }

    /* renamed from: e */
    private final void m58769e(C31520m mVar, String str) {
        if (!C31520m.m58749a(mVar) && this.f84899c.mo37221c(str)) {
            mVar.f84874d = true;
        }
    }

    /* renamed from: f */
    private final C60870cx m58770f(C31520m mVar, String str) {
        if (mVar == null || C31520m.m58749a(mVar)) {
            return C60866ct.f164955a;
        }
        if (mVar.f84874d) {
            return this.f84899c.mo37222d(str);
        }
        C31548p pVar = this.f84899c;
        long j = mVar.f84872b;
        pVar.mo37220b(str, j, mVar.f84873c - j);
        return C60866ct.f164955a;
    }

    /* renamed from: g */
    private static void m58771g(C60870cx... cxVarArr) {
        C60856cj.m92895d(cxVarArr).mo57334a(f84897a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final synchronized C31520m mo37209a() {
        C31520m a;
        a = this.f84898b.mo37209a();
        m58769e(a, BuildConfig.FLAVOR);
        return a;
    }

    /* renamed from: b */
    public final C31520m mo37210b(C31164au auVar) {
        C31520m b = this.f84898b.mo37210b(auVar);
        m58769e(b, auVar.f84029a);
        return b;
    }

    /* renamed from: c */
    public final void mo37211c(C31520m mVar, C31164au auVar, C71207aq aqVar, int i) {
        m58771g(this.f84898b.mo37215e(mVar, auVar.f84029a, aqVar, i), m58770f(mVar, auVar.f84029a));
    }

    /* renamed from: d */
    public final void mo37212d(C31164au auVar, int i) {
        m58771g(this.f84898b.mo37216f(auVar.f84029a, i), m58770f((C31520m) this.f84898b.f84887c.get(auVar.f84029a), auVar.f84029a));
    }

    /* renamed from: lm */
    public final C60870cx mo37207lm(C31164au auVar, long j, long j2, C71207aq aqVar) {
        return this.f84898b.mo37207lm(auVar, j, j2, aqVar);
    }

    /* renamed from: ln */
    public final /* synthetic */ void mo29159ln() {
    }
}
