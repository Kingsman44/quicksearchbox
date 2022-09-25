package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2024d.C24293a;
import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2026f.C24472b;
import com.google.android.libraries.lens.ondevice.p2026f.C24476e;
import com.google.android.libraries.lens.ondevice.p2026f.C24483l;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2026f.C24493v;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24451f;
import com.google.android.libraries.lens.ondevice.p2031h.C24505a;
import com.google.android.libraries.lens.ondevice.p2031h.C24506b;
import com.google.android.libraries.lens.ondevice.p2031h.C24507c;
import com.google.android.libraries.lens.ondevice.p2031h.C24508d;
import com.google.android.libraries.lens.ondevice.p2031h.C24509e;
import com.google.android.libraries.lens.ondevice.p2031h.C24519o;
import com.google.android.libraries.lens.ondevice.p2031h.C24520p;
import com.google.android.libraries.lens.ondevice.p2032i.C24528f;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2035l.C24762e;
import com.google.android.libraries.lens.ondevice.p2037n.C24770ac;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.p1994b.C24067a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4701g.C62331d;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.ondevice.o */
/* compiled from: PG */
public final class C24823o {

    /* renamed from: a */
    public static final C58974d f67844a = C58974d.m91135i("LensOnDeviceEngine");

    /* renamed from: b */
    public final C24520p f67845b;

    /* renamed from: c */
    public final C24530h f67846c;

    /* renamed from: d */
    public final C24762e f67847d;

    /* renamed from: e */
    public final C24491t f67848e;

    /* renamed from: f */
    public final C24528f f67849f;

    /* renamed from: g */
    public C24519o f67850g;

    /* renamed from: h */
    private final C24509e f67851h;

    /* renamed from: i */
    private final C24770ac f67852i;

    /* renamed from: j */
    private final Executor f67853j;

    public C24823o(C60887da daVar, C24509e eVar, C24520p pVar, C24762e eVar2, C24491t tVar, C24530h hVar, C24528f fVar, C24770ac acVar) {
        this.f67853j = new C60904dr(daVar);
        this.f67851h = eVar;
        this.f67845b = pVar;
        this.f67847d = eVar2;
        this.f67848e = tVar;
        this.f67846c = hVar;
        this.f67849f = fVar;
        this.f67852i = acVar;
    }

    /* renamed from: b */
    public final C60870cx mo30020b(C62331d dVar, C24795f fVar) {
        C60870cx cxVar;
        if (dVar == C62331d.HINT_CASCADE) {
            cxVar = C60856cj.m92900i(true);
        } else {
            C24491t tVar = this.f67848e;
            C60887da daVar = tVar.f67011b;
            C24493v vVar = tVar.f67013d;
            Objects.requireNonNull(vVar);
            cxVar = daVar.mo19399b(new C24476e(vVar));
        }
        List c = this.f67847d.mo29999c(dVar);
        C24491t tVar2 = this.f67848e;
        C60870cx g = tVar2.mo29918g(((C24472b) C24491t.m45560a(tVar2.mo29916d(c), fVar)).f66985a.mo55229u());
        C24483l lVar = C24483l.f67000a;
        C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(lVar), C60826bg.f164896a);
        return C47638k.m84751b(cxVar, g2).mo51520a(new C24764m(cxVar, g2), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo30022d(C24424r rVar, C24280f fVar) {
        if (this.f67852i.f67685c) {
            C24509e eVar = this.f67851h;
            C24505a aVar = new C24505a(eVar, rVar, fVar);
            return C60856cj.m92905n(C47810es.m84965e(aVar), eVar.f67130d);
        }
        C24534k kVar = new C24534k(this, fVar);
        return C60856cj.m92905n(C47810es.m84965e(kVar), this.f67853j);
    }

    /* renamed from: c */
    public final C60870cx mo30021c(C62331d dVar, C24795f fVar) {
        if (this.f67852i.f67685c) {
            C24509e eVar = this.f67851h;
            eVar.f67129c.mo29947f(C24805p.ENGINE_INIT_START, (C24808s) null);
            C24293a aVar = new C24293a(dVar);
            C24507c cVar = new C24507c(eVar, aVar, dVar, fVar);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(cVar), eVar.f67130d);
            C24508d dVar2 = new C24508d(eVar, aVar);
            C60856cj.m92911t(n, C47810es.m84974n(dVar2), eVar.f67130d);
            return n;
        }
        C24532j jVar = new C24532j(this, dVar, fVar);
        return C60856cj.m92905n(C47810es.m84965e(jVar), this.f67853j);
    }

    /* renamed from: e */
    public final void mo30023e() {
        if (this.f67852i.f67685c) {
            ((C58970a) ((C58970a) f67844a.mo56224b()).mo56372aa(48760)).mo56386p("Shutting down");
            this.f67847d.mo30000d();
            C24509e eVar = this.f67851h;
            eVar.f67130d.execute(new C24506b(eVar));
            return;
        }
        this.f67853j.execute(new C24757l(this));
    }

    /* renamed from: a */
    public static C24823o m45946a(C60887da daVar, C24770ac acVar, C26244b bVar, C24067a aVar, C24451f fVar, C24825q qVar, C24522i iVar) {
        daVar.getClass();
        acVar.getClass();
        bVar.getClass();
        aVar.getClass();
        fVar.getClass();
        C58833ax a = qVar.mo29796a();
        a.getClass();
        C58833ax c = qVar.mo29798c();
        c.getClass();
        C58833ax d = qVar.mo29799d();
        d.getClass();
        C58833ax b = qVar.mo29797b();
        b.getClass();
        iVar.getClass();
        C24504h hVar = new C24504h(iVar, daVar, acVar, bVar, aVar, fVar, a, c, d, b);
        return new C24823o(hVar.f67063a, (C24509e) hVar.f67105o.mo17428b(), new C24520p(hVar.f67101k, hVar.f67102l, hVar.f67103m, hVar.f67100j, hVar.f67098h, hVar.f67097g, hVar.f67104n, hVar.f67099i), (C24762e) hVar.f67103m.mo17428b(), (C24491t) hVar.f67100j.mo17428b(), (C24530h) hVar.f67098h.mo17428b(), new C24528f(hVar.f67063a, (C24491t) hVar.f67100j.mo17428b(), (C24530h) hVar.f67098h.mo17428b(), hVar.f67092b, (C24762e) hVar.f67103m.mo17428b()), hVar.f67093c);
    }
}
