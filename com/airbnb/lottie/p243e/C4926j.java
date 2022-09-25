package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.C4889d;
import com.airbnb.lottie.p238c.p240b.C4870m;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.e.j */
/* compiled from: PG */
final class C4926j {

    /* renamed from: a */
    private static final C4906c f15677a = C4906c.m13601a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final C4906c f15678b = C4906c.m13601a("shapes");

    /* renamed from: a */
    static C4889d m13666a(C4908e eVar, C4964k kVar) {
        ArrayList arrayList = new ArrayList();
        eVar.mo9847j();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (eVar.mo9853p()) {
            int c2 = eVar.mo9841c(f15677a);
            if (c2 == 0) {
                c = eVar.mo9845h().charAt(0);
            } else if (c2 == 1) {
                eVar.mo9839a();
            } else if (c2 == 2) {
                d = eVar.mo9839a();
            } else if (c2 == 3) {
                str = eVar.mo9845h();
            } else if (c2 == 4) {
                str2 = eVar.mo9845h();
            } else if (c2 != 5) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                eVar.mo9847j();
                while (eVar.mo9853p()) {
                    if (eVar.mo9841c(f15678b) != 0) {
                        eVar.mo9851n();
                        eVar.mo9852o();
                    } else {
                        eVar.mo9846i();
                        while (eVar.mo9853p()) {
                            arrayList.add((C4870m) C4923g.m13663a(eVar, kVar));
                        }
                        eVar.mo9848k();
                    }
                }
                eVar.mo9849l();
            }
        }
        eVar.mo9849l();
        return new C4889d(arrayList, c, d, str, str2);
    }
}
