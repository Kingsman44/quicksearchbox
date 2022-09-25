package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.w */
/* compiled from: PG */
final class C138850w extends C138817ad {

    /* renamed from: w */
    private final int[] f377685w = {0, 2, 3, 1};

    public C138850w() {
        super("MOLECULE_APPEAR");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225494g(bVar);
        bVar.f377653i.mo114560c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377638e.mo114560c(C138817ad.f377596a[bVar.mo114585b(aVar)] + 10.0f);
        }
        bVar.mo114587d();
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377638e.mo114560c(C138817ad.f377596a[bVar.mo114585b(aVar)]);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        float f = ((float) (j2 - j)) / 300.0f;
        int i = C138818ae.f377619a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            int b = bVar.mo114585b(aVar);
            float f2 = f - (((float) this.f377685w[b]) * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                aVar.f377638e.mo114560c(C138817ad.f377596a[b] - 0.125f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                aVar.f377638e.mo114560c(C138817ad.f377596a[b]);
            }
        }
        bVar.f377653i.mo114560c(f);
        return f < 1.0f;
    }
}
