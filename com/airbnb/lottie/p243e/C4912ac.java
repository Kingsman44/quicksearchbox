package com.airbnb.lottie.p243e;

import android.graphics.Path;
import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4843a;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p240b.C4869l;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p246g.C4956a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.research.xeno.effect.C66412o;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.e.ac */
/* compiled from: PG */
final class C4912ac {

    /* renamed from: a */
    private static final C4906c f15661a = C4906c.m13601a("nm", C45240c.f118157a, C66412o.f180592a, "fillEnabled", C33259r.f88929b, "hd");

    /* renamed from: a */
    static C4869l m13646a(C4908e eVar, C4964k kVar) {
        C4846d dVar = null;
        String str = null;
        C4843a aVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15661a);
            if (c == 0) {
                str = eVar.mo9845h();
            } else if (c == 1) {
                aVar = C4920d.m13654a(eVar, kVar);
            } else if (c == 2) {
                dVar = C4920d.m13657d(eVar, kVar);
            } else if (c == 3) {
                z = eVar.mo9854q();
            } else if (c == 4) {
                i = eVar.mo9840b();
            } else if (c != 5) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                z2 = eVar.mo9854q();
            }
        }
        if (dVar == null) {
            dVar = new C4846d(Collections.singletonList(new C4956a(100)));
        }
        return new C4869l(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z2);
    }
}
