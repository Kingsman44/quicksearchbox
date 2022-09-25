package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.as */
/* compiled from: PG */
public final /* synthetic */ class C95970as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268705a;

    public /* synthetic */ C95970as(C96017bm bmVar) {
        this.f268705a = bmVar;
    }

    public final void run() {
        C96017bm bmVar = this.f268705a;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        for (BluetoothDevice next : BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
            if (next.getType() == 3) {
                new C90873ag(bmVar.mo89878b(next), bmVar.f268837g, "getDeviceInfo", new C96046x(bmVar, next)).mo85223a(new C96047y(next));
            }
        }
    }
}
