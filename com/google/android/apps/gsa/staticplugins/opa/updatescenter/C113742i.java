package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3784b.p3785a.p3786a.C48480b;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.i */
/* compiled from: PG */
public final class C113742i implements C73908b {

    /* renamed from: a */
    public static final C59071e f314988a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.updatescenter.i");

    /* renamed from: b */
    public final C108013bm f314989b;

    /* renamed from: c */
    public final C22871g f314990c;

    /* renamed from: d */
    public final C21370a f314991d;

    /* renamed from: e */
    public final C86124t f314992e;

    /* renamed from: f */
    private final i f314993f;

    /* renamed from: g */
    private final C86054o f314994g;

    public C113742i(i iVar, C86054o oVar, C108013bm bmVar, C22871g gVar, C21370a aVar, C86124t tVar) {
        this.f314993f = iVar;
        this.f314994g = oVar;
        this.f314989b = bmVar;
        this.f314990c = gVar;
        this.f314991d = aVar;
        this.f314992e = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo65439a() {
        C60870cx cxVar;
        C22871g gVar = this.f314990c;
        String F = this.f314994g.mo79659F();
        if (F == null) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar = this.f314990c.mo28209i(this.f314993f.a(F, C65753ak.ASSISTANT_UPDATES_CENTER_POOL, (String) null, C63662ac.f172144a, C48480b.f125234b), "Get Geller aync to run on background task", C113737d.f314982a);
        }
        return gVar.mo28210j(cxVar, "Get Updates Center profile from Geller.", new C113735b(this));
    }

    /* renamed from: b */
    public final C60870cx mo65440b() {
        return this.f314990c.mo28209i(mo65439a(), "Get processed badge data.", C113736c.f314981a);
    }

    /* renamed from: c */
    public final void mo65441c() {
        C108013bm bmVar = this.f314989b;
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        ((C50638an) amVar.instance).f131732e = 0;
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = false;
        long b = this.f314991d.mo26870b();
        amVar.copyOnWrite();
        ((C50638an) amVar.instance).f131731d = b;
        bmVar.mo96360K((C50638an) amVar.build());
        this.f314989b.mo96359J();
    }

    /* renamed from: d */
    public final void mo65442d() {
        this.f314990c.mo28211k(this.f314989b.mo96351B(), "Read UpdatesCenterUpdatesCenterQueue information from local storage.", new C113741h(this));
        this.f314989b.mo96359J();
    }
}
