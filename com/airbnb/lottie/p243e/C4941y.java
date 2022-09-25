package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4848f;
import com.airbnb.lottie.p238c.p239a.C4855m;
import com.airbnb.lottie.p238c.p240b.C4866i;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;

/* renamed from: com.airbnb.lottie.e.y */
/* compiled from: PG */
final class C4941y {

    /* renamed from: a */
    private static final C4906c f15704a = C4906c.m13601a("nm", "p", C59002s.f156871a, C33259r.f88929b, "hd");

    /* renamed from: a */
    static C4866i m13687a(C4908e eVar, C4964k kVar) {
        String str = null;
        C4855m mVar = null;
        C4848f fVar = null;
        C4844b bVar = null;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15704a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                mVar = C4903a.m13600b(eVar, kVar);
            } else if (c == 2) {
                fVar = C4920d.m13658e(eVar, kVar);
            } else if (c == 3) {
                bVar = C4920d.m13655b(eVar, kVar, true);
            } else if (c != 4) {
                eVar.mo9852o();
            } else {
                z = eVar.mo9854q();
            }
        }
        return new C4866i(str, mVar, fVar, bVar, z);
    }
}
