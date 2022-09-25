package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hi */
/* compiled from: PG */
public final /* synthetic */ class C96267hi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96273ho f269425a;

    public /* synthetic */ C96267hi(C96273ho hoVar) {
        this.f269425a = hoVar;
    }

    public final void onClick(View view) {
        C96273ho hoVar = this.f269425a;
        BluetoothDevice bluetoothDevice = hoVar.f269436r;
        if (bluetoothDevice != null) {
            hoVar.f269032f = bluetoothDevice;
            hoVar.mo77318iT().mo77312a();
            return;
        }
        C59104x c = C96273ho.f269431m.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HerbieConManFrg");
        ((C59052c) ((C59052c) c).mo56372aa(17041)).mo56386p("bluetoothDevice null!");
    }
}
