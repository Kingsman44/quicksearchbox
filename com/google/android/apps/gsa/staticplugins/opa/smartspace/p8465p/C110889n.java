package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83799o;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.n */
/* compiled from: PG */
public final /* synthetic */ class C110889n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110890o f308919a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308920b;

    public /* synthetic */ C110889n(C110890o oVar, C83800p pVar) {
        this.f308919a = oVar;
        this.f308920b = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        List list;
        C58833ax axVar;
        C110890o oVar = this.f308919a;
        C83800p pVar = this.f308920b;
        List list2 = (List) obj;
        if (list2.get(0) == null) {
            list = new ArrayList();
        } else {
            list = (List) list2.get(0);
        }
        if (list2.get(1) == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = (C58833ax) list2.get(1);
        }
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) oVar.f308925e.mo56226d()).mo56372aa(26824)).mo56386p("Missing weather card from content store");
        }
        if (!oVar.f308922b.mo77184w() || !axVar.mo56113h()) {
            C83798n a = pVar.mo77055a();
            a.mo77045d(C58495hd.m89900n(C83799o.CURRENT, C58485gu.m89842j(list)));
            a.mo77047f(axVar);
            return C60856cj.m92900i(a.mo77042a());
        }
        return oVar.f308921a.mo28210j(oVar.f308923c.mo77143f((C83741am) axVar.mo56107c(), oVar.f308926f), "fetchImage", new C110888m(oVar, pVar, list, axVar));
    }
}
