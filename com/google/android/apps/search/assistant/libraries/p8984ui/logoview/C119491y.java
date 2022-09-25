package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.y */
/* compiled from: PG */
final class C119491y extends C119456al {
    public C119491y() {
        super("MOLECULE_WAVY");
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
            float a = C119457am.m198233a(j2, b);
            C119457am.m198238f(aVar, b, a);
            if (aVar == bVar.f333045b) {
                double d = (double) a;
                Double.isNaN(d);
                if (d % 0.5d < 0.25d) {
                    aVar.f333033c.mo104357c(14.0f);
                } else {
                    aVar.f333033c.mo104357c(12.0f);
                }
            }
        }
        return true;
    }
}
