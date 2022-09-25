package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121250n;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.l */
/* compiled from: PG */
public final /* synthetic */ class C121361l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121365p f336986a;

    public /* synthetic */ C121361l(C121365p pVar) {
        this.f336986a = pVar;
    }

    public final Object apply(Object obj) {
        C121365p pVar = this.f336986a;
        C121250n nVar = (C121250n) obj;
        if (nVar.f336803a.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58976aa aaVar = C58975e.f156826a;
        nVar.f336803a.size();
        return (C58485gu) Collection.EL.stream(nVar.f336803a).map(new C121362m(pVar)).filter(C121363n.f336988a).map(C121364o.f336989a).collect(C58370cn.f155946a);
    }
}
