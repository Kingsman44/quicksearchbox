package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.p */
/* compiled from: PG */
final class C119482p extends C119456al {
    public C119482p() {
        super("GOOGLE LOGO EXIT");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        bVar.mo104387f(true);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        bVar.f333049f.f333037g.mo104357c(0.0f);
        bVar.f333050g.f333037g.mo104357c(0.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333038h.mo104357c(0.0f);
            aVar.f333034d.mo104357c(0.0f);
        }
        bVar.mo104387f(false);
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        float f = ((float) (j2 - j)) / 500.0f;
        int i = C119457am.f333015a;
        C119462a aVar = bVar.f333049f;
        C119462a aVar2 = bVar.f333050g;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar3 = (C119462a) it.next();
            if (f - (((float) bVar.mo104383b(aVar3)) * 0.15f) > 0.0f) {
                aVar3.f333038h.mo104357c(0.0f);
                aVar3.f333034d.mo104357c(0.0f);
                if (aVar3 == aVar || aVar3 == aVar2) {
                    aVar3.f333037g.mo104357c(0.0f);
                }
                C119457am.m198236d(bVar, aVar3, j2);
            }
        }
        return aVar.mo104380g() || aVar2.mo104380g();
    }
}
