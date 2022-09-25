package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C95962ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268685a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268686b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f268687c;

    public /* synthetic */ C95962ak(C96017bm bmVar, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268685a = bmVar;
        this.f268686b = bluetoothDevice;
        this.f268687c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268685a;
        BluetoothDevice bluetoothDevice = this.f268686b;
        C124548d dVar = this.f268687c;
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156552a(bluetoothDevice);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        bmVar.mo89883f(bluetoothDevice, dVar, false);
    }
}
