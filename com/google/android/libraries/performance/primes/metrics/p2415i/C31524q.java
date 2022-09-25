package com.google.android.libraries.performance.primes.metrics.p2415i;

import android.os.SystemClock;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2402g.C31242e;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71309ek;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71310el;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.q */
/* compiled from: PG */
final class C31524q extends C31521n implements C31313p, C31510c {

    /* renamed from: a */
    static final C58528ij f84883a = C58528ij.m90015O("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");

    /* renamed from: f */
    public static final /* synthetic */ int f84884f = 0;

    /* renamed from: g */
    private static final C59071e f84885g = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.i.q");

    /* renamed from: b */
    public final C31310m f84886b;

    /* renamed from: c */
    final ConcurrentHashMap f84887c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C68214a f84888d;

    /* renamed from: e */
    public final C58881cr f84889e;

    /* renamed from: h */
    private final Executor f84890h;

    public C31524q(C31311n nVar, Executor executor, C68214a aVar, C69464a aVar2, C31242e eVar) {
        this.f84886b = nVar.mo37026a(C60826bg.f164896a, aVar, aVar2);
        this.f84890h = executor;
        this.f84888d = aVar;
        this.f84889e = C58886cw.m90973a(new C31523p(eVar, aVar));
    }

    /* renamed from: g */
    private static C71308ej m58757g(C31520m mVar) {
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        C71309ek ekVar = (C71309ek) C71310el.f190441d.createBuilder();
        long j = mVar.f84873c;
        long j2 = mVar.f84872b;
        ekVar.copyOnWrite();
        C71310el elVar = (C71310el) ekVar.instance;
        int i = 1;
        elVar.f190443a |= 1;
        elVar.f190444b = j - j2;
        int i2 = mVar.f84875e;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = 2;
                } else if (i3 == 2) {
                    i = 3;
                } else if (i3 == 3) {
                    i = 4;
                }
            }
            ekVar.copyOnWrite();
            C71310el elVar2 = (C71310el) ekVar.instance;
            elVar2.f190445c = i - 1;
            elVar2.f190443a = 2 | elVar2.f190443a;
            C71310el elVar3 = (C71310el) ekVar.build();
            eiVar.copyOnWrite();
            C71308ej ejVar = (C71308ej) eiVar.instance;
            elVar3.getClass();
            ejVar.f190421f = elVar3;
            ejVar.f190416a |= 16;
            return (C71308ej) eiVar.build();
        }
        throw null;
    }

    /* renamed from: h */
    private final C60870cx m58758h(String str, long j, C71308ej ejVar, C71207aq aqVar) {
        return C60856cj.m92905n(new C31522o(this, str, j, ejVar, aqVar), this.f84890h);
    }

    /* renamed from: a */
    public final C31520m mo37209a() {
        if (!this.f84886b.mo37025e()) {
            return C31520m.f84871a;
        }
        return new C31520m(SystemClock.elapsedRealtime());
    }

    /* renamed from: b */
    public final C31520m mo37210b(C31164au auVar) {
        String str = auVar.f84029a;
        if (f84883a.contains(str)) {
            ((C59052c) ((C59052c) f84885g.mo56226d()).mo56372aa(50441)).mo56389s("%s is reserved event. Dropping timer.", str);
            return C31520m.f84871a;
        } else if (!this.f84886b.mo37025e()) {
            return C31520m.f84871a;
        } else {
            C31520m mVar = new C31520m(SystemClock.elapsedRealtime());
            this.f84887c.put(str, mVar);
            return mVar;
        }
    }

    /* renamed from: c */
    public final void mo37211c(C31520m mVar, C31164au auVar, C71207aq aqVar, int i) {
        mo37215e(mVar, auVar.f84029a, aqVar, i);
    }

    /* renamed from: d */
    public final void mo37212d(C31164au auVar, int i) {
        mo37216f(auVar.f84029a, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return r8;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.C60870cx mo37215e(com.google.android.libraries.performance.primes.metrics.p2415i.C31520m r8, java.lang.String r9, p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq r10, int r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = com.google.android.libraries.performance.primes.metrics.p2415i.C31520m.m58749a(r8)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x000b
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x006a }
            monitor-exit(r7)
            return r8
        L_0x000b:
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r7.f84886b     // Catch:{ all -> 0x006a }
            long r3 = r0.mo37022a(r9)     // Catch:{ all -> 0x006a }
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0066
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            r8.f84873c = r0     // Catch:{ all -> 0x006a }
            r8.mo37214b(r11)     // Catch:{ all -> 0x006a }
            boolean r11 = com.google.android.libraries.performance.primes.metrics.p2415i.C31520m.m58749a(r8)     // Catch:{ all -> 0x006a }
            if (r11 != 0) goto L_0x0059
            boolean r11 = com.google.common.base.C58837ba.m90859h(r9)     // Catch:{ all -> 0x006a }
            if (r11 == 0) goto L_0x002d
            goto L_0x0059
        L_0x002d:
            com.google.common.b.ij r11 = f84883a     // Catch:{ all -> 0x006a }
            boolean r11 = r11.contains(r9)     // Catch:{ all -> 0x006a }
            if (r11 == 0) goto L_0x004d
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x006a }
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x006a }
            r0 = 0
            r11[r0] = r9     // Catch:{ all -> 0x006a }
            java.lang.String r9 = "%s is reserved event. Dropping timer."
            java.lang.String r9 = java.lang.String.format(r10, r9, r11)     // Catch:{ all -> 0x006a }
            r8.<init>(r9)     // Catch:{ all -> 0x006a }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)     // Catch:{ all -> 0x006a }
            goto L_0x0064
        L_0x004d:
            j.a.i.b.a.ej r5 = m58757g(r8)     // Catch:{ all -> 0x006a }
            r1 = r7
            r2 = r9
            r6 = r10
            com.google.common.util.concurrent.cx r8 = r1.m58758h(r2, r3, r5, r6)     // Catch:{ all -> 0x006a }
            goto L_0x0064
        L_0x0059:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006a }
            java.lang.String r9 = "Can't record an event that was never started or has been stopped already"
            r8.<init>(r9)     // Catch:{ all -> 0x006a }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)     // Catch:{ all -> 0x006a }
        L_0x0064:
            monitor-exit(r7)
            return r8
        L_0x0066:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x006a }
            monitor-exit(r7)
            return r8
        L_0x006a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2415i.C31524q.mo37215e(com.google.android.libraries.performance.primes.metrics.i.m, java.lang.String, j.a.i.b.a.aq, int):com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final synchronized C60870cx mo37216f(String str, int i) {
        C31520m mVar = (C31520m) this.f84887c.remove(str);
        if (C31520m.m58749a(mVar)) {
            return C60866ct.f164955a;
        }
        long a = this.f84886b.mo37022a(str);
        if (a != -1) {
            mVar.f84873c = SystemClock.elapsedRealtime();
            mVar.mo37214b(i);
            long j = mVar.f84873c;
            long j2 = mVar.f84872b;
            return m58758h(true != C58837ba.m90859h((String) null) ? null : str, a, m58757g(mVar), (C71207aq) null);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: lm */
    public final C60870cx mo37207lm(C31164au auVar, long j, long j2, C71207aq aqVar) {
        String str = auVar.f84029a;
        C31520m mVar = new C31520m(j, j2, 1);
        long a = this.f84886b.mo37022a(str);
        if (a == -1) {
            return C60866ct.f164955a;
        }
        return m58758h(str, a, m58757g(mVar), aqVar);
    }

    /* renamed from: ln */
    public final /* synthetic */ void mo29159ln() {
    }
}
