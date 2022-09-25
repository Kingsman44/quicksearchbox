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

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.db */
/* compiled from: PG */
public final class C13850db implements C13736at {

    /* renamed from: i */
    private static final C59071e f42155i = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.db");

    /* renamed from: a */
    public final C13858dj f42156a;

    /* renamed from: b */
    public final C69464a f42157b;

    /* renamed from: c */
    public final C37215b f42158c;

    /* renamed from: d */
    public final C13893x f42159d;

    /* renamed from: e */
    public final C13848b f42160e;

    /* renamed from: f */
    public Optional f42161f = Optional.empty();

    /* renamed from: g */
    public final C13863do f42162g;

    /* renamed from: h */
    public final C13722af f42163h;

    /* renamed from: j */
    private final C13873dy f42164j;

    /* renamed from: k */
    private final C69464a f42165k;

    /* renamed from: l */
    private final C13874e f42166l;

    /* renamed from: m */
    private final C69464a f42167m;

    /* renamed from: n */
    private final C60888db f42168n;

    /* renamed from: o */
    private final C21370a f42169o;

    /* renamed from: p */
    private C13889t f42170p;

    /* renamed from: q */
    private C13753bf f42171q;

    public C13850db(C13848b bVar, C13858dj djVar, C13874e eVar, C69464a aVar, C13873dy dyVar, C69464a aVar2, C69464a aVar3, C60888db dbVar, C37215b bVar2, C13894y yVar, C21370a aVar4, C13864dp dpVar, C13723ag agVar) {
        this.f42160e = bVar;
        this.f42156a = djVar;
        this.f42164j = dyVar;
        this.f42165k = aVar2;
        this.f42157b = aVar3;
        this.f42166l = eVar;
        this.f42167m = aVar;
        this.f42168n = dbVar;
        this.f42158c = bVar2;
        this.f42169o = aVar4;
        C13722af a = agVar.mo21232a();
        this.f42163h = a;
        this.f42162g = dpVar.mo21316a(a);
        this.f42159d = yVar.mo21345a(bVar, new C13824cw(this));
    }

    /* renamed from: a */
    public final C60870cx mo21236a() {
        C59104x b = f42155i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OnlineFOPolicy");
        ((C59052c) ((C59052c) b).mo56372aa(45060)).mo56386p("#cancel");
        this.f42156a.mo21309d(true);
        mo21302d();
        C13753bf bfVar = this.f42171q;
        if (bfVar == null) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92901j(bfVar.mo21248e());
    }

    /* renamed from: b */
    public final C60870cx mo21237b() {
        C13753bf bfVar = this.f42171q;
        bfVar.getClass();
        return bfVar.mo21240b();
    }

    /* renamed from: c */
    public final C60870cx mo21238c(C13829a aVar, C13755bh bhVar) {
        C58976aa aaVar = C58975e.f156826a;
        long a = aVar.mo21270a();
        if (aVar.mo21274e() && ((Boolean) this.f42165k.mo17428b()).booleanValue()) {
            C13825cx cxVar = new C13825cx(this);
            C13873dy dyVar = this.f42164j;
            if (a <= 0) {
                a = this.f42169o.mo26871c();
            }
            Optional of = Optional.m71637of(dyVar.mo21327a(1, a, false, this.f42168n, cxVar));
            this.f42161f = of;
            ((C13872dx) of.get()).mo21325c();
        }
        C13753bf c = bhVar.mo21252c(aVar, new C13849da(this, aVar.mo21272c(), aVar.mo21271b()));
        this.f42171q = c;
        C13889t a2 = C13853de.m30140a(c.mo21241c(), this.f42167m, this.f42168n, this.f42158c);
        this.f42170p = a2;
        C60870cx cxVar2 = a2.f42305a;
        this.f42166l.mo21328a();
        C13826cy cyVar = new C13826cy(this);
        C60856cj.m92911t(cxVar2, C47810es.m84974n(cyVar), C60826bg.f164896a);
        C13753bf bfVar = this.f42171q;
        bfVar.getClass();
        C60870cx b = bfVar.mo21240b();
        C13827cz czVar = new C13827cz(this);
        C60856cj.m92911t(b, C47810es.m84974n(czVar), C60826bg.f164896a);
        if (!aVar.mo21274e()) {
            mo21303e();
        }
        return cxVar2;
    }

    /* renamed from: d */
    public final void mo21302d() {
        if (this.f42161f.isPresent()) {
            ((C13872dx) this.f42161f.get()).mo21326d();
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: e */
    public final void mo21303e() {
        C13889t tVar = this.f42170p;
        if (tVar != null) {
            tVar.mo21340b();
        }
    }
}
