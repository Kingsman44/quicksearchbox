package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.libraries.elements.interfaces.C21319z;
import p5488io.p5490b.C70121m;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.f.a.h */
/* compiled from: PG */
public final /* synthetic */ class C21084h implements C70121m {

    /* renamed from: a */
    public final /* synthetic */ C21092p f59093a;

    /* renamed from: b */
    public final /* synthetic */ C21319z f59094b;

    public /* synthetic */ C21084h(C21092p pVar, C21319z zVar) {
        this.f59093a = pVar;
        this.f59094b = zVar;
    }

    /* renamed from: a */
    public final void mo26136a(C69977g gVar) {
        C2082cp cpVar;
        C69977g gVar2 = gVar;
        C21092p pVar = this.f59093a;
        C21319z zVar = this.f59094b;
        View d = zVar.mo26801d();
        int i = 0;
        int intValue = zVar.mo26813n() != null ? zVar.mo26813n().intValue() : 0;
        if (zVar.mo26812m() != null) {
            i = zVar.mo26812m().intValue();
        }
        int a = C21092p.m39624a(pVar.f59124d, intValue);
        int a2 = C21092p.m39624a(pVar.f59124d, i);
        if (d == null) {
            cpVar = C21092p.m39625b();
        } else {
            cpVar = C2043bi.m5597z(d);
            if (cpVar == null) {
                cpVar = C21092p.m39625b();
            }
        }
        C2082cp cpVar2 = cpVar;
        C21092p pVar2 = pVar;
        C69977g gVar3 = gVar;
        View view = d;
        int i2 = a;
        int i3 = a2;
        C21086j jVar = new C21086j(pVar2, gVar3, view, i2, i3, cpVar2);
        C21087k kVar = new C21087k();
        C21088l lVar = r1;
        C21088l lVar2 = new C21088l(pVar2, gVar3, view, i2, i3, cpVar2);
        pVar.f59121a.addTouchExplorationStateChangeListener(lVar);
        if (d != null) {
            d.addOnLayoutChangeListener(jVar);
            C2043bi.m5555ai(d, new C21089m(pVar, gVar, d, a, a2));
        }
        pVar.f59123c.mo26143a(kVar);
        gVar2.mo61553c(new C21090n(pVar, d, jVar, kVar, lVar));
        gVar2.mo61552b(pVar.mo26150d(d, a, a2, cpVar2));
    }
}
