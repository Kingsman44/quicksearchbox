package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p240b.C4875r;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.airbnb.lottie.e.ag */
/* compiled from: PG */
final class C4916ag {

    /* renamed from: a */
    private static final C4906c f15666a = C4906c.m13601a(C59002s.f156871a, "e", C66412o.f180592a, "nm", "m", "hd");

    /* renamed from: a */
    static C4875r m13650a(C4908e eVar, C4964k kVar) {
        C4844b bVar = null;
        C4844b bVar2 = null;
        C4844b bVar3 = null;
        int i = 0;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15666a);
            if (c == 0) {
                bVar = C4920d.m13655b(eVar, kVar, false);
            } else if (c == 1) {
                bVar2 = C4920d.m13655b(eVar, kVar, false);
            } else if (c == 2) {
                bVar3 = C4920d.m13655b(eVar, kVar, false);
            } else if (c == 3) {
                eVar.mo9845h();
            } else if (c == 4) {
                int b = eVar.mo9840b();
                if (b == 1) {
                    i = 1;
                } else if (b == 2) {
                    i = 2;
                } else {
                    throw new IllegalArgumentException("Unknown trim path type " + b);
                }
            } else if (c != 5) {
                eVar.mo9852o();
            } else {
                z = eVar.mo9854q();
            }
        }
        return new C4875r(i, bVar, bVar2, bVar3, z);
    }
}
