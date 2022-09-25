package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.k */
/* compiled from: PG */
final class C141489k extends C141492n {
    public C141489k() {
        super("MIC ENTER");
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        C141492n.m229652g(bVar);
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        if (C141492n.m229654i(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C141476a aVar = (C141476a) it.next();
                if (f - (((float) bVar.mo116485a(aVar)) * 0.15f) < 0.0f) {
                    m229650e(bVar, aVar, j2);
                } else {
                    aVar.f384014e.f384006a.mo116478c(-6.0f);
                }
            }
            C141476a aVar2 = bVar.f384022b;
            if (((double) aVar2.f384014e.f384006a.f383998b) < -5.666999816894531d) {
                aVar2.f384018i.mo116478c(1.0f);
                bVar.f384023c.f384013d.f384006a.mo116478c(-2.0f);
                bVar.f384024d.f384013d.f384006a.mo116478c(2.0f);
                bVar.f384025e.f384018i.mo116478c(1.0f);
                if (bVar.f384022b.f384018i.f383998b > 0.66f) {
                    bVar.f384023c.f384018i.mo116478c(1.0f);
                    bVar.f384024d.f384018i.mo116478c(1.0f);
                }
            }
            Iterator it2 = bVar.iterator();
            while (it2.hasNext()) {
                if (!((C141476a) it2.next()).mo116484b()) {
                    return true;
                }
            }
            return false;
        }
        m229651f(bVar, j2);
        return true;
    }
}
