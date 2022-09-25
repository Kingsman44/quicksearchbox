package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C95953ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268672a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268673b;

    public /* synthetic */ C95953ab(C96017bm bmVar, BluetoothDevice bluetoothDevice) {
        this.f268672a = bmVar;
        this.f268673b = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268672a;
        BluetoothDevice bluetoothDevice = this.f268673b;
        C124548d dVar = (C124548d) obj;
        if (!C124719q.GACS_DEVICE.equals(dVar.mo106513k())) {
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156552a(bluetoothDevice);
            return;
        }
        new C90873ag(bmVar.mo89879c(bluetoothDevice, dVar), bmVar.f268837g, "getIsUsingConnectionSequencing", new C95962ak(bmVar, bluetoothDevice, dVar)).mo85223a(new C95963al(bmVar, bluetoothDevice, dVar));
    }
}
