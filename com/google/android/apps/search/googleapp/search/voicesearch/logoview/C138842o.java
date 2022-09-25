package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.o */
/* compiled from: PG */
final class C138842o extends C138817ad {
    public C138842o() {
        super("GOOGLE LOGO EXIT");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        bVar.mo114588e(true);
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        bVar.f377650f.f377640g.mo114560c(0.0f);
        bVar.f377651g.f377640g.mo114560c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377641h.mo114560c(0.0f);
            aVar.f377637d.mo114560c(0.0f);
        }
        bVar.mo114588e(false);
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        float f = ((float) (j2 - j)) / 500.0f;
        int i = C138818ae.f377619a;
        C138823a aVar = bVar.f377650f;
        C138823a aVar2 = bVar.f377651g;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar3 = (C138823a) it.next();
            if (f - (((float) bVar.mo114585b(aVar3)) * 0.15f) > 0.0f) {
                aVar3.f377641h.mo114560c(0.0f);
                aVar3.f377637d.mo114560c(0.0f);
                if (aVar3 == aVar || aVar3 == aVar2) {
                    aVar3.f377640g.mo114560c(0.0f);
                }
                C138818ae.m225488a(bVar, aVar3, j2);
            }
        }
        return aVar.mo114583h() || aVar2.mo114583h();
    }
}
