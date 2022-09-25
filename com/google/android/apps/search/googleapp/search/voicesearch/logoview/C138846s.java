package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.s */
/* compiled from: PG */
final class C138846s extends C138817ad {
    public C138846s() {
        super("MIC ENTER FAST");
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
        if (!C138818ae.m225495h(bVar)) {
            C138818ae.m225489b(bVar, j2);
            return false;
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).f377638e.mo114560c(-6.0f);
        }
        C138818ae.m225493f(bVar);
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (!((C138823a) it2.next()).mo114582g()) {
                return true;
            }
        }
        return false;
    }
}
