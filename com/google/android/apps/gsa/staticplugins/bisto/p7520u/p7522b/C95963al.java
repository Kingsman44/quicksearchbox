package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.al */
/* compiled from: PG */
public final /* synthetic */ class C95963al implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268688a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268689b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f268690c;

    public /* synthetic */ C95963al(C96017bm bmVar, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268688a = bmVar;
        this.f268689b = bluetoothDevice;
        this.f268690c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268688a;
        BluetoothDevice bluetoothDevice = this.f268689b;
        C124548d dVar = this.f268690c;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g((Exception) obj)).mo56372aa(15659)).mo56386p("Could not read whether device is using connection sequencing, proceed to connect device.");
        bmVar.mo89883f(bluetoothDevice, dVar, false);
    }
}
