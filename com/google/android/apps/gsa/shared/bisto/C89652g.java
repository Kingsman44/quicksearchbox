package com.google.android.apps.gsa.shared.bisto;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.bisto.g */
/* compiled from: PG */
public final class C89652g {

    /* renamed from: a */
    public final BluetoothAdapter f242759a;

    private C89652g(BluetoothAdapter bluetoothAdapter) {
        this.f242759a = bluetoothAdapter;
    }

    /* renamed from: a */
    public static C89652g m145951a() {
        return new C89652g(BluetoothAdapter.getDefaultAdapter());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Set mo83541b() {
        HashSet hashSet = new HashSet();
        BluetoothAdapter bluetoothAdapter = this.f242759a;
        if (bluetoothAdapter != null) {
            Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            if (bondedDevices == null) {
                return null;
            }
            for (BluetoothDevice aVar : bondedDevices) {
                hashSet.add(new C124539a(aVar));
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C124539a mo83542c(String str) {
        return new C124539a(this.f242759a.getRemoteDevice(str));
    }
}
