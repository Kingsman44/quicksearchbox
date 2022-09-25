package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p234a.p236b.C4814m;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4847e;
import com.airbnb.lottie.p238c.p239a.C4851i;
import com.airbnb.lottie.p238c.p239a.C4855m;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p245f.C4954k;
import com.airbnb.lottie.p246g.C4956a;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.e.a */
/* compiled from: PG */
public final class C4903a {

    /* renamed from: a */
    private static final C4906c f15641a = C4906c.m13601a(C19621k.f54601a, "x", "y");

    /* renamed from: a */
    public static C4847e m13599a(C4908e eVar, C4964k kVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.mo9855r() == 1) {
            eVar.mo9846i();
            while (eVar.mo9853p()) {
                arrayList.add(new C4814m(kVar, C4933q.m13676a(eVar, kVar, C4954k.m13718a(), C4938v.f15701a, eVar.mo9855r() == 3, false)));
            }
            eVar.mo9848k();
            C4934r.m13679b(arrayList);
        } else {
            arrayList.add(new C4956a(C4932p.m13674c(eVar, C4954k.m13718a())));
        }
        return new C4847e(arrayList);
    }

    /* renamed from: b */
    static C4855m m13600b(C4908e eVar, C4964k kVar) {
        eVar.mo9847j();
        C4847e eVar2 = null;
        C4844b bVar = null;
        C4844b bVar2 = null;
        boolean z = false;
        while (eVar.mo9855r() != 4) {
            int c = eVar.mo9841c(f15641a);
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        eVar.mo9851n();
                        eVar.mo9852o();
                    } else if (eVar.mo9855r() == 6) {
                        eVar.mo9852o();
                    } else {
                        bVar2 = C4920d.m13655b(eVar, kVar, true);
                    }
                } else if (eVar.mo9855r() == 6) {
                    eVar.mo9852o();
                } else {
                    bVar = C4920d.m13655b(eVar, kVar, true);
                }
                z = true;
            } else {
                eVar2 = m13599a(eVar, kVar);
            }
        }
        eVar.mo9849l();
        if (z) {
            kVar.mo9907c("Lottie doesn't support expressions.");
        }
        return eVar2 != null ? eVar2 : new C4851i(bVar, bVar2);
    }
}
