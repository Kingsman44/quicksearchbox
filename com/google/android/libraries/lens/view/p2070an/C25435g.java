package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.p2014e.C24228t;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;

/* renamed from: com.google.android.libraries.lens.view.an.g */
/* compiled from: PG */
final class C25435g {

    /* renamed from: a */
    public static final C58974d f69313a = C58974d.m91135i("HybridResultMerger");

    /* renamed from: b */
    final C24209al f69314b = new C25433e(this);

    /* renamed from: c */
    final C24209al f69315c = new C25434f(this);

    /* renamed from: d */
    public final C24201ad f69316d;

    /* renamed from: e */
    public final C25762k f69317e;

    /* renamed from: f */
    public C24208ak f69318f;

    /* renamed from: g */
    public C24208ak f69319g;

    /* renamed from: h */
    private C24208ak f69320h;

    public C25435g(C24201ad adVar, C25762k kVar) {
        C58838bb.m90869d(!adVar.mo29682e().mo56113h(), "hybrid interaction results are not supported");
        this.f69316d = adVar;
        this.f69317e = kVar;
        C24208ak e = C24208ak.m45056e(adVar);
        this.f69320h = e;
        this.f69319g = e;
        this.f69318f = e;
    }

    /* renamed from: a */
    public final void mo30481a() {
        C24207aj c = this.f69320h.mo29698c();
        C24229u a = this.f69319g.mo29696a();
        C24229u a2 = this.f69318f.mo29696a();
        C24228t b = a.mo29733b();
        boolean z = false;
        if (a.mo29747n() && a2.mo29747n()) {
            z = true;
        }
        b.mo29728h(z);
        if (a2.mo29743j().f149750a.size() != 0) {
            C56328z zVar = (C56328z) a.mo29743j().toBuilder();
            zVar.mo54356a(a2.mo29743j().f149750a);
            b.mo29724d((C56220aa) zVar.build());
        }
        c.mo29694b(b.mo29721a());
        this.f69320h = c.mo29693a();
        ((C58970a) ((C58970a) f69313a.mo56224b()).mo56372aa(49842)).mo56355H("Query[%s] merged result (complete=%b)", this.f69316d.mo29680c(), this.f69320h.mo29701g());
        C25762k kVar = this.f69317e;
        C24208ak akVar = this.f69320h;
        kVar.mo30913c(akVar, akVar.mo29701g());
    }
}
