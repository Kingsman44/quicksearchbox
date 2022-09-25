package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.x */
/* compiled from: PG */
final class C119490x extends C119456al {
    public C119490x() {
        super("MOLECULE_EXIT");
    }

    /* renamed from: a */
    public final void mo104363a(C119463b bVar) {
        bVar.f333045b.mo104378e(3.1415927f, 12.0f);
        bVar.f333046c.mo104378e(3.1415927f, 4.0f);
        bVar.f333047d.mo104378e(0.0f, 4.0f);
        bVar.f333048e.mo104378e(0.0f, 12.0f);
        bVar.f333049f.mo104378e(0.0f, 8.0f);
        bVar.f333050g.mo104378e(0.0f, 8.0f);
        C119457am.m198234b(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333033c.mo104357c(4.0f);
            aVar.f333034d.mo104357c(0.0f);
            aVar.f333040j.mo104357c(1.0f);
        }
    }

    /* renamed from: b */
    public final void mo104364b(C119463b bVar) {
        C119457am.m198240h(bVar);
    }

    /* renamed from: c */
    public final boolean mo104365c(long j, long j2, C119463b bVar) {
        if (j2 - j < 100) {
            bVar.f333045b.f333035e.mo104357c(16.0f);
            bVar.f333046c.f333035e.mo104357c(9.0f);
            bVar.f333047d.f333035e.mo104357c(14.0f);
            bVar.f333048e.f333035e.mo104357c(10.0f);
            return true;
        }
        C119457am.m198237e(bVar, j2);
        return false;
    }
}
