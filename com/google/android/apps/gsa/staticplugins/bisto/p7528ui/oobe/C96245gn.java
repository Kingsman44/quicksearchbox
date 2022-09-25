package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothProfile;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gn */
/* compiled from: PG */
final class C96245gn implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C96248gq f269382a;

    public C96245gn(C96248gq gqVar) {
        this.f269382a = gqVar;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.f269382a.f269403x.put(i, bluetoothProfile);
        if (this.f269382a.f269403x.size() == C96248gq.f269392r.size()) {
            C96248gq gqVar = this.f269382a;
            gqVar.mo90021q(gqVar.f269402w);
        }
    }

    public final void onServiceDisconnected(int i) {
        this.f269382a.f269403x.remove(i);
    }
}
