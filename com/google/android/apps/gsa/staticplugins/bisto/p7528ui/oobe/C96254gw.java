package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gw */
/* compiled from: PG */
final class C96254gw implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f269408a;

    /* renamed from: b */
    final /* synthetic */ C96255gx f269409b;

    public C96254gw(C96255gx gxVar, SettableFuture settableFuture) {
        this.f269409b = gxVar;
        this.f269408a = settableFuture;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        BluetoothDevice next;
        if (i != 2) {
            if (i == 1) {
                i = 1;
            } else {
                return;
            }
        }
        int i2 = C96255gx.f269411q;
        C58976aa aaVar = C58975e.f156826a;
        String str = this.f269409b.f269414p.f269039a;
        Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
        BluetoothDevice bluetoothDevice = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (str == null || str.equals(next.getAddress())) {
                bluetoothDevice = next;
            } else if (bluetoothDevice == null) {
                bluetoothDevice = next;
            }
        }
        bluetoothDevice = next;
        if (bluetoothDevice != null) {
            this.f269408a.mo57356n(bluetoothDevice);
        }
        BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
    }

    public final void onServiceDisconnected(int i) {
    }
}
