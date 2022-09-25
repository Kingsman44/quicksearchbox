package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96026d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.k */
/* compiled from: PG */
final class C95941k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95950t f268643a;

    /* renamed from: b */
    final /* synthetic */ C96026d f268644b;

    public C95941k(C95950t tVar, C96026d dVar) {
        this.f268643a = tVar;
        this.f268644b = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59104x b = C95950t.f268659c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) b).mo56372aa(15761)).mo56386p("TWS role change future cancelled");
            return;
        }
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15760)).mo56386p("reinit after TWS role change failed");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f268644b.f268868a.equals("PhoneCallStatNew") || this.f268644b.f268868a.equals("OffHeadState") || this.f268644b.f268868a.equals("OffHeadStateInteracting") || this.f268644b.f268868a.equals("ReadyNoAudClassicState") || this.f268644b.f268868a.equals("ReadyClassicState")) {
            ((C95848i) this.f268643a.f268662f.mo27525b()).mo89816a();
        }
    }
}
