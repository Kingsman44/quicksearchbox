package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.q */
/* compiled from: PG */
final class C119483q extends C119456al {
    public C119483q() {
        super("MIC ENTER");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        C119457am.m198239g(bVar);
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        if (C119457am.m198244l(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C119462a aVar = (C119462a) it.next();
                if (f - (((float) bVar.mo104383b(aVar)) * 0.15f) < 0.0f) {
                    C119457am.m198236d(bVar, aVar, j2);
                } else {
                    aVar.f333035e.mo104357c(-6.0f);
                }
            }
            if (((double) bVar.f333045b.f333035e.f332975c) < -5.666999816894531d) {
                C119457am.m198242j(bVar);
            }
            Iterator it2 = bVar.iterator();
            while (it2.hasNext()) {
                if (!((C119462a) it2.next()).mo104379f()) {
                    return true;
                }
            }
            return false;
        }
        C119457am.m198237e(bVar, j2);
        return true;
    }
}
