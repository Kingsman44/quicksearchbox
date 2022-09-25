package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.m */
/* compiled from: PG */
final class C138840m extends C138817ad {
    public C138840m() {
        super("GOOGLE LOGO ENTER");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225492e(bVar);
        bVar.mo114588e(true);
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377641h.mo114560c(1.0f);
            aVar.f377640g.mo114560c(1.0f);
            aVar.f377637d.mo114560c(bVar.mo114584a(aVar));
            aVar.f377638e.mo114560c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        if (C138818ae.m225495h(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C138823a aVar = (C138823a) it.next();
                if (f - (((float) bVar.mo114585b(aVar)) * 0.15f) > 0.0f) {
                    aVar.f377641h.mo114560c(1.0f);
                    aVar.f377640g.mo114560c(1.0f);
                    aVar.f377637d.mo114560c(bVar.mo114584a(aVar));
                    aVar.f377638e.mo114560c(0.0f);
                } else {
                    C138818ae.m225488a(bVar, aVar, j2);
                }
            }
            if (f < 1.0f) {
                return true;
            }
            return false;
        }
        C138818ae.m225489b(bVar, j2);
        return true;
    }
}
