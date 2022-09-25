package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.u */
/* compiled from: PG */
final class C138848u extends C138817ad {
    public C138848u() {
        super("MOLECULE_EXIT");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        bVar.f377646b.mo114581f(3.1415927f, 12.0f);
        bVar.f377647c.mo114581f(3.1415927f, 4.0f);
        bVar.f377648d.mo114581f(0.0f, 4.0f);
        bVar.f377649e.mo114581f(0.0f, 12.0f);
        bVar.f377650f.mo114581f(0.0f, 8.0f);
        bVar.f377651g.mo114581f(0.0f, 8.0f);
        int i = C138818ae.f377619a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.mo114577b(true);
            aVar.mo114579d(true);
            aVar.mo114580e(true);
            aVar.mo114578c(true);
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            C138823a aVar2 = (C138823a) it2.next();
            aVar2.f377636c.mo114560c(4.0f);
            aVar2.f377637d.mo114560c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        C138818ae.m225491d(bVar);
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        if (j2 - j < 100) {
            bVar.f377646b.f377638e.mo114560c(16.0f);
            bVar.f377647c.f377638e.mo114560c(9.0f);
            bVar.f377648d.f377638e.mo114560c(14.0f);
            bVar.f377649e.f377638e.mo114560c(10.0f);
            return true;
        }
        C138818ae.m225489b(bVar, j2);
        return false;
    }
}
