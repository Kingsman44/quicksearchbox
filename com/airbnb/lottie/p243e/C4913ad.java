package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p240b.C4859b;
import com.airbnb.lottie.p238c.p240b.C4870m;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.e.ad */
/* compiled from: PG */
final class C4913ad {

    /* renamed from: a */
    private static final C4906c f15662a = C4906c.m13601a("nm", "hd", "it");

    /* renamed from: a */
    static C4870m m13647a(C4908e eVar, C4964k kVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15662a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                z = eVar.mo9854q();
            } else if (c != 2) {
                eVar.mo9852o();
            } else {
                eVar.mo9846i();
                while (eVar.mo9853p()) {
                    C4859b a = C4923g.m13663a(eVar, kVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                eVar.mo9848k();
            }
        }
        return new C4870m(str, arrayList, z);
    }
}
