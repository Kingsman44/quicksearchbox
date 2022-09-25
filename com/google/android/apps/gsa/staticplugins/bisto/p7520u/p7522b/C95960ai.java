package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C95960ai implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268682a;

    /* renamed from: b */
    public final /* synthetic */ String f268683b;

    public /* synthetic */ C95960ai(C96017bm bmVar, String str) {
        this.f268682a = bmVar;
        this.f268683b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268682a;
        String str = this.f268683b;
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            BluetoothManager bluetoothManager = (BluetoothManager) bmVar.f268843m.getSystemService("bluetooth");
            if (bluetoothManager == null) {
                C59104x c = C96017bm.f268828a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c).mo56372aa(15707)).mo56386p("Null BluetoothManager");
                return;
            }
            BluetoothDevice remoteDevice = bluetoothManager.getAdapter().getRemoteDevice(str);
            if (remoteDevice == null) {
                C59104x c2 = C96017bm.f268828a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c2).mo56372aa(15706)).mo56386p("No BT device");
                return;
            }
            bmVar.f268834d.mo83394aj(remoteDevice.getAddress(), C124636bb.OPA_ENABLED, C124633az.OOBE_FINISHED);
            new C90873ag(bmVar.f268834d.mo83408n(remoteDevice.getAddress()), bmVar.f268837g, "start-gacs-connection-after-opaenabled", new C95971at(bmVar, remoteDevice, str)).mo85223a(C95972au.f268709a);
            return;
        }
        C59104x d = C96017bm.f268828a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) d).mo56372aa(15695)).mo56386p("OPA enabled on DataLayer failure");
    }
}
