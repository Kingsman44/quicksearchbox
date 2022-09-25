package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.p2014e.C24228t;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27946b;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27966v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.amc;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.p */
/* compiled from: PG */
final class C28007p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28015x f76210a;

    /* renamed from: b */
    final /* synthetic */ C27966v f76211b;

    /* renamed from: c */
    final /* synthetic */ C56220aa f76212c;

    /* renamed from: d */
    final /* synthetic */ C27971i f76213d;

    /* renamed from: e */
    final /* synthetic */ C28017z f76214e;

    public C28007p(C28017z zVar, C28015x xVar, C27966v vVar, C56220aa aaVar, C27971i iVar) {
        this.f76214e = zVar;
        this.f76210a = xVar;
        this.f76211b = vVar;
        this.f76212c = aaVar;
        this.f76213d = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f76214e.f76247j == this.f76210a) {
            ((C58970a) ((C58970a) ((C58970a) C28017z.f76238a.mo56226d()).mo56382g(th)).mo56372aa(49961)).mo56351D("Translation error %s: %s", ((C27946b) this.f76211b).f76101a.f149807d, th.getMessage());
            this.f76214e.mo33469g(this.f76210a, this.f76213d, th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C28017z zVar = this.f76214e;
        if (zVar.f76247j == this.f76210a) {
            C27940n.m52003d(zVar.f76244g, ((C27946b) this.f76211b).f76102b, guVar);
            C28015x xVar = this.f76210a;
            C56220aa aaVar = this.f76212c;
            amc c = this.f76214e.f76243f.mo30409c(xVar.f76229a.mo29679b().mo29686c(), C58485gu.m89845m(), C58836b.f156633a);
            C58833ax b = C28017z.m52181b(this.f76213d);
            C27920ak akVar = this.f76214e.f76241d;
            C24228t o = C28017z.m52183o(aaVar, c, guVar, b, C28017z.m52180a(akVar.f76055n, akVar.f76057p));
            o.mo29729i(this.f76213d.mo33396m());
            xVar.mo33464a(o.mo29721a());
        }
    }
}
