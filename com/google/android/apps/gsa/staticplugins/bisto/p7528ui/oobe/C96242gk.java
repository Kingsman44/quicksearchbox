package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gk */
/* compiled from: PG */
public final /* synthetic */ class C96242gk implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96248gq f269375a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f269376b;

    /* renamed from: c */
    public final /* synthetic */ int f269377c;

    public /* synthetic */ C96242gk(C96248gq gqVar, BluetoothDevice bluetoothDevice, int i) {
        this.f269375a = gqVar;
        this.f269376b = bluetoothDevice;
        this.f269377c = i;
    }

    public final void run() {
        C96248gq gqVar = this.f269375a;
        BluetoothDevice bluetoothDevice = this.f269376b;
        int i = this.f269377c;
        if (bluetoothDevice.getBondState() == 12) {
            gqVar.mo90021q(12);
            return;
        }
        C59104x b = C96248gq.f269387m.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17021)).mo56386p("createBond");
        int i2 = gqVar.f269393A;
        gqVar.f269393A = i2 + 1;
        if (i2 < 4) {
            if (BluetoothAdapter.getDefaultAdapter().isDiscovering()) {
                BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
            }
            bluetoothDevice.setPin("1234".getBytes());
            bluetoothDevice.createBond();
            gqVar.f269398s.mo28213m("go back to unpaired state", C96248gq.f269390p, new C96243gl(gqVar, i));
            return;
        }
        C59104x c = C96248gq.f269387m.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) c).mo56372aa(17022)).mo56386p("repair retry failed");
        gqVar.mo90021q(14);
    }
}
