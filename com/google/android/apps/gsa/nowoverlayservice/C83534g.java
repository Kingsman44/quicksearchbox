package com.google.android.apps.gsa.nowoverlayservice;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.g */
/* compiled from: PG */
public final /* synthetic */ class C83534g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83553y f227760a;

    public /* synthetic */ C83534g(C83553y yVar) {
        this.f227760a = yVar;
    }

    public final void run() {
        C83553y yVar = this.f227760a;
        yVar.f227847r.mo27941z(yVar.f62659ag);
        if (yVar.f227805U && yVar.f62675aw != null && yVar.f62663ak >= 10) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("initiate_overlay_switch", true);
            try {
                yVar.f62675aw.mo28130c(bundle);
            } catch (RemoteException e) {
                C59104x c = C83553y.f227783a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GLCOC");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6686)).mo56386p("Failed to execute the callback overlayStatusChanged2");
            }
        }
        yVar.f227806V = false;
    }
}
