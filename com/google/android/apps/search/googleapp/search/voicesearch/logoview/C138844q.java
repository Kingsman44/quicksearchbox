package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.q */
/* compiled from: PG */
final class C138844q extends C138817ad {
    public C138844q() {
        super("MIC_EXIT");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377642i.mo114560c(0.0f);
            aVar.f377637d.mo114560c(0.0f);
            aVar.f377638e.mo114560c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        bVar.f377647c.f377642i.mo114560c(0.0f);
        bVar.f377648d.f377642i.mo114560c(0.0f);
        bVar.f377649e.f377642i.mo114560c(0.0f);
        if (bVar.f377647c.f377642i.f377589c < 0.5f) {
            bVar.f377646b.f377642i.mo114560c(0.0f);
            bVar.f377647c.f377637d.mo114560c(0.0f);
            bVar.f377648d.f377637d.mo114560c(0.0f);
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138818ae.m225488a(bVar, (C138823a) it.next(), j2);
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (((C138823a) it2.next()).mo114582g()) {
                return true;
            }
        }
        return false;
    }
}
