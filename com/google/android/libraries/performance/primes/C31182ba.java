package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.metrics.crash.C31357e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.metrics.p2410e.C31424j;
import com.google.android.libraries.performance.primes.metrics.p2410e.C31435u;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31446e;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31451j;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31510c;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31521n;
import com.google.android.libraries.performance.primes.metrics.p2416j.C31554v;
import com.google.android.libraries.performance.primes.metrics.storage.C31575q;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import java.util.WeakHashMap;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;

/* renamed from: com.google.android.libraries.performance.primes.ba */
/* compiled from: PG */
final class C31182ba implements C31168ay {

    /* renamed from: a */
    private static final C59071e f84056a = C59071e.m91332i("com.google.android.libraries.performance.primes.ba");

    /* renamed from: b */
    private final C69464a f84057b;

    /* renamed from: c */
    private final C31207bz f84058c;

    /* renamed from: d */
    private final C69464a f84059d;

    /* renamed from: e */
    private final C69464a f84060e;

    /* renamed from: f */
    private final C69464a f84061f;

    /* renamed from: g */
    private final C69464a f84062g;

    /* renamed from: h */
    private final C69464a f84063h;

    /* renamed from: i */
    private final C69464a f84064i;

    /* renamed from: j */
    private final C69464a f84065j;

    /* renamed from: k */
    private final C69464a f84066k;

    /* renamed from: l */
    private final C69464a f84067l;

    /* renamed from: m */
    private final C69464a f84068m;

    public C31182ba(C69464a aVar, C31207bz bzVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C58833ax axVar, C31148ae aeVar) {
        this.f84057b = aVar;
        this.f84058c = bzVar;
        this.f84059d = aVar2;
        this.f84060e = aVar3;
        this.f84061f = aVar4;
        this.f84062g = aVar5;
        this.f84068m = aVar6;
        this.f84063h = aVar7;
        this.f84064i = aVar8;
        this.f84065j = aVar9;
        this.f84066k = aVar10;
        this.f84067l = aVar11;
        if (!C19559g.m37305d(Thread.currentThread()) && !aeVar.mo36886a()) {
            throw new IllegalStateException("Primes init triggered from background in package: ".concat(String.valueOf(aeVar.f83868a)));
        } else if (!((Boolean) axVar.mo56109e(Boolean.FALSE)).booleanValue()) {
            try {
                WeakHashMap weakHashMap = C47831fm.f123851a;
                for (C31313p ln : (Set) aVar2.mo17428b()) {
                    ln.mo29159ln();
                }
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f84056a.mo56226d()).mo56382g(e)).mo56372aa(50342)).mo56386p("Primes failed to initialize");
                this.f84058c.mo36937a();
            }
        }
    }

    /* renamed from: a */
    public final C31520m mo36896a() {
        return ((C31521n) this.f84065j.mo17428b()).mo37209a();
    }

    /* renamed from: b */
    public final C58881cr mo36897b() {
        C69464a aVar = this.f84057b;
        Objects.requireNonNull(aVar);
        return new C31169az(aVar);
    }

    /* renamed from: c */
    public final void mo36898c(C31164au auVar) {
        ((C31424j) this.f84068m.mo17428b()).mo37106b(auVar);
    }

    /* renamed from: d */
    public final void mo36899d(C31447f fVar) {
        ((C31451j) this.f84063h.mo17428b()).mo37145b(fVar);
    }

    /* renamed from: e */
    public final void mo36900e() {
        ((C31575q) this.f84064i.mo17428b()).mo37265ll();
    }

    /* renamed from: f */
    public final void mo36901f() {
        ((C31357e) this.f84061f.mo17428b()).mo37068e();
    }

    /* renamed from: g */
    public final void mo36902g(C31164au auVar) {
        ((C31521n) this.f84065j.mo17428b()).mo37210b(auVar);
    }

    /* renamed from: h */
    public final void mo36903h(C31164au auVar) {
        ((C31424j) this.f84068m.mo17428b()).mo37107c(auVar);
    }

    /* renamed from: i */
    public final void mo36904i() {
        ((C31435u) this.f84062g.mo17428b()).mo37109e();
    }

    /* renamed from: j */
    public final boolean mo36905j() {
        return ((C31446e) this.f84060e.mo17428b()).mo36980b();
    }

    /* renamed from: k */
    public final void mo36906k(C31164au auVar) {
        ((C31435u) this.f84062g.mo17428b()).mo37110f(auVar);
    }

    /* renamed from: l */
    public final void mo36907l(C31164au auVar) {
        ((C31424j) this.f84068m.mo17428b()).mo37108d(auVar);
    }

    /* renamed from: m */
    public final void mo36908m(C31164au auVar, long j, long j2, C71207aq aqVar) {
        ((C31510c) this.f84067l.mo17428b()).mo37207lm(auVar, j, j2, aqVar);
    }

    /* renamed from: n */
    public final void mo36909n(C71251cg cgVar, C71207aq aqVar) {
        ((C31554v) this.f84066k.mo17428b()).mo37219a(cgVar, aqVar);
    }

    /* renamed from: o */
    public final void mo36910o(C31520m mVar, C31164au auVar, C71207aq aqVar, int i) {
        ((C31521n) this.f84065j.mo17428b()).mo37211c(mVar, auVar, aqVar, i);
    }

    /* renamed from: p */
    public final void mo36911p(C31164au auVar, int i) {
        ((C31521n) this.f84065j.mo17428b()).mo37212d(auVar, i);
    }
}
