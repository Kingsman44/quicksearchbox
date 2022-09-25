package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.n */
/* compiled from: PG */
final class C119480n extends C119456al {
    public C119480n() {
        super("GOOGLE LOGO ENTER");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198241i(bVar);
        bVar.mo104387f(true);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333038h.mo104357c(1.0f);
            aVar.f333037g.mo104357c(1.0f);
            aVar.f333034d.mo104357c(bVar.mo104382a(aVar));
            aVar.f333035e.mo104357c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        if (C119457am.m198244l(bVar)) {
            float f = ((float) (j2 - j)) / 300.0f;
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C119462a aVar = (C119462a) it.next();
                if (f - (((float) bVar.mo104383b(aVar)) * 0.15f) > 0.0f) {
                    aVar.f333038h.mo104357c(1.0f);
                    aVar.f333037g.mo104357c(1.0f);
                    aVar.f333034d.mo104357c(bVar.mo104382a(aVar));
                    aVar.f333035e.mo104357c(0.0f);
                } else {
                    C119457am.m198236d(bVar, aVar, j2);
                }
            }
            if (f < 1.0f) {
                return true;
            }
            return false;
        }
        C119457am.m198237e(bVar, j2);
        return true;
    }
}
