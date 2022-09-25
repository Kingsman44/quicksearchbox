package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.be */
/* compiled from: PG */
public final /* synthetic */ class C96009be implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268814a;

    /* renamed from: b */
    public final /* synthetic */ int f268815b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothDevice f268816c;

    /* renamed from: d */
    public final /* synthetic */ C124548d f268817d;

    public /* synthetic */ C96009be(C96017bm bmVar, int i, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268814a = bmVar;
        this.f268815b = i;
        this.f268816c = bluetoothDevice;
        this.f268817d = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268814a;
        int i = this.f268815b;
        BluetoothDevice bluetoothDevice = this.f268816c;
        C124548d dVar = this.f268817d;
        if (!((Boolean) obj).booleanValue()) {
            C59104x b = C96017bm.f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15683)).mo56386p("Device not using connection sequencing.");
            return;
        }
        bmVar.f268836f.mo28212l("handle-remote-peer-state", new C96042t(bmVar, i, bluetoothDevice, dVar));
    }
}
