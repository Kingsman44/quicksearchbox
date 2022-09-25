package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.x */
/* compiled from: PG */
public final /* synthetic */ class C96046x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268923a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268924b;

    public /* synthetic */ C96046x(C96017bm bmVar, BluetoothDevice bluetoothDevice) {
        this.f268923a = bmVar;
        this.f268924b = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268923a;
        BluetoothDevice bluetoothDevice = this.f268924b;
        C124548d dVar = (C124548d) obj;
        if (!C124715m.NOT_CONNECTED.equals(dVar.mo106512j())) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (dVar.mo106521s() != C124636bb.OPA_ENABLED) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (!C124719q.GACS_DEVICE.equals(dVar.mo106513k())) {
            C58976aa aaVar3 = C58975e.f156826a;
            C94876ay.m156552a(bluetoothDevice);
        } else {
            C59104x b = C96017bm.f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15652)).mo56386p("Connect to bonded Bisto Gacs Dual Mode device due to fail safe");
            bmVar.mo89883f(bluetoothDevice, dVar, false);
        }
    }
}
