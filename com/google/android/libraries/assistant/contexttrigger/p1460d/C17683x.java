package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.x */
/* compiled from: PG */
final class C17683x implements BluetoothProfile.ServiceListener {

    /* renamed from: c */
    public static final /* synthetic */ int f50835c = 0;

    /* renamed from: a */
    final /* synthetic */ C2164c f50836a;

    /* renamed from: b */
    final /* synthetic */ BluetoothAdapter f50837b;

    /* renamed from: d */
    private boolean f50838d = false;

    public C17683x(C2164c cVar, BluetoothAdapter bluetoothAdapter) {
        this.f50836a = cVar;
        this.f50837b = bluetoothAdapter;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        this.f50836a.mo5437b(C58485gu.m89842j(connectedDevices));
        this.f50838d = true;
        this.f50837b.closeProfileProxy(i, bluetoothProfile);
        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46948)).mo56395y("getDevicesForProfile(): for profile %d, returning: [%s]", i, TextUtils.join(",", (Iterable) Collection.EL.stream(connectedDevices).map(C17682w.f50834a).collect(C58370cn.f155946a)));
    }

    public final void onServiceDisconnected(int i) {
        if (!this.f50838d) {
            this.f50838d = true;
            this.f50836a.mo5437b(C58485gu.m89845m());
            ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46949)).mo56387q("getDevicesForProfile(): for profile %d, disconnected. returning empty list.", i);
        }
    }
}
