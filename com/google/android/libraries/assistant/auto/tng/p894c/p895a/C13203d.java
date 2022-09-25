package com.google.android.libraries.assistant.auto.tng.p894c.p895a;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.c.a.d */
/* compiled from: PG */
public final class C13203d implements C13202c {

    /* renamed from: a */
    private static final C59071e f40846a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.c.a.d");

    /* renamed from: b */
    private static final ParcelUuid f40847b = ParcelUuid.fromString("00000000-deca-fade-deca-deafdecacafe");

    /* renamed from: a */
    public final boolean mo20977a(BluetoothDevice bluetoothDevice) {
        ParcelUuid parcelUuid = f40847b;
        if (bluetoothDevice == null || parcelUuid == null) {
            C59104x d = f40846a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BluetoothDeviceType");
            ((C59052c) ((C59052c) d).mo56372aa(44687)).mo56386p("BluetoothDevice or ParcelUUID is null");
            return false;
        }
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids == null || uuids.length == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        for (ParcelUuid equals : uuids) {
            if (parcelUuid.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
