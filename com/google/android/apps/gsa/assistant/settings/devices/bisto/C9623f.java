package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.f */
/* compiled from: PG */
final class C9623f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C9624g f33314a;

    public C9623f(C9624g gVar) {
        this.f33314a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C9624g.f33315i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoAudioOutputCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(343)).mo56389s("Failed to get deviceinfo for %s", this.f33314a.f33317k);
        this.f33314a.mo17798i();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f33314a.mo17912a(((C124548d) obj).mo106465F());
    }
}
