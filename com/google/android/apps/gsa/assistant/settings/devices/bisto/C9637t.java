package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.t */
/* compiled from: PG */
final class C9637t implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C9638u f33354a;

    public C9637t(C9638u uVar) {
        this.f33354a = uVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C9638u.f33355i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoHWController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(354)).mo56389s("Failed to get deviceinfo for %s", this.f33354a.f33356j);
        this.f33354a.mo17798i();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59104x b = C9638u.f33355i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoHWController");
        ((C59052c) ((C59052c) b).mo56372aa(355)).mo56386p("onSuccess");
        this.f33354a.mo17917a((C124548d) obj);
    }
}
