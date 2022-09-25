package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4843a;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4853k;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.google.android.libraries.social.populous.android.C42181t;

/* renamed from: com.airbnb.lottie.e.b */
/* compiled from: PG */
public final class C4918b {

    /* renamed from: a */
    private static final C4906c f15667a = C4906c.m13601a("a");

    /* renamed from: b */
    private static final C4906c f15668b = C4906c.m13601a("fc", "sc", "sw", C42181t.f110467a);

    /* renamed from: a */
    public static C4853k m13652a(C4908e eVar, C4964k kVar) {
        eVar.mo9847j();
        C4853k kVar2 = null;
        while (eVar.mo9853p()) {
            if (eVar.mo9841c(f15667a) != 0) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                eVar.mo9847j();
                C4843a aVar = null;
                C4843a aVar2 = null;
                C4844b bVar = null;
                C4844b bVar2 = null;
                while (eVar.mo9853p()) {
                    int c = eVar.mo9841c(f15668b);
                    if (c == 0) {
                        aVar = C4920d.m13654a(eVar, kVar);
                    } else if (c == 1) {
                        aVar2 = C4920d.m13654a(eVar, kVar);
                    } else if (c == 2) {
                        bVar = C4920d.m13655b(eVar, kVar, true);
                    } else if (c != 3) {
                        eVar.mo9851n();
                        eVar.mo9852o();
                    } else {
                        bVar2 = C4920d.m13655b(eVar, kVar, true);
                    }
                }
                eVar.mo9849l();
                kVar2 = new C4853k(aVar, aVar2, bVar, bVar2);
            }
        }
        eVar.mo9849l();
        return kVar2 == null ? new C4853k((C4843a) null, (C4843a) null, (C4844b) null, (C4844b) null) : kVar2;
    }
}
