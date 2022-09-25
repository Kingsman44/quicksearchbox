package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.r */
/* compiled from: PG */
public final /* synthetic */ class C29571r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29576w f80119a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f80120b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f80121c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f80122d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f80123e;

    public /* synthetic */ C29571r(C29576w wVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f80119a = wVar;
        this.f80120b = cxVar;
        this.f80121c = cxVar2;
        this.f80122d = cxVar3;
        this.f80123e = cxVar4;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29576w wVar = this.f80119a;
        C60870cx cxVar = this.f80120b;
        C60870cx cxVar2 = this.f80121c;
        C60870cx cxVar3 = this.f80122d;
        C60870cx cxVar4 = this.f80123e;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58495hd hdVar = (C58495hd) C60856cj.m92909r(cxVar2);
        List list = (List) C60856cj.m92909r(cxVar3);
        List list2 = (List) C60856cj.m92909r(cxVar4);
        try {
            C58485gu e = C29576w.m54564e(hdVar, list);
            C58485gu e2 = C29576w.m54564e(hdVar, list2);
            C60870cx cxVar5 = C60866ct.f164955a;
            if (!e2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = e2.size();
                int i = 0;
                while (i < size) {
                    C29574u uVar = (C29574u) e2.get(i);
                    C28708an a = uVar.mo34757a();
                    C58495hd b = uVar.mo34758b();
                    C29045l.m53931c("%s: Adding next-pending instance of group: %s", "GddDownloadedElementsListener", a.f77997b);
                    C29343e eVar = new C29343e();
                    eVar.mo34326b(a);
                    if (axVar != null) {
                        eVar.f79533b = axVar;
                        if (wVar.f80137c.equals(C29575v.MULTI_VARIANT_USING_GROUP_KEY)) {
                            eVar.f79534c = C58833ax.m90834k(a.f78005j);
                        }
                        C60870cx a2 = ((C29409fd) wVar.f80136b.mo6453a()).mo34712a(eVar.mo34325a());
                        C29569p pVar = new C29569p(wVar, a, b, axVar);
                        arrayList.add(C60922j.m93045h(a2, C47810es.m84966f(pVar), wVar.f80135a));
                        i++;
                    } else {
                        throw new NullPointerException("Null accountOptional");
                    }
                }
                cxVar5 = C29672d.m54726a(arrayList).mo34824b(new C29563j(arrayList), wVar.f80135a);
            }
            if (e.isEmpty()) {
                return cxVar5;
            }
            C58485gu o = C58485gu.m89847o(cxVar5, C29672d.m54727b(cxVar5).mo34824b(new C29564k(wVar, e, axVar), wVar.f80135a));
            return C29672d.m54726a(o).mo34824b(new C29565l(o), wVar.f80135a);
        } catch (IllegalArgumentException e3) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78064c = e3;
            bnVar.f78062a = C28737bo.GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
    }
}
