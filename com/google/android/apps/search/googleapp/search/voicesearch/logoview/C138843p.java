package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.p */
/* compiled from: PG */
final class C138843p extends C138817ad {
    public C138843p() {
        super("MIC ENTER");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        C138818ae.m225490c(bVar);
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        if (C138818ae.m225495h(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C138823a aVar = (C138823a) it.next();
                if (f - (((float) bVar.mo114585b(aVar)) * 0.15f) < 0.0f) {
                    C138818ae.m225488a(bVar, aVar, j2);
                } else {
                    aVar.f377638e.mo114560c(-6.0f);
                }
            }
            if (((double) bVar.f377646b.f377638e.f377589c) < -5.666999816894531d) {
                C138818ae.m225493f(bVar);
            }
            Iterator it2 = bVar.iterator();
            while (it2.hasNext()) {
                if (!((C138823a) it2.next()).mo114582g()) {
                    return true;
                }
            }
            return false;
        }
        C138818ae.m225489b(bVar, j2);
        return true;
    }
}
