package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62694v;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.av */
/* compiled from: PG */
public final class C110336av implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C110370cb f307540a;

    public C110336av(C110370cb cbVar) {
        this.f307540a = cbVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C110340az.f307542a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BDSCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25860)).mo56386p("load more failure");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C62694v vVar = (C62694v) obj;
        C58976aa aaVar = C58975e.f156826a;
        C110370cb cbVar = this.f307540a;
        int i = vVar.f169262a;
        String str = null;
        cbVar.f307612d = (i & 2) != 0 ? vVar.f169264c : null;
        if ((i & 4) != 0) {
            str = vVar.f169265d;
        }
        cbVar.f307613e = str;
        C62971cq cqVar = vVar.f169263b;
        List list = (List) cbVar.f307609a.mo3842a();
        if (list != null) {
            C58480gp f = C58485gu.m89838f(list.size() + cqVar.size());
            f.mo55396h(list);
            f.mo55396h(cqVar);
            cbVar.f307609a.mo5708l(f.mo55394f());
        }
    }
}
