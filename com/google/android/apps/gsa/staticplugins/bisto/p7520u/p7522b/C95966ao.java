package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ao */
/* compiled from: PG */
public final /* synthetic */ class C95966ao implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268694a;

    /* renamed from: b */
    public final /* synthetic */ Intent f268695b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothDevice f268696c;

    public /* synthetic */ C95966ao(C96017bm bmVar, Intent intent, BluetoothDevice bluetoothDevice) {
        this.f268694a = bmVar;
        this.f268695b = intent;
        this.f268696c = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268694a;
        Intent intent = this.f268695b;
        BluetoothDevice bluetoothDevice = this.f268696c;
        if (!((Boolean) obj).booleanValue() || !C96017bm.m159214q(intent)) {
            bmVar.mo89881d();
            C59104x b = C96017bm.f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15667)).mo56386p("Device not using connection sequencing, handle disconnected intent.");
            bmVar.mo89884g(bluetoothDevice, 1);
            return;
        }
        C59104x b2 = C96017bm.f268828a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b2).mo56372aa(15668)).mo56386p("Device using connection sequencing, ignore the intent.");
    }
}
