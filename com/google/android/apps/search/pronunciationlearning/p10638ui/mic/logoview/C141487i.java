package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.i */
/* compiled from: PG */
final class C141487i extends C141492n {
    public C141487i() {
        super("ROTATION EXIT");
    }

    /* renamed from: d */
    public static final float m229634d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
        if (!C141492n.m229654i(bVar)) {
            bVar.f384026f.mo116490b(12.0f);
        }
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        if (!C141492n.m229655j(bVar)) {
            bVar.mo116487c();
            bVar.f384026f.mo116489a();
            C141492n.m229653h(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        if (!C141492n.m229654i(bVar)) {
            if (!C141492n.m229655j(bVar)) {
                float f = bVar.f384026f.f384032a.f383996a.f384006a.f383998b;
                float d = m229634d(2.7488937f - (bVar.f384022b.f384011b.f383996a.f384006a.f383998b + f));
                float d2 = m229634d(2.7488937f - (bVar.f384023c.f384011b.f383996a.f384006a.f383998b + f));
                float d3 = m229634d(-0.3926991f - (bVar.f384024d.f384011b.f383996a.f384006a.f383998b + f));
                if (d > m229634d(-0.3926991f - (bVar.f384025e.f384011b.f383996a.f384006a.f383998b + f)) && d3 > d2 && d < 4.712389f && d3 < 4.712389f) {
                    bVar.mo116487c();
                    bVar.f384026f.mo116489a();
                    C141492n.m229653h(bVar);
                }
                return true;
            }
            m229651f(bVar, j2);
            if (!C141492n.m229654i(bVar)) {
                return true;
            }
        }
        return false;
    }
}
