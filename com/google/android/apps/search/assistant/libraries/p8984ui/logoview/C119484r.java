package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.r */
/* compiled from: PG */
final class C119484r extends C119456al {
    public C119484r() {
        super("MIC_EXIT");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333039i.mo104357c(0.0f);
            aVar.f333034d.mo104357c(0.0f);
            aVar.f333035e.mo104357c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        bVar.f333046c.f333039i.mo104357c(0.0f);
        bVar.f333047d.f333039i.mo104357c(0.0f);
        bVar.f333048e.f333039i.mo104357c(0.0f);
        if (bVar.f333046c.f333039i.f332975c < 0.5f) {
            bVar.f333045b.f333039i.mo104357c(0.0f);
            bVar.f333046c.f333034d.mo104357c(0.0f);
            bVar.f333047d.f333034d.mo104357c(0.0f);
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119457am.m198236d(bVar, (C119462a) it.next(), j2);
        }
        Iterator it2 = bVar.iterator();
        while (it2.hasNext()) {
            if (((C119462a) it2.next()).mo104379f()) {
                return true;
            }
        }
        return false;
    }
}
