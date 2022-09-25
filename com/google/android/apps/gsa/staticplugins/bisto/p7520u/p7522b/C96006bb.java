package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.bb */
/* compiled from: PG */
public final /* synthetic */ class C96006bb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268806a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268807b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f268808c;

    public /* synthetic */ C96006bb(C96017bm bmVar, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f268806a = bmVar;
        this.f268807b = bluetoothDevice;
        this.f268808c = bArr;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268806a;
        BluetoothDevice bluetoothDevice = this.f268807b;
        byte[] bArr = this.f268808c;
        Exception exc = (Exception) obj;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15672)).mo56354G("[%s] No record: %s", C94876ay.m156552a(bluetoothDevice), bluetoothDevice.getAddress());
        bmVar.f268836f.mo28212l("start-initial-gacs-connection", new C95959ah(bmVar, bluetoothDevice, bArr));
    }
}
