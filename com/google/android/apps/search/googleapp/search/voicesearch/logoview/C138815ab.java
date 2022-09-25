package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.ab */
/* compiled from: PG */
final class C138815ab extends C138817ad {
    public C138815ab() {
        super("USER_SPEAKS");
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        C138818ae.m225492e(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).f377638e.mo114560c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C138823a) it.next()).f377639f.mo114560c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            float f = aVar.f377644k;
            int b = bVar.mo114585b(aVar);
            aVar.f377639f.mo114560c(f * (b != 0 ? b != 1 ? b != 2 ? b != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
