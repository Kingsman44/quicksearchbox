package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.aw */
/* compiled from: PG */
public final /* synthetic */ class C95974aw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ BluetoothDevice f268713a;

    public /* synthetic */ C95974aw(BluetoothDevice bluetoothDevice) {
        this.f268713a = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        BluetoothDevice bluetoothDevice = this.f268713a;
        Exception exc = (Exception) obj;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15670)).mo56354G("[%s] No record: %s", C94876ay.m156552a(bluetoothDevice), bluetoothDevice.getAddress());
    }
}
