package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.content.BroadcastReceiver;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bz */
/* compiled from: PG */
public final /* synthetic */ class C89487bz implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C89490cb f242518a;

    public /* synthetic */ C89487bz(C89490cb cbVar) {
        this.f242518a = cbVar;
    }

    public final void run() {
        C89490cb cbVar = this.f242518a;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (C89490cb.f242528c) {
            if (!C89490cb.f242528c.mo83437a()) {
                long b = cbVar.f242529d.mo26870b();
                C89489ca caVar = C89490cb.f242528c;
                if (b > caVar.f242524c + C89490cb.f242527b) {
                    C89474bm bmVar = caVar.f242522a;
                    caVar.f242522a = null;
                    if (bmVar != null) {
                        C59104x b2 = C89490cb.f242526a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "BistoDBWrapper");
                        ((C59052c) ((C59052c) b2).mo56372aa(10485)).mo56386p("Close DB");
                        BroadcastReceiver broadcastReceiver = bmVar.f242501h;
                        bmVar.f242501h = null;
                        bmVar.mo83366H(new C89589m(bmVar, broadcastReceiver));
                    }
                } else if (caVar.f242522a != null) {
                    cbVar.mo83438c();
                }
            }
        }
    }
}
