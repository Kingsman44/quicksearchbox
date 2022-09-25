package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.p2014e.C24228t;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;

/* renamed from: com.google.android.libraries.lens.view.an.c */
/* compiled from: PG */
final class C25431c implements C24209al {

    /* renamed from: a */
    final /* synthetic */ C25432d f69304a;

    public C25431c(C25432d dVar) {
        this.f69304a = dVar;
    }

    /* renamed from: a */
    public final void mo29702a(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C25432d.f69305a.mo56225c()).mo56382g(th)).mo56372aa(49835)).mo56389s("Query[%s] failed (server)", this.f69304a.f69307c.mo29680c());
        this.f69304a.f69308d.mo30912b(th);
    }

    /* renamed from: b */
    public final void mo29703b(C24208ak akVar) {
    }

    /* renamed from: c */
    public final void mo29704c(C24208ak akVar) {
        ((C58970a) ((C58970a) C25432d.f69305a.mo56224b()).mo56372aa(49836)).mo56355H("Query[%s] server result (complete=%b)", this.f69304a.f69307c.mo29680c(), akVar.mo29701g());
        C25432d dVar = this.f69304a;
        C24207aj c = dVar.f69309e.mo29698c();
        C24229u uVar = dVar.f69310f;
        C24229u a = akVar.mo29696a();
        C24228t b = uVar.mo29733b();
        b.mo29728h(a.mo29747n());
        C56220aa j = uVar.mo29743j();
        C56220aa j2 = a.mo29743j();
        C56328z zVar = (C56328z) j.toBuilder();
        zVar.mo54356a(C58557jl.m90124e(j2.f149750a, C25389b.f69163a));
        b.mo29724d((C56220aa) zVar.build());
        c.mo29694b(b.mo29721a());
        if (akVar.mo29699d().mo56113h()) {
            c.mo29695c((C24199ab) akVar.mo29699d().mo56107c());
        }
        dVar.f69309e = c.mo29693a();
        ((C58970a) ((C58970a) C25432d.f69305a.mo56224b()).mo56372aa(49837)).mo56355H("Query[%s] merged result (complete=%b)", dVar.f69307c.mo29680c(), dVar.f69309e.mo29701g());
        C25762k kVar = dVar.f69308d;
        C24208ak akVar2 = dVar.f69309e;
        kVar.mo30913c(akVar2, akVar2.mo29701g());
    }
}
