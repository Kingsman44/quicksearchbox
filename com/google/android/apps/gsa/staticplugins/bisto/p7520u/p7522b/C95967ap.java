package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ap */
/* compiled from: PG */
public final /* synthetic */ class C95967ap implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268697a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268698b;

    public /* synthetic */ C95967ap(C96017bm bmVar, BluetoothDevice bluetoothDevice) {
        this.f268697a = bmVar;
        this.f268698b = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268697a;
        BluetoothDevice bluetoothDevice = this.f268698b;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g((Exception) obj)).mo56372aa(15669)).mo56386p("Could not read whether device is using connection sequencing, proceed to disconnect device.");
        bmVar.mo89884g(bluetoothDevice, 1);
    }
}
