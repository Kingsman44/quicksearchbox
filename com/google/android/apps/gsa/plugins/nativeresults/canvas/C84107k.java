package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import com.google.android.libraries.componentview.components.p1682a.p1683a.C19758c;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19759d;
import com.google.assistant.p3897e.p3921j.C52561wh;
import com.google.assistant.p3897e.p3921j.C52562wi;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.k */
/* compiled from: PG */
final class C84107k extends C84059a {

    /* renamed from: a */
    static final C84107k f229021a = new C84107k();

    private C84107k() {
    }

    /* renamed from: a */
    public final void mo77514a(C52562wi wiVar, C19758c cVar) {
        String l = Long.toString(wiVar.f137960c);
        cVar.copyOnWrite();
        C19759d dVar = (C19759d) cVar.instance;
        C19759d dVar2 = C19759d.f55189d;
        l.getClass();
        dVar.f55191a |= 2;
        dVar.f55193c = l;
    }

    /* renamed from: d */
    public final void mo77515d(C19759d dVar, C52561wh whVar) {
        long parseLong = Long.parseLong(dVar.f55193c);
        whVar.copyOnWrite();
        C52562wi wiVar = (C52562wi) whVar.instance;
        C52562wi wiVar2 = C52562wi.f137956d;
        wiVar.f137958a |= 2;
        wiVar.f137960c = parseLong;
    }
}
