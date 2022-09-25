package com.google.android.libraries.mdi.download.p2248h.p2249a;

import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59226t;
import com.google.p3728as.p3732b.p3733a.p3734a.p3735a.p3736a.C48032b;
import com.google.protobuf.C62971cq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.mdi.download.h.a.j */
/* compiled from: PG */
public final /* synthetic */ class C29484j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79910a;

    public /* synthetic */ C29484j(List list) {
        this.f79910a = list;
    }

    public final Object apply(Object obj) {
        List<C28706al> list = this.f79910a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            C29045l.m53931c("%s: No Handbag personalized info in Geller for key %s", "WebrefPersonalizedLocationsGellerSlicingFilter", "PersonalizedSliceInfo");
            return C58485gu.m89845m();
        }
        char c = 0;
        if (guVar.size() > 1) {
            C29045l.m53945q("WebrefPersonalizedLocationsGellerSlicingFilter", Integer.valueOf(guVar.size()), "PersonalizedSliceInfo");
        }
        C62971cq cqVar = ((C48032b) guVar.get(0)).f124319a;
        C29045l.m53931c("%s: Handbag personalized S2 cell ids from Geller: %s", "WebrefPersonalizedLocationsGellerSlicingFilter", cqVar);
        List list2 = (List) Collection.EL.stream(cqVar).map(C29485k.f79911a).filter(C29486l.f79912a).collect(Collectors.toCollection(C29487m.f79913a));
        HashSet hashSet = new HashSet();
        C58480gp e = C58485gu.m89837e();
        for (C28706al alVar : list) {
            String[] strArr = (String[]) DesugarArrays.stream((T[]) alVar.f77979b.split(":")).filter(C29488n.f79914a).toArray(C29489o.f79915a);
            if (strArr.length > 0) {
                String str = strArr[c];
                if (hashSet.contains(str)) {
                    C29490p.m54454c(alVar, e);
                } else {
                    C59226t tVar = (C59226t) C29490p.m54453b(str).mo56111f();
                    if (tVar != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C59226t tVar2 = (C59226t) it.next();
                            if (C59226t.m91920K(C59226t.m91934m(tVar2.f157334b), C59226t.m91933l(tVar.f157334b)) && C59226t.m91918I(C59226t.m91933l(tVar2.f157334b), C59226t.m91934m(tVar.f157334b))) {
                                C29045l.m53932d("%s: Cell %s intersects with personalized cell %s", "WebrefPersonalizedLocationsGellerSlicingFilter", tVar.mo56655A(), tVar2.mo56655A());
                                hashSet.add(str);
                                C29490p.m54454c(alVar, e);
                                c = 0;
                                break;
                            }
                            c = 0;
                        }
                    }
                }
            }
        }
        return e.mo55394f();
    }
}
