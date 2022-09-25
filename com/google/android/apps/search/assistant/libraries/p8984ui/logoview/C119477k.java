package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.k */
/* compiled from: PG */
final class C119477k extends C119456al {
    public C119477k() {
        super("REPLY");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198245m(bVar);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).mo104376c(false);
        }
        C119457am.m198245m(bVar);
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        if (j2 - j > 300) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((C119462a) it.next()).mo104376c(true);
            }
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            C119462a aVar = (C119462a) it2.next();
            aVar.f333031a.mo104357c((aVar.f333043m * 4.0f) + 4.0f);
        }
        return true;
    }
}
