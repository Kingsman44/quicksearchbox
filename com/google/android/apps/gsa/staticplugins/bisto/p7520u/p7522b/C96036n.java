package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.n */
/* compiled from: PG */
public final /* synthetic */ class C96036n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268899a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268900b;

    public /* synthetic */ C96036n(C96017bm bmVar, BluetoothDevice bluetoothDevice) {
        this.f268899a = bmVar;
        this.f268900b = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268899a;
        BluetoothDevice bluetoothDevice = this.f268900b;
        C124548d dVar = (C124548d) obj;
        if (dVar == null || !C94892p.m156617g(dVar)) {
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156552a(bluetoothDevice);
            return;
        }
        bmVar.mo89885i(bluetoothDevice.getAddress());
    }
}
