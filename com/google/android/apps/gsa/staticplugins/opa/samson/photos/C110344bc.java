package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62687o;
import com.google.p4715m.p4716a.p4720b.p4721a.C62688p;
import com.google.p4715m.p4716a.p4720b.p4721a.C62690r;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bc */
/* compiled from: PG */
final class C110344bc implements C22868d {

    /* renamed from: a */
    final C109024k f307554a;

    public C110344bc(C109024k kVar) {
        this.f307554a = kVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C110345bd.f307555a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BDTCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25868)).mo56386p("update failed");
        this.f307554a.mo97393b();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C62971cq<C62687o> cqVar = ((C62688p) obj).f169253a;
        int size = cqVar.size();
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        for (C62687o oVar : cqVar) {
            int a = C62690r.m94900a(oVar.f169247b);
            if (a != 0 && a == 5) {
                e.mo55395g(oVar);
            } else {
                e2.mo55395g(oVar);
            }
        }
        C58485gu f = e.mo55394f();
        if (((C58724pq) f).f156474d <= 1) {
            e.mo55396h(e2.mo55394f());
            f = e.mo55394f();
        }
        C58485gu i = C58485gu.m89841i(C58431eu.m89654f(C58557jl.m90125f(C58431eu.m89654f(f).mo55245d().mo55248h(), size)).mo55247g(C110343bb.f307553a).mo55248h());
        List list = (List) this.f307554a.f303165a.mo3842a();
        if (list == null || list.isEmpty()) {
            this.f307554a.f303165a.mo5708l(i);
        } else {
            this.f307554a.f303166b.mo5708l(i);
        }
        this.f307554a.mo97393b();
    }
}
