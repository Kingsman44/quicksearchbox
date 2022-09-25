package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gi */
/* compiled from: PG */
public final /* synthetic */ class C96240gi implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96248gq f269371a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f269372b;

    public /* synthetic */ C96240gi(C96248gq gqVar, BluetoothDevice bluetoothDevice) {
        this.f269371a = gqVar;
        this.f269372b = bluetoothDevice;
    }

    public final void run() {
        int i;
        C96248gq gqVar = this.f269371a;
        BluetoothDevice bluetoothDevice = this.f269372b;
        C59104x b = C96248gq.f269387m.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17019)).mo56386p("enterpairingmode");
        if (C96248gq.m159547u(bluetoothDevice)) {
            C59104x b2 = C96248gq.f269387m.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) b2).mo56372aa(17037)).mo56386p("sendEnterPairingModeCommand");
            Intent intent = new Intent("bisto_enter_pairing_mode");
            intent.putExtra("key_device_id", gqVar.f269400u.f269039a);
            C124519a.m203974a(gqVar.getContext(), intent);
            i = 7;
        } else {
            i = 5;
        }
        gqVar.mo90021q(i);
    }
}
