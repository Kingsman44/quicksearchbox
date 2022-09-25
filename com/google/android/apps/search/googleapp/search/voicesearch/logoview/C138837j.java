package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.j */
/* compiled from: PG */
final class C138837j extends C138817ad {
    public C138837j() {
        super("REPLY");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225496i(bVar);
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).mo114579d(false);
        }
        C138818ae.m225496i(bVar);
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        if (j2 - j > 300) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((C138823a) it.next()).mo114579d(true);
            }
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            C138823a aVar = (C138823a) it2.next();
            aVar.f377634a.mo114560c((aVar.f377644k * 4.0f) + 4.0f);
        }
        return true;
    }
}
