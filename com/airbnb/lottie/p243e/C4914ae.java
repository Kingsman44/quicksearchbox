package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4850h;
import com.airbnb.lottie.p238c.p240b.C4871n;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.ae */
/* compiled from: PG */
final class C4914ae {

    /* renamed from: a */
    static final C4906c f15663a = C4906c.m13601a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C4871n m13648a(C4908e eVar, C4964k kVar) {
        String str = null;
        C4850h hVar = null;
        int i = 0;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15663a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                i = eVar.mo9840b();
            } else if (c == 2) {
                hVar = C4920d.m13659f(eVar, kVar);
            } else if (c != 3) {
                eVar.mo9852o();
            } else {
                z = eVar.mo9854q();
            }
        }
        return new C4871n(str, i, hVar, z);
    }
}
