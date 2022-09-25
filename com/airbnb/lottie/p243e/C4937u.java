package com.airbnb.lottie.p243e;

import com.airbnb.lottie.p238c.p240b.C4864g;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.u */
/* compiled from: PG */
final class C4937u {

    /* renamed from: a */
    private static final C4906c f15700a = C4906c.m13601a("nm", "mm", "hd");

    /* renamed from: a */
    static C4864g m13683a(C4908e eVar) {
        int i = 0;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15700a);
            if (c == 0) {
                eVar.mo9845h();
            } else if (c == 1) {
                int b = eVar.mo9840b();
                if (b != 1) {
                    if (b == 2) {
                        i = 2;
                    } else if (b == 3) {
                        i = 3;
                    } else if (b == 4) {
                        i = 4;
                    } else if (b == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (c != 2) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                z = eVar.mo9854q();
            }
        }
        return new C4864g(i, z);
    }
}
