package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.ak */
/* compiled from: PG */
final class C119455ak extends C119456al {
    public C119455ak() {
        super("LISTENING_GOT_IT_LOOPED");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198241i(bVar);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).f333035e.mo104357c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        float f = ((float) (j2 - j)) / 1000.0f;
        int i = C119457am.f333015a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            float b = f - (((float) bVar.mo104383b(aVar)) * 0.05f);
            if (b < 0.0f) {
                C119457am.m198236d(bVar, aVar, j2);
            } else {
                float f2 = b % 1.3f;
                if (f2 < 0.15f) {
                    aVar.f333035e.mo104357c(-8.0f);
                } else if (f2 < 0.3f) {
                    aVar.f333035e.mo104357c(8.0f);
                } else {
                    C119457am.m198236d(bVar, aVar, j2);
                }
            }
        }
        return true;
    }
}
