package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.z */
/* compiled from: PG */
final class C119492z extends C119456al {
    public C119492z() {
        super("MOLECULE_DRIFTING");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198243k(bVar);
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
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            int b = bVar.mo104383b(aVar);
            C119457am.m198238f(aVar, b, C119457am.m198233a(j2, b));
        }
        return true;
    }
}
