package com.google.android.apps.gsa.staticplugins.p7920en;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.j */
/* compiled from: PG */
final class C100568j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C100570l f281164a;

    public C100568j(C100570l lVar) {
        this.f281164a = lVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C59104x b = C100570l.f281167a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VehicleIntegrationWork");
        ((C59052c) ((C59052c) b).mo56372aa(33518)).mo56389s("Local broadcast received: %s", intent);
        this.f281164a.mo91970c(intent);
    }
}
