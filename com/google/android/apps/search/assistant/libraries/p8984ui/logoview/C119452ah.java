package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.ah */
/* compiled from: PG */
final class C119452ah extends C119456al {
    public C119452ah() {
        super("USER_SPEAKS");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198241i(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).f333035e.mo104357c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).f333036f.mo104357c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            float f = aVar.f333043m;
            int b = bVar.mo104383b(aVar);
            aVar.f333036f.mo104357c(f * (b != 0 ? b != 1 ? b != 2 ? b != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
