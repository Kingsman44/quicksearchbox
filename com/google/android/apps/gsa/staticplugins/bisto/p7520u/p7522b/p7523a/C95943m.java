package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96026d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.m */
/* compiled from: PG */
final class C95943m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C124633az f268645a;

    /* renamed from: b */
    final /* synthetic */ C95950t f268646b;

    /* renamed from: c */
    final /* synthetic */ C96026d f268647c;

    public C95943m(C95950t tVar, C124633az azVar, C96026d dVar) {
        this.f268646b = tVar;
        this.f268645a = azVar;
        this.f268647c = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15763)).mo56386p("Failed to send signal to disable assistant on the device.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C59104x b = C95950t.f268659c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
            ((C59052c) ((C59052c) b).mo56372aa(15765)).mo56386p("Assistant disabled on the device.");
            String k = this.f268646b.f268660d.mo89270k();
            this.f268646b.f268663g.mo83394aj(k, C124636bb.OPA_DISABLED, this.f268645a);
            if (this.f268645a != null) {
                this.f268646b.f268663g.mo83365G(k);
            }
            this.f268646b.mo89838h(this.f268647c.f268868a, "DisconnectingState", (Intent) null);
            return;
        }
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) c).mo56372aa(15764)).mo56386p("Failed to disable assistant on the device.");
    }
}
