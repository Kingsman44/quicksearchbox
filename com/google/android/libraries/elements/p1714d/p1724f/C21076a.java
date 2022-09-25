package com.google.android.libraries.elements.p1714d.p1724f;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.youtube.p5283a.p5284a.C68041ad;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68059av;
import com.youtube.p5283a.p5284a.C68060aw;
import com.youtube.p5283a.p5284a.C68098t;
import java.util.concurrent.Callable;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5519k.C70115c;

/* renamed from: com.google.android.libraries.elements.d.f.a */
/* compiled from: PG */
public final /* synthetic */ class C21076a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C68098t f59081a;

    /* renamed from: b */
    public final /* synthetic */ C21232ab f59082b;

    /* renamed from: c */
    public final /* synthetic */ C70120l f59083c;

    public /* synthetic */ C21076a(C68098t tVar, C21232ab abVar, C70120l lVar) {
        this.f59081a = tVar;
        this.f59082b = abVar;
        this.f59083c = lVar;
    }

    public final Object call() {
        C68098t tVar = this.f59081a;
        C21232ab abVar = this.f59082b;
        C70120l lVar = this.f59083c;
        C21279bv a = C21279bv.m40117a(tVar.mo16918f(10));
        C68045ah h = tVar.mo60251h();
        if (h == null) {
            return new C70115c(a);
        }
        C68059av avVar = null;
        int i = 0;
        C68041ad adVar = null;
        for (int i2 = 0; i2 < h.mo60108g(); i2++) {
            C68044ag h2 = h.mo60109h(i2);
            if (h2 != null) {
                int i3 = h2.mo60106i();
                if (i3 == 188490103) {
                    avVar = C68059av.m98306i(h2.mo16918f(6));
                } else if (i3 == 212323971) {
                    adVar = C68041ad.m98263i(h2.mo16918f(6));
                }
            }
        }
        if (avVar == null && adVar == null) {
            return new C70115c(a);
        }
        if (avVar == null || adVar == null || avVar.mo60140h() == adVar.mo60104h()) {
            C58490gz gzVar = new C58490gz(4);
            if (avVar != null) {
                int h3 = avVar.mo60140h();
                C58490gz gzVar2 = new C58490gz(4);
                C68060aw awVar = new C68060aw();
                while (i < avVar.mo60139g()) {
                    avVar.mo60141j(awVar, i);
                    if (awVar.mo60143h() != null) {
                        gzVar2.mo55429h(awVar.mo60143h(), Integer.valueOf(awVar.mo60142g()));
                    }
                    i++;
                }
                gzVar.mo55433l(gzVar2.mo55427f(true));
                i = h3;
            }
            if (adVar != null) {
                i = adVar.mo60104h();
                gzVar.mo55433l(C58495hd.m89900n("/environment", Integer.valueOf(adVar.mo60103g())));
            }
            return C21101i.m39636a(C21099g.m39633a(a), i, gzVar.mo55427f(true), abVar, lVar);
        }
        throw new C21260bc("ComponentType localEntitiesConfig.resultField=" + avVar.mo60140h() + ", environmentEntitiesConfig.resultField=" + adVar.mo60104h());
    }
}
