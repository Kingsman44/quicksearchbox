package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.au.aa */
/* compiled from: PG */
public final class C25545aa implements C25565o {

    /* renamed from: f */
    private static final C58974d f69541f = C58974d.m91135i("LensQueryState");

    /* renamed from: a */
    public final C25547ac f69542a = C25547ac.m47081a(C25576z.f69597a);

    /* renamed from: b */
    public final C25547ac f69543b = C25547ac.m47081a(C25576z.f69597a);

    /* renamed from: c */
    public final C25547ac f69544c = C25547ac.m47081a(C25576z.f69597a);

    /* renamed from: d */
    public final C25547ac f69545d = C25547ac.m47081a(C25576z.f69597a);

    /* renamed from: e */
    public final C25547ac f69546e = C25547ac.m47081a(C25576z.f69597a);

    /* renamed from: a */
    public final C25569s mo30593a() {
        return this.f69544c;
    }

    /* renamed from: b */
    public final C25569s mo30594b() {
        return this.f69543b;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensQueryState");
        eVar.mo33149f("pendingPrefetchQuery", String.valueOf(((C58833ax) this.f69545d.f69591a).mo56111f()));
        eVar.mo33149f("pendingInteractionQuery", String.valueOf(((C58833ax) this.f69546e.f69591a).mo56111f()));
        eVar.mo33149f("lastPrefetchResult", String.valueOf(((C58833ax) this.f69542a.f69591a).mo56111f()));
        eVar.mo33149f("lastInteractionResult", String.valueOf(((C58833ax) this.f69543b.f69591a).mo56111f()));
        eVar.mo33149f("error", String.valueOf(((C58833ax) this.f69544c.f69591a).mo56111f()));
    }

    /* renamed from: d */
    public final C25569s mo30595d() {
        return this.f69542a;
    }

    /* renamed from: e */
    public final C25569s mo30596e() {
        return this.f69546e;
    }

    /* renamed from: f */
    public final C25569s mo30597f() {
        return this.f69545d;
    }

    /* renamed from: g */
    public final void mo30598g(C25563m mVar) {
        if (mVar != null && !((C58833ax) this.f69546e.mo30656d()).mo56113h()) {
            ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50162)).mo56386p("setting error state without a pending query");
        }
        this.f69544c.mo30603e(C58833ax.m90833j(mVar));
    }

    /* renamed from: h */
    public final void mo30599h(C25561k kVar) {
        if (kVar != null) {
            if (!((C58833ax) this.f69542a.mo30656d()).mo56113h()) {
                ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50164)).mo56386p("setting interaction result without a prefetch result");
            }
            if (!((C58833ax) this.f69546e.mo30656d()).mo56113h()) {
                ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50163)).mo56386p("setting interaction result without a pending query");
            }
        }
        this.f69543b.mo30603e(C58833ax.m90833j(kVar));
    }

    /* renamed from: i */
    public final void mo30600i(C25561k kVar) {
        if (kVar == null && ((C58833ax) this.f69543b.mo30656d()).mo56113h()) {
            ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50165)).mo56386p("clearing prefetch result before interaction result");
        }
        this.f69542a.mo30603e(C58833ax.m90833j(kVar));
    }

    /* renamed from: j */
    public final void mo30601j(C25562l lVar) {
        C58833ax axVar = (C58833ax) this.f69546e.mo30656d();
        if (axVar.mo56113h() && !((C25562l) axVar.mo56107c()).mo30636f().isDone()) {
            ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50166)).mo56386p("updating pending interaction query without finishing previous");
        }
        this.f69546e.mo30603e(C58833ax.m90833j(lVar));
    }

    /* renamed from: k */
    public final void mo30602k(C25562l lVar) {
        C58833ax axVar = (C58833ax) this.f69545d.mo30656d();
        if (axVar.mo56113h() && !((C25562l) axVar.mo56107c()).mo30636f().isDone()) {
            ((C58970a) ((C58970a) f69541f.mo56226d()).mo56372aa(50167)).mo56386p("updating pending prefetch query without finishing previous");
        }
        this.f69545d.mo30603e(C58833ax.m90833j(lVar));
    }
}
