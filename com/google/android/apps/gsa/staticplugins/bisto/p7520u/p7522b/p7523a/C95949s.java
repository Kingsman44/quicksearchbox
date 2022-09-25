package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.C124599a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.s */
/* compiled from: PG */
final class C95949s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95950t f268658a;

    public C95949s(C95950t tVar) {
        this.f268658a = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            C59104x c = C95950t.f268659c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15780)).mo56389s("No OTA session available for %s", this.f268658a.f268660d.mo89270k());
            return;
        }
        C59104x c2 = C95950t.f268659c.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(th)).mo56372aa(15779)).mo56386p("Error getting OTA session");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124599a aVar = (C124599a) obj;
    }
}
