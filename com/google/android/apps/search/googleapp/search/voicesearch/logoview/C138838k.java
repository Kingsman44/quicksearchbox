package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.k */
/* compiled from: PG */
final class C138838k extends C138817ad {

    /* renamed from: w */
    private boolean f377683w;

    public C138838k() {
        super("ROTATION EXIT");
    }

    /* renamed from: d */
    public static final float m225538d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* renamed from: a */
    public final void mo114566a(C138824b bVar) {
        this.f377683w = false;
        if (!C138818ae.m225495h(bVar)) {
            bVar.f377652h.mo114592b(12.0f);
        }
    }

    /* renamed from: b */
    public final void mo114567b(C138824b bVar) {
        if (!this.f377683w) {
            bVar.mo114589f();
            bVar.f377652h.mo114591a();
            C138818ae.m225492e(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo114568c(long j, long j2, C138824b bVar) {
        if (C138818ae.m225495h(bVar)) {
            return false;
        }
        if (!this.f377683w) {
            float f = bVar.f377652h.f377657a.f377589c;
            float d = m225538d(2.7488937f - (bVar.f377646b.f377635b.f377589c + f));
            float d2 = m225538d(2.7488937f - (bVar.f377647c.f377635b.f377589c + f));
            float d3 = m225538d(-0.3926991f - (bVar.f377648d.f377635b.f377589c + f));
            if (d > m225538d(-0.3926991f - (bVar.f377649e.f377635b.f377589c + f)) && d3 > d2 && d < 4.712389f && d3 < 4.712389f) {
                bVar.mo114589f();
                bVar.f377652h.mo114591a();
                C138818ae.m225492e(bVar);
                this.f377683w = true;
            }
            return true;
        }
        C138818ae.m225489b(bVar, j2);
        return !C138818ae.m225495h(bVar);
    }
}
