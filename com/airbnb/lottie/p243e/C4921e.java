package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4848f;
import com.airbnb.lottie.p238c.p239a.C4855m;
import com.airbnb.lottie.p238c.p240b.C4858a;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.e */
/* compiled from: PG */
final class C4921e {

    /* renamed from: a */
    private static final C4906c f15671a = C4906c.m13601a("nm", "p", C59002s.f156871a, "hd", "d");

    /* renamed from: a */
    static C4858a m13661a(C4908e eVar, C4964k kVar, int i) {
        boolean z = i == 3;
        String str = null;
        C4855m mVar = null;
        C4848f fVar = null;
        boolean z2 = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15671a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                mVar = C4903a.m13600b(eVar, kVar);
            } else if (c == 2) {
                fVar = C4920d.m13658e(eVar, kVar);
            } else if (c == 3) {
                z2 = eVar.mo9854q();
            } else if (c != 4) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                z = eVar.mo9840b() == 3;
            }
        }
        return new C4858a(str, mVar, fVar, z, z2);
    }
}
