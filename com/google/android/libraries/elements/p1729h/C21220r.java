package com.google.android.libraries.elements.p1729h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.elements.h.r */
/* compiled from: PG */
public final /* synthetic */ class C21220r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21222t f59542a;

    public /* synthetic */ C21220r(C21222t tVar) {
        this.f59542a = tVar;
    }

    public final void run() {
        C58528ij ijVar;
        C58485gu j;
        C21222t tVar = this.f59542a;
        String str = (String) tVar.f59553j.get();
        C21228z k = C21198aa.m39840k();
        if (str == null) {
            ijVar = C58733pz.f156496a;
        } else {
            ijVar = new C58759qy(str);
        }
        k.mo26252c(ijVar);
        C21199ab abVar = C21199ab.COMPONENT_MATERIALIZATION;
        int i = C21213k.f59533a;
        List a = tVar.f59546c.mo26238a(C21199ab.COMPONENT_MATERIALIZATION.f59483m, k);
        if (!a.isEmpty()) {
            ((C21227y) a.get(0)).mo26221c(Integer.valueOf(tVar.f59549f));
            int e = tVar.f59552i.mo26246e(tVar.f59550g, ((C21227y) a.get(0)).mo26219a());
            tVar.mo26283k(tVar.f59547d.mo26238a(C21199ab.TEMPLATE_FETCHING.f59483m, k), e);
            tVar.mo26283k(tVar.f59548e.mo26238a(C21199ab.TEMPLATE_RESOLUTION.f59483m, k), e);
            synchronized (tVar.f59545b) {
                j = !tVar.f59551h.isEmpty() ? C58485gu.m89842j(tVar.f59551h) : null;
            }
            if (j != null) {
                ArrayList arrayList = new ArrayList(j.size());
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C21221s sVar = (C21221s) j.get(i2);
                    C21197a aVar = new C21197a();
                    aVar.mo26220b(C21199ab.PB_TO_FB.f59483m);
                    aVar.f59466c = Long.valueOf(sVar.f59543a);
                    ((C21205c) k).f59497a = sVar.f59544b;
                    aVar.f59467d = k.mo26250a();
                    arrayList.add(aVar);
                }
                tVar.mo26283k(arrayList, e);
            }
        }
    }
}
