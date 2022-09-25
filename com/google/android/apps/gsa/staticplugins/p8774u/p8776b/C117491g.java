package com.google.android.apps.gsa.staticplugins.p8774u.p8776b;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.b.g */
/* compiled from: PG */
public final class C117491g implements C117490f {

    /* renamed from: a */
    private final C23112h f326121a;

    public C117491g(C23112h hVar) {
        this.f326121a = hVar;
    }

    /* renamed from: f */
    public final void mo103315f() {
        this.f326121a.mo28345s("onChildShown", "BottomSheetEventsDispatcher", new Bundle());
    }

    /* renamed from: h */
    public final void mo103316h() {
        this.f326121a.mo28345s("onScroll", "BottomSheetEventsDispatcher", new Bundle());
    }

    /* renamed from: i */
    public final void mo103317i(C117489e eVar) {
        Bundle bundle = new Bundle();
        C117489e.values();
        bundle.putInt("touchArea", eVar.ordinal());
        this.f326121a.mo28345s("onTouch_com.google.android.apps.gsa.staticplugins.bottomsheet.shared.BottomSheetEvents.TouchArea", "BottomSheetEventsDispatcher", bundle);
    }
}
