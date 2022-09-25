package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.opaonboarding.C83871ae;
import com.google.android.apps.gsa.opaonboarding.C83907bm;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hv */
/* compiled from: PG */
public final /* synthetic */ class C96280hv implements C83871ae {

    /* renamed from: a */
    public final /* synthetic */ C96283hy f269445a;

    public /* synthetic */ C96280hv(C96283hy hyVar) {
        this.f269445a = hyVar;
    }

    /* renamed from: a */
    public final void mo77211a(C83907bm bmVar) {
        C96283hy hyVar = this.f269445a;
        C96273ho hoVar = (C96273ho) bmVar;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) hoVar.f269032f;
        if (hoVar.f269031e || bluetoothDevice == null) {
            hyVar.mo90046a(4);
        }
        hyVar.f269452d = bluetoothDevice;
        hyVar.mo90046a(1);
    }
}
