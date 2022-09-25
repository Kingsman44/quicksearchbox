package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4854l;
import com.airbnb.lottie.p238c.p240b.C4867j;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.airbnb.lottie.e.z */
/* compiled from: PG */
final class C4942z {

    /* renamed from: a */
    private static final C4906c f15705a = C4906c.m13601a("nm", C45240c.f118157a, C66412o.f180592a, "tr", "hd");

    /* renamed from: a */
    static C4867j m13688a(C4908e eVar, C4964k kVar) {
        String str = null;
        C4844b bVar = null;
        C4844b bVar2 = null;
        C4854l lVar = null;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15705a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                bVar = C4920d.m13655b(eVar, kVar, false);
            } else if (c == 2) {
                bVar2 = C4920d.m13655b(eVar, kVar, false);
            } else if (c == 3) {
                lVar = C4919c.m13653a(eVar, kVar);
            } else if (c != 4) {
                eVar.mo9852o();
            } else {
                z = eVar.mo9854q();
            }
        }
        return new C4867j(str, bVar, bVar2, lVar, z);
    }
}
