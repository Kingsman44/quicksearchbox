package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.i */
/* compiled from: PG */
final class C119475i extends C119456al {
    public C119475i() {
        super("DIDN'T GET IT");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        C119457am.m198241i(bVar);
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C119462a) it.next()).f333034d.mo104357c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        float f = ((float) (j2 - j)) / 550.0f;
        int i = C119457am.f333015a;
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333034d.mo104357c((float) (Math.sin((double) ((f - (((float) bVar.mo104383b(aVar)) * 0.030909091f)) * 6.2831855f * 3.0f)) * 6.0d));
            C119457am.m198236d(bVar, aVar, j2);
        }
        return f < 1.0f;
    }
}
