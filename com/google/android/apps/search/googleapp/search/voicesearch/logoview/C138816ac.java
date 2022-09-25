package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.ac */
/* compiled from: PG */
final class C138816ac extends C138817ad {
    public C138816ac() {
        super("GOT IT");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225492e(bVar);
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).f377638e.mo114560c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        float f = ((float) (j2 - j)) / 1000.0f;
        int i = C138818ae.f377619a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            float b = f - (((float) bVar.mo114585b(aVar)) * 0.05f);
            if (b < 0.0f) {
                C138818ae.m225488a(bVar, aVar, j2);
            } else if (b < 0.15f) {
                aVar.f377638e.mo114560c(-8.0f);
            } else if (b < 0.3f) {
                aVar.f377638e.mo114560c(8.0f);
            } else {
                C138818ae.m225488a(bVar, aVar, j2);
            }
        }
        return f < 1.0f;
    }
}
