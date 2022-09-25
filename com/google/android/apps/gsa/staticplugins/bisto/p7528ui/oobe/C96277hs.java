package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.opaonboarding.C83871ae;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hs */
/* compiled from: PG */
public final /* synthetic */ class C96277hs implements C83871ae {

    /* renamed from: a */
    public final /* synthetic */ C96283hy f269442a;

    public /* synthetic */ C96277hs(C96283hy hyVar) {
        this.f269442a = hyVar;
    }

    /* renamed from: a */
    public final void mo77211a(C83907bm bmVar) {
        int i;
        C96283hy hyVar = this.f269442a;
        C96255gx gxVar = (C96255gx) bmVar;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) gxVar.f269032f;
        if (gxVar.f269031e || bluetoothDevice == null) {
            i = 2;
        } else {
            hyVar.f269452d = bluetoothDevice;
            i = C58832aw.m90831a(hyVar.f269449a, bluetoothDevice.getAddress()) ? 4 : 1;
        }
        hyVar.mo90046a(i);
    }
}
