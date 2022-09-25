package com.google.android.apps.gsa.staticplugins.p7877dx.p7880c;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.c.b */
/* compiled from: PG */
public final class C100298b implements C100297a {

    /* renamed from: a */
    private final C23112h f280481a;

    public C100298b(C23112h hVar) {
        this.f280481a = hVar;
    }

    /* renamed from: h */
    public final void mo91868h(C90208n nVar) {
        Bundle bundle = new Bundle();
        C90208n.values();
        bundle.putInt("tab", nVar.ordinal());
        this.f280481a.mo28345s("onTabClicked_com.google.android.apps.gsa.shared.monet.features.tabnavigation.TabNavigationProto.TabNavigationTabType", "TabNavigationEventsDispatcher", bundle);
    }
}
