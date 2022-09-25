package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.l */
/* compiled from: PG */
final class C141490l extends C141492n {
    public C141490l() {
        super("MIC_EXIT");
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C141476a aVar = (C141476a) it.next();
            aVar.f384018i.mo116478c(0.0f);
            aVar.f384013d.f384006a.mo116478c(0.0f);
            aVar.f384014e.f384006a.mo116478c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        bVar.f384023c.f384018i.mo116478c(0.0f);
        bVar.f384024d.f384018i.mo116478c(0.0f);
        bVar.f384025e.f384018i.mo116478c(0.0f);
        if (bVar.f384023c.f384018i.f383998b < 0.5f) {
            bVar.f384022b.f384018i.mo116478c(0.0f);
            bVar.f384023c.f384013d.f384006a.mo116478c(0.0f);
            bVar.f384024d.f384013d.f384006a.mo116478c(0.0f);
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m229650e(bVar, (C141476a) it.next(), j2);
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (((C141476a) it2.next()).mo116484b()) {
                return true;
            }
        }
        return false;
    }
}
