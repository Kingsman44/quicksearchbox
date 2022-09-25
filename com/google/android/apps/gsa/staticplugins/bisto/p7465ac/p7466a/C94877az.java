package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.az */
/* compiled from: PG */
public final class C94877az {

    /* renamed from: a */
    public final BluetoothGattCharacteristic f265351a;

    /* renamed from: b */
    public final byte[] f265352b;

    /* renamed from: c */
    public final int f265353c;

    /* renamed from: d */
    public final int f265354d;

    public C94877az(int i) {
        this.f265353c = 2;
        this.f265354d = i;
        this.f265351a = null;
        this.f265352b = null;
    }

    public C94877az(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f265353c = 2;
        this.f265354d = i;
        this.f265351a = bluetoothGattCharacteristic;
        this.f265352b = null;
    }

    public C94877az(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        this.f265354d = 5;
        this.f265351a = bluetoothGattCharacteristic;
        this.f265352b = bArr;
        this.f265353c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C94877az)) {
            return false;
        }
        C94877az azVar = (C94877az) obj;
        return this.f265354d == azVar.f265354d && this.f265351a == azVar.f265351a && Arrays.equals(this.f265352b, azVar.f265352b) && this.f265353c == azVar.f265353c;
    }

    public final int hashCode() {
        int i;
        int[] iArr = new int[4];
        int i2 = 0;
        iArr[0] = this.f265354d;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f265351a;
        if (bluetoothGattCharacteristic == null) {
            i = 0;
        } else {
            i = bluetoothGattCharacteristic.getUuid().hashCode();
        }
        iArr[1] = i;
        byte[] bArr = this.f265352b;
        if (bArr != null) {
            i2 = Arrays.hashCode(bArr);
        }
        iArr[2] = i2;
        iArr[3] = this.f265353c;
        return Arrays.hashCode(iArr);
    }
}
