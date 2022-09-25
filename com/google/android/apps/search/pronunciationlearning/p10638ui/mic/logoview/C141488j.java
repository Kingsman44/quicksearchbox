package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.j */
/* compiled from: PG */
final class C141488j extends C141492n {
    public C141488j() {
        super("ENSURE DOTS ON LINE");
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
        C141492n.m229653h(bVar);
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C141476a aVar = (C141476a) it.next();
            aVar.f384011b.f383996a.f384006a.f384001e = true;
            aVar.f384010a.mo116481a();
            aVar.f384011b.f383996a.mo116481a();
            aVar.f384012c.mo116481a();
            aVar.f384014e.mo116481a();
            aVar.f384013d.mo116481a();
        }
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        m229651f(bVar, j2);
        return !C141492n.m229654i(bVar);
    }
}
