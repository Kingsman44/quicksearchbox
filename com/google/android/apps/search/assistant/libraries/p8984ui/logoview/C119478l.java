package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.l */
/* compiled from: PG */
final class C119478l extends C119456al {

    /* renamed from: E */
    private boolean f333082E;

    public C119478l() {
        super("ROTATION EXIT");
    }

    /* renamed from: d */
    public static final float m198292d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        this.f333082E = false;
        if (!C119457am.m198244l(bVar)) {
            bVar.f333051h.mo104391b(12.0f);
        }
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        if (!this.f333082E) {
            bVar.mo104388g();
            bVar.f333051h.mo104390a();
            C119457am.m198241i(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        if (C119457am.m198244l(bVar)) {
            return false;
        }
        if (!this.f333082E) {
            float f = bVar.f333051h.f333056a.f332975c;
            float d = m198292d(2.7488937f - (bVar.f333045b.f333032b.f332975c + f));
            float d2 = m198292d(2.7488937f - (bVar.f333046c.f333032b.f332975c + f));
            float d3 = m198292d(-0.3926991f - (bVar.f333047d.f333032b.f332975c + f));
            if (d > m198292d(-0.3926991f - (bVar.f333048e.f333032b.f332975c + f)) && d3 > d2 && d < 4.712389f && d3 < 4.712389f) {
                bVar.mo104388g();
                bVar.f333051h.mo104390a();
                C119457am.m198241i(bVar);
                this.f333082E = true;
            }
            return true;
        }
        C119457am.m198237e(bVar, j2);
        return !C119457am.m198244l(bVar);
    }
}
