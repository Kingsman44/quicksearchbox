package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.u */
/* compiled from: PG */
public final class C95245u implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C95248x f266471a;

    public C95245u(C95248x xVar) {
        this.f266471a = xVar;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            C59104x b = C95248x.f266475a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) b).mo56372aa(14742)).mo56386p("connected to headset profile");
            this.f266471a.f266480f = new C95247w((BluetoothHeadset) bluetoothProfile);
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            C59104x b = C95248x.f266475a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) b).mo56372aa(14743)).mo56386p("disconnected from headset profile");
            this.f266471a.f266480f = null;
        }
    }
}
