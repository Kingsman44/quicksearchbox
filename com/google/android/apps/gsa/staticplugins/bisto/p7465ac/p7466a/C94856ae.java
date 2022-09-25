package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C94856ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265259a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothGatt f265260b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothGattCharacteristic f265261c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f265262d;

    public /* synthetic */ C94856ae(C94866ao aoVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        this.f265259a = aoVar;
        this.f265260b = bluetoothGatt;
        this.f265261c = bluetoothGattCharacteristic;
        this.f265262d = bArr;
    }

    public final void run() {
        C94866ao aoVar = this.f265259a;
        BluetoothGatt bluetoothGatt = this.f265260b;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f265261c;
        byte[] bArr = this.f265262d;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156553b(bluetoothGatt);
        bluetoothGattCharacteristic.getUuid();
        Thread.currentThread().getName();
        if (aoVar.f265281a.f265298k.get()) {
            C59104x d = C94868aq.f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17378)).mo56389s("[%s] Non-fatal warning, onCharacteristicChanged called but GATT has shut down", C94876ay.m156553b(bluetoothGatt));
            return;
        }
        aoVar.f265281a.f265293f.mo88715e(bluetoothGattCharacteristic.getUuid(), bArr);
    }
}
