package com.airbnb.lottie.p243e;

import com.airbnb.lottie.p238c.C4876c;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.k */
/* compiled from: PG */
final class C4927k {

    /* renamed from: a */
    private static final C4906c f15679a = C4906c.m13601a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C4876c m13667a(C4908e eVar) {
        eVar.mo9847j();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15679a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                str2 = eVar.mo9845h();
            } else if (c == 2) {
                str3 = eVar.mo9845h();
            } else if (c != 3) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                eVar.mo9839a();
            }
        }
        eVar.mo9849l();
        return new C4876c(str, str2, str3);
    }
}
