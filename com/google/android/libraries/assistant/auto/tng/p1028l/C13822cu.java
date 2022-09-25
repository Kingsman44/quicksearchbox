package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13848b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.cu */
/* compiled from: PG */
public final class C13822cu implements C13736at {

    /* renamed from: h */
    private static final C59071e f42098h = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.cu");

    /* renamed from: a */
    public final C13893x f42099a;

    /* renamed from: b */
    public final C13858dj f42100b;

    /* renamed from: c */
    public final C69464a f42101c;

    /* renamed from: d */
    public final C37215b f42102d;

    /* renamed from: e */
    public final C13722af f42103e;

    /* renamed from: f */
    public final C13863do f42104f;

    /* renamed from: g */
    public Optional f42105g = Optional.empty();

    /* renamed from: i */
    private final C13874e f42106i;

    /* renamed from: j */
    private final C13873dy f42107j;

    /* renamed from: k */
    private final C69464a f42108k;

    /* renamed from: l */
    private final C60888db f42109l;

    /* renamed from: m */
    private final C21370a f42110m;

    /* renamed from: n */
    private C13753bf f42111n;

    public C13822cu(C13848b bVar, C13858dj djVar, C13874e eVar, C37215b bVar2, C13894y yVar, C13873dy dyVar, C13723ag agVar, C13864dp dpVar, C69464a aVar, C60888db dbVar, C21370a aVar2, C69464a aVar3) {
        this.f42106i = eVar;
        this.f42100b = djVar;
        this.f42099a = yVar.mo21345a(bVar, C13818cq.f42092a);
        this.f42107j = dyVar;
        this.f42108k = aVar;
        C13722af a = agVar.mo21232a();
        this.f42103e = a;
        this.f42104f = dpVar.mo21316a(a);
        this.f42109l = dbVar;
        this.f42110m = aVar2;
        this.f42102d = bVar2;
        this.f42101c = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo21236a() {
        C59104x b = f42098h.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OfflineFetchPolicy");
        ((C59052c) ((C59052c) b).mo56372aa(45053)).mo56386p("#cancel");
        this.f42100b.mo21309d(true);
        mo21268d();
        C13753bf bfVar = this.f42111n;
        if (bfVar == null) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92901j(bfVar.mo21248e());
    }

    /* renamed from: b */
    public final C60870cx mo21237b() {
        C13753bf bfVar = this.f42111n;
        bfVar.getClass();
        return bfVar.mo21240b();
    }

    /* renamed from: c */
    public final C60870cx mo21238c(C13829a aVar, C13755bh bhVar) {
        long a = aVar.mo21270a();
        if (aVar.mo21274e() && ((Boolean) this.f42108k.mo17428b()).booleanValue()) {
            C13819cr crVar = new C13819cr(this);
            C13873dy dyVar = this.f42107j;
            if (a <= 0) {
                a = this.f42110m.mo26871c();
            }
            Optional of = Optional.m71637of(dyVar.mo21327a(2, a, false, this.f42109l, crVar));
            this.f42105g = of;
            ((C13872dx) of.get()).mo21325c();
        }
        C13753bf a2 = bhVar.mo21251a(aVar, new C13821ct(this, aVar.mo21272c(), aVar.mo21271b()));
        this.f42111n = a2;
        C60870cx c = a2.mo21241c();
        if (aVar.mo21274e()) {
            this.f42106i.mo21329b(c, 3, true);
        } else {
            this.f42106i.mo21329b(c, 3, false);
        }
        C13753bf bfVar = this.f42111n;
        bfVar.getClass();
        C60870cx b = bfVar.mo21240b();
        C13820cs csVar = new C13820cs(this);
        C60856cj.m92911t(b, C47810es.m84974n(csVar), C60826bg.f164896a);
        return c;
    }

    /* renamed from: d */
    public final void mo21268d() {
        if (this.f42105g.isPresent()) {
            ((C13872dx) this.f42105g.get()).mo21326d();
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
