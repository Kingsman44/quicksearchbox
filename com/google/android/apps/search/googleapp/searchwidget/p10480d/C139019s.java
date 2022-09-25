package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;
import p5535j.p5536a.p5545c.p5553d.C71163d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.s */
/* compiled from: PG */
public final /* synthetic */ class C139019s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139025y f378069a;

    /* renamed from: b */
    public final /* synthetic */ String f378070b;

    public /* synthetic */ C139019s(C139025y yVar, String str) {
        this.f378069a = yVar;
        this.f378070b = str;
    }

    public final C60870cx apply(Object obj) {
        C139025y yVar = this.f378069a;
        String str = this.f378070b;
        for (C139006f fVar : ((C139014n) obj).f378064a) {
            if (C58890d.m90990e(fVar.f378040b, str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(yVar.f378084f.mo46039a(new C139015o(fVar), yVar.f378083e));
                if ((fVar.f378039a & 2) != 0) {
                    C139008h hVar = fVar.f378041c;
                    if (hVar == null) {
                        hVar = C139008h.f378043h;
                    }
                    arrayList.add(yVar.mo114657b(hVar, 1));
                } else {
                    C37215b bVar = yVar.f378085g;
                    C37252a c = C37182a.f98239iz.mo40779c();
                    ((C37253b) c).mo40792p(C71163d.f189849e, C139025y.m225808a("SEARCH_ICON"));
                    c.mo40781e(C62722b.OK);
                    bVar.mo19974a(c);
                    arrayList.add(yVar.mo114658c(1));
                }
                if ((fVar.f378039a & 4) != 0) {
                    C139008h hVar2 = fVar.f378042d;
                    if (hVar2 == null) {
                        hVar2 = C139008h.f378043h;
                    }
                    arrayList.add(yVar.mo114657b(hVar2, 2));
                } else {
                    arrayList.add(yVar.mo114658c(2));
                }
                return C47638k.m84752c(arrayList).mo51520a(new C139016p(yVar), yVar.f378082d);
            }
        }
        yVar.f378085g.mo19974a(C37182a.f98196iD.mo40805c(C62722b.OK));
        return C60866ct.f164955a;
    }
}
