package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60060ji;
import com.google.common.p4552o.C60061jj;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.f */
/* compiled from: PG */
final class C95257f implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C95260i f266507a;

    /* renamed from: b */
    final /* synthetic */ C95258g f266508b;

    public C95257f(C95258g gVar, C95260i iVar) {
        this.f266508b = gVar;
        this.f266507a = iVar;
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
        Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
        BluetoothDevice bluetoothDevice = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            String str = this.f266508b.f266515f;
            if (str == null || str.equals(next.getAddress())) {
                bluetoothDevice = next;
            } else if (bluetoothDevice == null) {
                bluetoothDevice = next;
            }
        }
        bluetoothDevice = next;
        if (bluetoothDevice != null) {
            String substring = bluetoothDevice.getAddress().replace(":", BuildConfig.FLAVOR).substring(0, 6);
            String name = bluetoothDevice.getName();
            int deviceClass = bluetoothDevice.getBluetoothClass().getDeviceClass();
            C95260i iVar = this.f266507a;
            C58976aa aaVar = C58975e.f156826a;
            C60060ji jiVar = iVar.f266542d;
            jiVar.copyOnWrite();
            C60061jj jjVar = (C60061jj) jiVar.instance;
            C60061jj jjVar2 = C60061jj.f162338j;
            substring.getClass();
            jjVar.f162340a |= 64;
            jjVar.f162345f = substring;
            C60060ji jiVar2 = iVar.f266542d;
            jiVar2.copyOnWrite();
            C60061jj jjVar3 = (C60061jj) jiVar2.instance;
            name.getClass();
            jjVar3.f162340a |= 128;
            jjVar3.f162346g = name;
            C60060ji jiVar3 = iVar.f266542d;
            jiVar3.copyOnWrite();
            C60061jj jjVar4 = (C60061jj) jiVar3.instance;
            jjVar4.f162340a |= 512;
            jjVar4.f162348i = deviceClass;
        }
        BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
    }

    public final void onServiceDisconnected(int i) {
    }
}
