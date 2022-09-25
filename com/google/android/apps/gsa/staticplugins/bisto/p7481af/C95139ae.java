package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96443aa;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96444ab;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.ae */
/* compiled from: PG */
public final /* synthetic */ class C95139ae implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266174a;

    public /* synthetic */ C95139ae(C95144aj ajVar) {
        this.f266174a = ajVar;
    }

    public final void run() {
        BluetoothAdapter defaultAdapter;
        C95144aj ajVar = this.f266174a;
        C124539a o = C89681t.m146049o(ajVar.f266198f, ajVar.f266201i, ajVar.f266197c);
        if (o != null) {
            C96444ab abVar = (C96444ab) ajVar.f266200h.mo27525b();
            BluetoothDevice bluetoothDevice = o.f343619a;
            C58976aa aaVar = C58975e.f156826a;
            bluetoothDevice.getAddress();
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) abVar.f269823f.get();
            if (!(abVar.f269822e.get() == null || bluetoothDevice2 == null)) {
                if (bluetoothDevice2.getAddress().equals(bluetoothDevice.getAddress())) {
                    C59104x b = C96444ab.f269818a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "InputOnlyModeBleScan");
                    ((C59052c) ((C59052c) b).mo56372aa(17142)).mo56386p("Scan already in progress");
                    ajVar.mo89074z();
                }
                abVar.mo90132a(bluetoothDevice2);
            }
            BluetoothLeScanner bluetoothLeScanner = null;
            if (abVar.f269820c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
                bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
            }
            if (bluetoothLeScanner == null) {
                C59104x b2 = C96444ab.f269818a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "InputOnlyModeBleScan");
                ((C59052c) ((C59052c) b2).mo56372aa(17141)).mo56386p("BLE scanner not available");
            } else {
                C59104x b3 = C96444ab.f269818a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "InputOnlyModeBleScan");
                ((C59052c) ((C59052c) b3).mo56372aa(17140)).mo56386p("Starting scan");
                abVar.f269823f.set(bluetoothDevice);
                abVar.f269822e.set(bluetoothLeScanner);
                bluetoothLeScanner.startScan(Collections.singletonList(new ScanFilter.Builder().setDeviceAddress(bluetoothDevice.getAddress()).build()), new ScanSettings.Builder().setScanMode(1).build(), abVar);
                abVar.f269821d.mo28213m("stopScan", C96444ab.f269819b, new C96443aa(abVar, bluetoothDevice));
            }
            ajVar.mo89074z();
        }
    }
}
