package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.f */
/* compiled from: PG */
public final /* synthetic */ class C96028f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268887a;

    /* renamed from: b */
    public final /* synthetic */ Intent f268888b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothDevice f268889c;

    public /* synthetic */ C96028f(C96017bm bmVar, Intent intent, BluetoothDevice bluetoothDevice) {
        this.f268887a = bmVar;
        this.f268888b = intent;
        this.f268889c = bluetoothDevice;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268887a;
        Intent intent = this.f268888b;
        BluetoothDevice bluetoothDevice = this.f268889c;
        C124548d dVar = (C124548d) obj;
        if (C96017bm.m159214q(intent)) {
            new C90873ag(bmVar.mo89879c(bluetoothDevice, dVar), bmVar.f268837g, "getIsUsingConnectionSequencing", new C95968aq(bmVar, bluetoothDevice, dVar)).mo85223a(new C95969ar(bmVar, bluetoothDevice, dVar));
            return;
        }
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15665)).mo56386p("Device not using connection sequencing, handle connected intent.");
        bmVar.mo89883f(bluetoothDevice, dVar, false);
    }
}
