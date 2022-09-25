package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.aq */
/* compiled from: PG */
public final /* synthetic */ class C95968aq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268699a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268700b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f268701c;

    public /* synthetic */ C95968aq(C96017bm bmVar, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268699a = bmVar;
        this.f268700b = bluetoothDevice;
        this.f268701c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268699a;
        BluetoothDevice bluetoothDevice = this.f268700b;
        C124548d dVar = this.f268701c;
        if (((Boolean) obj).booleanValue()) {
            bmVar.f268836f.mo28212l("update-status-active", new C95955ad(bmVar));
            C59104x b = C96017bm.f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15663)).mo56386p("Device using connection sequencing, ignore the intent.");
            return;
        }
        bmVar.mo89881d();
        C59104x b2 = C96017bm.f268828a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b2).mo56372aa(15662)).mo56386p("Device not using connection sequencing, handle connected intent.");
        bmVar.mo89883f(bluetoothDevice, dVar, false);
    }
}
