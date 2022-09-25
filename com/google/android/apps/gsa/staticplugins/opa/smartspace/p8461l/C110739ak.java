package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ak */
/* compiled from: PG */
public final /* synthetic */ class C110739ak implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308548a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308549b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f308550c;

    public /* synthetic */ C110739ak(C110764bi biVar, C83800p pVar, C58495hd hdVar) {
        this.f308548a = biVar;
        this.f308549b = pVar;
        this.f308550c = hdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110764bi biVar = this.f308548a;
        C83800p pVar = this.f308549b;
        C58495hd hdVar = this.f308550c;
        Pair pair = (Pair) obj;
        C60870cx cxVar = (C60870cx) pair.second;
        C58833ax axVar = (C58833ax) pair.first;
        if (!axVar.mo56113h() || !pVar.mo77056b().equals(axVar.mo56107c())) {
            C59104x d = C110764bi.f308595a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProactiveServiceManager");
            ((C59052c) ((C59052c) d).mo56372aa(26759)).mo56386p("#handNewCardUpdate new update card is not the primary card");
            return C118826c.f331423b;
        }
        if (!biVar.mo98884v()) {
            axVar = biVar.mo98868f(hdVar, axVar);
        }
        C92113i[] w = biVar.mo98885w(axVar, biVar.mo98867e(pVar), pVar.mo77059e(), pVar.mo77062g(), false);
        biVar.mo98881s(w);
        return biVar.mo98876n(w, cxVar, pVar);
    }
}
