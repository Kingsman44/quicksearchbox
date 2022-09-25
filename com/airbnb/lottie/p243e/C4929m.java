package com.airbnb.lottie.p243e;

import android.graphics.Path;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4845c;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p239a.C4848f;
import com.airbnb.lottie.p238c.p240b.C4861d;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p246g.C4956a;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.research.xeno.effect.C66412o;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.e.m */
/* compiled from: PG */
final class C4929m {

    /* renamed from: a */
    private static final C4906c f15681a = C4906c.m13601a("nm", C30325g.f82003a, C66412o.f180592a, C42181t.f110467a, C59002s.f156871a, "e", C33259r.f88929b, "hd");

    /* renamed from: b */
    private static final C4906c f15682b = C4906c.m13601a("p", C19621k.f54601a);

    /* renamed from: a */
    static C4861d m13669a(C4908e eVar, C4964k kVar) {
        C4846d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C4845c cVar = null;
        C4848f fVar = null;
        C4848f fVar2 = null;
        int i = 0;
        boolean z = false;
        while (eVar.mo9853p()) {
            switch (eVar.mo9841c(f15681a)) {
                case 0:
                    str = eVar.mo9845h();
                    break;
                case 1:
                    eVar.mo9847j();
                    int i2 = -1;
                    while (eVar.mo9853p()) {
                        int c = eVar.mo9841c(f15682b);
                        if (c == 0) {
                            i2 = eVar.mo9840b();
                        } else if (c != 1) {
                            eVar.mo9851n();
                            eVar.mo9852o();
                        } else {
                            cVar = C4920d.m13656c(eVar, kVar, i2);
                        }
                    }
                    eVar.mo9849l();
                    break;
                case 2:
                    dVar = C4920d.m13657d(eVar, kVar);
                    break;
                case 3:
                    if (eVar.mo9840b() != 1) {
                        i = 2;
                        break;
                    } else {
                        i = 1;
                        break;
                    }
                case 4:
                    fVar = C4920d.m13658e(eVar, kVar);
                    break;
                case 5:
                    fVar2 = C4920d.m13658e(eVar, kVar);
                    break;
                case 6:
                    if (eVar.mo9840b() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    z = eVar.mo9854q();
                    break;
                default:
                    eVar.mo9851n();
                    eVar.mo9852o();
                    break;
            }
        }
        return new C4861d(str, i, fillType, cVar, dVar == null ? new C4846d(Collections.singletonList(new C4956a(100))) : dVar, fVar, fVar2, z);
    }
}
