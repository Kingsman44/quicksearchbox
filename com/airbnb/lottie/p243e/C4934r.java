package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p234a.p236b.C4814m;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p246g.C4956a;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.r */
/* compiled from: PG */
final class C4934r {

    /* renamed from: a */
    static final C4906c f15692a = C4906c.m13601a(C19621k.f54601a);

    /* renamed from: a */
    static List m13678a(C4908e eVar, C4964k kVar, float f, C4917ah ahVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (eVar.mo9855r() == 6) {
            kVar.mo9907c("Lottie doesn't support expressions.");
            return arrayList;
        }
        eVar.mo9847j();
        while (eVar.mo9853p()) {
            if (eVar.mo9841c(f15692a) != 0) {
                eVar.mo9852o();
            } else if (eVar.mo9855r() == 1) {
                eVar.mo9846i();
                if (eVar.mo9855r() != 7) {
                    while (eVar.mo9853p()) {
                        arrayList.add(C4933q.m13676a(eVar, kVar, f, ahVar, true, z));
                    }
                } else {
                    arrayList.add(C4933q.m13676a(eVar, kVar, f, ahVar, false, z));
                }
                eVar.mo9848k();
            } else {
                arrayList.add(C4933q.m13676a(eVar, kVar, f, ahVar, false, z));
            }
        }
        eVar.mo9849l();
        m13679b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m13679b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C4956a aVar = (C4956a) list.get(i2);
            i2++;
            C4956a aVar2 = (C4956a) list.get(i2);
            aVar.f15737h = Float.valueOf(aVar2.f15736g);
            if (aVar.f15732c == null && (obj = aVar2.f15731b) != null) {
                aVar.f15732c = obj;
                if (aVar instanceof C4814m) {
                    ((C4814m) aVar).mo9748a();
                }
            }
        }
        C4956a aVar3 = (C4956a) list.get(i);
        if ((aVar3.f15731b == null || aVar3.f15732c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
