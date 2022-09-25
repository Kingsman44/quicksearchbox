package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.C124599a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.o */
/* compiled from: PG */
final class C95945o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95950t f268650a;

    public C95945o(C95950t tVar) {
        this.f268650a = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15768)).mo56386p("DCI failure during ACTION_ABORT_OTA Action (OTA was not aborted)");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        try {
            ((C124599a) obj).mo90213a();
        } catch (IllegalArgumentException e) {
            C59104x c = C95950t.f268659c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15769)).mo56389s("No session available for %s", this.f268650a.f268660d.mo89270k());
        }
    }
}
