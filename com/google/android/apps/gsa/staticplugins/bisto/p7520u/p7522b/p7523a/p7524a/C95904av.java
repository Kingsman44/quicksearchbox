package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.av */
/* compiled from: PG */
public final /* synthetic */ class C95904av implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95906ax f268522a;

    public /* synthetic */ C95904av(C95906ax axVar) {
        this.f268522a = axVar;
    }

    public final void run() {
        C95906ax axVar = this.f268522a;
        C124715m d = axVar.f268526e.mo89263d();
        C59104x b = C95906ax.f268524c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WaitingToReconnectState");
        ((C59052c) ((C59052c) b).mo56372aa(15939)).mo56389s("Connectivity status after delay: %s", d);
        C124715m mVar = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
        if (d.ordinal() != 1) {
            C59104x b2 = C95906ax.f268524c.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "WaitingToReconnectState");
            ((C59052c) ((C59052c) b2).mo56372aa(15940)).mo56386p("Reconnecting");
            axVar.mo89847j("ConnectingLCState", (Intent) null);
            return;
        }
        C59104x b3 = C95906ax.f268524c.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "WaitingToReconnectState");
        ((C59052c) ((C59052c) b3).mo56372aa(15941)).mo56386p("Disconnecting");
        axVar.mo89847j("DisconnectingState", (Intent) null);
    }
}
