package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gm */
/* compiled from: PG */
public final /* synthetic */ class C96244gm implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96248gq f269380a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f269381b;

    public /* synthetic */ C96244gm(C96248gq gqVar, BluetoothDevice bluetoothDevice) {
        this.f269380a = gqVar;
        this.f269381b = bluetoothDevice;
    }

    public final void run() {
        C96248gq gqVar = this.f269380a;
        boolean fetchUuidsWithSdp = this.f269381b.fetchUuidsWithSdp();
        C59104x b = C96248gq.f269387m.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17018)).mo56389s("fetchUuidsWithSdp %b", Boolean.valueOf(fetchUuidsWithSdp));
        synchronized (gqVar) {
            if (!fetchUuidsWithSdp) {
                if (gqVar.f269405z != null) {
                    gqVar.mo90018o();
                }
            }
        }
    }
}
