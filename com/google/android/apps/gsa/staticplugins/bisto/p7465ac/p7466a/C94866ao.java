package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.ao */
/* compiled from: PG */
final class C94866ao extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ C94868aq f265281a;

    public C94866ao(C94868aq aqVar) {
        this.f265281a = aqVar;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        C94876ay.f265350a.incrementAndGet();
        byte[] copyOf = Arrays.copyOf(bluetoothGattCharacteristic.getValue(), bluetoothGattCharacteristic.getValue().length);
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156553b(bluetoothGatt);
        bluetoothGattCharacteristic.getUuid();
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94856ae(this, bluetoothGatt, bluetoothGattCharacteristic, copyOf), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94860ai(this, bluetoothGattCharacteristic, l), this.f265281a.f265310w);
    }

    public final synchronized void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C94876ay.f265350a.incrementAndGet();
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94902z(this, i), this.f265281a.f265309v);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94859ah(this, l), this.f265281a.f265309v);
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94854ac(this, i, i2, bluetoothGatt), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94857af(this, l), this.f265281a.f265310w);
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        C94876ay.f265350a.incrementAndGet();
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94853ab(this, i), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94861aj(this, bluetoothGattDescriptor, l), this.f265281a.f265310w);
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94852aa(this, i2, i, bluetoothGatt), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94864am(this, l), this.f265281a.f265310w);
    }

    public final void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
        super.onPhyUpdate(bluetoothGatt, i, i2, i3);
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onReadRemoteRssi(bluetoothGatt, i, i2);
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156553b(bluetoothGatt);
        Thread.currentThread().getName();
        C60870cx m = C60856cj.m92904m(new C94900x(this, bluetoothGatt, i), this.f265281a.f265310w);
        this.f265281a.f265307t.add(m);
        C60856cj.m92911t(m, new C94865an(this, m), this.f265281a.f265310w);
    }

    public final void onServiceChanged(BluetoothGatt bluetoothGatt) {
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156553b(bluetoothGatt);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94901y(this, bluetoothGatt), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94863al(this, l), this.f265281a.f265310w);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(this.f265281a.f265313z);
        Thread.currentThread().getName();
        C60870cx l = C60856cj.m92903l(new C94899w(this, i, bluetoothGatt), this.f265281a.f265310w);
        this.f265281a.f265307t.add(l);
        C60856cj.m92911t(l, new C94858ag(this, l), this.f265281a.f265310w);
    }
}
