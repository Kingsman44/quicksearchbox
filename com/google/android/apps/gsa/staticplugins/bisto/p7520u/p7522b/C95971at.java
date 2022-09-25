package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.at */
/* compiled from: PG */
public final /* synthetic */ class C95971at implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268706a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268707b;

    /* renamed from: c */
    public final /* synthetic */ String f268708c;

    public /* synthetic */ C95971at(C96017bm bmVar, BluetoothDevice bluetoothDevice, String str) {
        this.f268706a = bmVar;
        this.f268707b = bluetoothDevice;
        this.f268708c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268706a;
        BluetoothDevice bluetoothDevice = this.f268707b;
        String str = this.f268708c;
        C124548d dVar = (C124548d) obj;
        bmVar.mo89884g(bluetoothDevice, 8);
        bmVar.f268838h.mo19420m(bmVar.f268841k);
        C58976aa aaVar = C58975e.f156826a;
        bmVar.mo89888n(new Intent(), bluetoothDevice, dVar, bmVar.f268835e.mo106554b(str, dVar.mo106466G().mo59174N()), true);
    }
}
