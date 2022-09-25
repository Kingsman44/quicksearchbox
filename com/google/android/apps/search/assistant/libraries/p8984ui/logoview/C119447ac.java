package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.ac */
/* compiled from: PG */
final class C119447ac extends C119456al {

    /* renamed from: E */
    private final int[] f332983E = {0, 2, 3, 1};

    public C119447ac() {
        super("MOLECULE_APPEAR");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198243k(bVar);
        bVar.f333052i.mo104357c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333035e.mo104357c(C119456al.f332988a[bVar.mo104383b(aVar)] + 10.0f);
        }
        bVar.mo104386e();
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333035e.mo104357c(C119456al.f332988a[bVar.mo104383b(aVar)]);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        float f = ((float) (j2 - j)) / 300.0f;
        int i = C119457am.f333015a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            int b = bVar.mo104383b(aVar);
            float f2 = f - (((float) this.f332983E[b]) * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                aVar.f333035e.mo104357c(C119456al.f332988a[b] - 0.125f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                aVar.f333035e.mo104357c(C119456al.f332988a[b]);
            }
        }
        bVar.f333052i.mo104357c(f);
        return f < 1.0f;
    }
}
