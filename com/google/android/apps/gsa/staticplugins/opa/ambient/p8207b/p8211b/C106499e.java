package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C106499e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106511q f297016a;

    public /* synthetic */ C106499e(C106511q qVar) {
        this.f297016a = qVar;
    }

    public final Object apply(Object obj) {
        C106511q qVar = this.f297016a;
        List list = (List) obj;
        Collection.EL.stream(list).forEach(new C106509o(qVar));
        qVar.mo95555e((C58485gu) Collection.EL.stream(list).filter(C106496b.f297010a).collect(C58370cn.f155946a));
        C106596h a = qVar.f297039e.mo95727a();
        if (qVar.f297041g.mo79746e(C90017bw.f247978bn)) {
            C107043b.m177757a(qVar.f297035a, qVar.f297040f.mo46039a(new C106495a(qVar, a), qVar.f297037c), "onFailure(): storing UserContext failed.", new Object[0]);
        }
        C106595g a2 = C106595g.m177369a(a.f297218m);
        if (a2 == null) {
            a2 = C106595g.UNSPECIFIED;
        }
        if (a2.equals(C106595g.HEADSET_STATE) && a.f297208c) {
            qVar.f297043i.mo77083g(a);
        }
        return Optional.m71637of(a);
    }
}
