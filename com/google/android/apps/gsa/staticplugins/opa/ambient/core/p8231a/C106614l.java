package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.l */
/* compiled from: PG */
final class C106614l implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ C2164c f297249a;

    /* renamed from: b */
    final /* synthetic */ BluetoothAdapter f297250b;

    /* renamed from: c */
    final /* synthetic */ C106615m f297251c;

    /* renamed from: d */
    private boolean f297252d = false;

    public C106614l(C106615m mVar, C2164c cVar, BluetoothAdapter bluetoothAdapter) {
        this.f297251c = mVar;
        this.f297249a = cVar;
        this.f297250b = bluetoothAdapter;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        this.f297249a.mo5437b(C58485gu.m89842j(connectedDevices));
        this.f297252d = true;
        this.f297250b.closeProfileProxy(i, bluetoothProfile);
        ((C58970a) ((C58970a) this.f297251c.f297255c.mo56224b()).mo56372aa(23129)).mo56395y("getDevicesForProfile(): for profile %d, returning: [%s]", i, TextUtils.join(",", (Iterable) Collection.EL.stream(connectedDevices).map(C106613k.f297248a).collect(C58370cn.f155946a)));
    }

    public final void onServiceDisconnected(int i) {
        if (!this.f297252d) {
            this.f297252d = true;
            this.f297249a.mo5437b(C58485gu.m89845m());
            ((C58970a) ((C58970a) this.f297251c.f297255c.mo56226d()).mo56372aa(23130)).mo56387q("getDevicesForProfile(): for profile %d, disconnected. returning empty list.", i);
        }
    }
}
