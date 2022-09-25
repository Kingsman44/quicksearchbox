package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9398d.C124599a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.j */
/* compiled from: PG */
final class C95940j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f268641a;

    /* renamed from: b */
    final /* synthetic */ C95950t f268642b;

    public C95940j(C95950t tVar, long j) {
        this.f268642b = tVar;
        this.f268641a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15758)).mo56386p("DCI failure during OTA Abort (OTA was not aborted)");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        try {
            ((C124599a) obj).mo90217e(this.f268641a);
        } catch (IllegalArgumentException e) {
            C59104x c = C95950t.f268659c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15759)).mo56389s("No session available for %s", this.f268642b.f268660d.mo89270k());
        }
    }
}
