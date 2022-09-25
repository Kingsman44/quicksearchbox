package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88234uc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88235ud;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88236ue;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.y */
/* compiled from: PG */
public final /* synthetic */ class C116526y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323101a;

    /* renamed from: b */
    public final /* synthetic */ int f323102b;

    public /* synthetic */ C116526y(C116502ad adVar, int i) {
        this.f323101a = adVar;
        this.f323102b = i;
    }

    public final void run() {
        C116502ad adVar = this.f323101a;
        int i = this.f323102b;
        C88235ud udVar = (C88235ud) C88236ue.f238483c.createBuilder();
        udVar.copyOnWrite();
        C88236ue ueVar = (C88236ue) udVar.instance;
        ueVar.f238485a |= 1;
        ueVar.f238486b = i;
        C86610af afVar = adVar.f323014e;
        C87684al alVar = new C87684al(C88244um.SCROLL_MAIN_CONTENT);
        alVar.mo81965b(C88234uc.f238482a, (C88236ue) udVar.build());
        afVar.mo80228i(alVar.mo81964a());
    }
}
