package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ab */
/* compiled from: PG */
public final class C96444ab extends ScanCallback {

    /* renamed from: a */
    public static final C59071e f269818a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.ab");

    /* renamed from: b */
    public static final long f269819b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public final Context f269820c;

    /* renamed from: d */
    public final C22871g f269821d;

    /* renamed from: e */
    public final AtomicReference f269822e = new AtomicReference();

    /* renamed from: f */
    public final AtomicReference f269823f = new AtomicReference();

    public C96444ab(Context context, C22871g gVar) {
        this.f269820c = context;
        this.f269821d = gVar;
    }

    /* renamed from: a */
    public final void mo90132a(BluetoothDevice bluetoothDevice) {
        BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) this.f269822e.get();
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) this.f269823f.get();
        if (bluetoothLeScanner != null && bluetoothDevice2 != null && bluetoothDevice2.getAddress().equals(bluetoothDevice.getAddress())) {
            C59104x b = f269818a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "InputOnlyModeBleScan");
            ((C59052c) ((C59052c) b).mo56372aa(17143)).mo56386p("Stopping scan");
            this.f269822e.set((Object) null);
            this.f269823f.set((Object) null);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                bluetoothLeScanner.stopScan(this);
            }
        }
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        C59104x c = f269818a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "InputOnlyModeBleScan");
        ((C59052c) ((C59052c) c).mo56372aa(17137)).mo56387q("onScanFailed. errorCode=%d", i);
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        C58976aa aaVar = C58975e.f156826a;
        String address = scanResult.getDevice().getAddress();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) this.f269823f.get();
        if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(address)) {
            Intent intent = new Intent("com.google.android.apps.gsa.shared.bisto.ACTION_RECONNECT_INPUT_ONLY_MODE");
            intent.putExtra("extra_device", (Parcelable) this.f269823f.get());
            C124519a.m203974a(this.f269820c, intent);
            mo90132a(bluetoothDevice);
        }
    }
}
