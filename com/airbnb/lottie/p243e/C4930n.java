package com.airbnb.lottie.p243e;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4845c;
import com.airbnb.lottie.p238c.p239a.C4846d;
import com.airbnb.lottie.p238c.p239a.C4848f;
import com.airbnb.lottie.p238c.p240b.C4862e;
import com.airbnb.lottie.p238c.p240b.C4872o;
import com.airbnb.lottie.p238c.p240b.C4873p;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p246g.C4956a;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.p3723ar.imp.view.C48004n;
import com.google.research.xeno.effect.C66412o;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.e.n */
/* compiled from: PG */
final class C4930n {

    /* renamed from: a */
    private static final C4906c f15683a = C4906c.m13601a("nm", C30325g.f82003a, C66412o.f180592a, C42181t.f110467a, C59002s.f156871a, "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C4906c f15684b = C4906c.m13601a("p", C19621k.f54601a);

    /* renamed from: c */
    private static final C4906c f15685c = C4906c.m13601a(C48004n.f124238a, "v");

    /* renamed from: a */
    static C4862e m13670a(C4908e eVar, C4964k kVar) {
        C4845c cVar;
        C4908e eVar2 = eVar;
        C4964k kVar2 = kVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        C4845c cVar2 = null;
        C4848f fVar = null;
        C4848f fVar2 = null;
        C4844b bVar = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        C4844b bVar2 = null;
        boolean z = false;
        C4846d dVar = null;
        while (eVar.mo9853p()) {
            switch (eVar2.mo9841c(f15683a)) {
                case 0:
                    str = eVar.mo9845h();
                    break;
                case 1:
                    eVar.mo9847j();
                    int i4 = -1;
                    while (eVar.mo9853p()) {
                        int c = eVar2.mo9841c(f15684b);
                        if (c != 0) {
                            cVar = cVar2;
                            if (c != 1) {
                                eVar.mo9851n();
                                eVar.mo9852o();
                            } else {
                                cVar2 = C4920d.m13656c(eVar2, kVar2, i4);
                            }
                        } else {
                            cVar = cVar2;
                            i4 = eVar.mo9840b();
                        }
                        cVar2 = cVar;
                    }
                    C4845c cVar3 = cVar2;
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
                    bVar = C4920d.m13655b(eVar2, kVar2, true);
                    break;
                case 7:
                    i2 = C4872o.m13529b()[eVar.mo9840b() - 1];
                    break;
                case 8:
                    i3 = C4873p.m13531b()[eVar.mo9840b() - 1];
                    break;
                case 9:
                    f = (float) eVar.mo9839a();
                    break;
                case 10:
                    z = eVar.mo9854q();
                    break;
                case 11:
                    eVar.mo9846i();
                    while (eVar.mo9853p()) {
                        eVar.mo9847j();
                        C4844b bVar3 = null;
                        String str2 = null;
                        while (eVar.mo9853p()) {
                            int c2 = eVar2.mo9841c(f15685c);
                            if (c2 != 0) {
                                C4844b bVar4 = bVar2;
                                if (c2 != 1) {
                                    eVar.mo9851n();
                                    eVar.mo9852o();
                                } else {
                                    bVar3 = C4920d.m13655b(eVar2, kVar2, true);
                                }
                                bVar2 = bVar4;
                            } else {
                                C4844b bVar5 = bVar2;
                                str2 = eVar.mo9845h();
                            }
                        }
                        C4844b bVar6 = bVar2;
                        eVar.mo9849l();
                        String str3 = str2;
                        if (str3.equals(C66412o.f180592a)) {
                            bVar2 = bVar3;
                        } else {
                            if (str3.equals("d") || str3.equals(C30325g.f82003a)) {
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar6;
                        }
                    }
                    C4844b bVar7 = bVar2;
                    eVar.mo9848k();
                    if (arrayList.size() == 1) {
                        arrayList.add((C4844b) arrayList.get(0));
                    }
                    bVar2 = bVar7;
                    break;
                default:
                    eVar.mo9851n();
                    eVar.mo9852o();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new C4846d(Collections.singletonList(new C4956a(100)));
        }
        return new C4862e(str, i, cVar2, dVar, fVar, fVar2, bVar, i2, i3, f, arrayList, bVar2, z);
    }
}
