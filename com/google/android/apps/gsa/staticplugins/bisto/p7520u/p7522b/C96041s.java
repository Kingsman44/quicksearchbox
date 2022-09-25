package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.s */
/* compiled from: PG */
public final /* synthetic */ class C96041s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268908a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f268909b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothDevice f268910c;

    /* renamed from: d */
    public final /* synthetic */ boolean f268911d;

    /* renamed from: e */
    public final /* synthetic */ Intent f268912e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f268913f;

    public /* synthetic */ C96041s(C96017bm bmVar, C124548d dVar, BluetoothDevice bluetoothDevice, boolean z, Intent intent, byte[] bArr) {
        this.f268908a = bmVar;
        this.f268909b = dVar;
        this.f268910c = bluetoothDevice;
        this.f268911d = z;
        this.f268912e = intent;
        this.f268913f = bArr;
    }

    public final void run() {
        C96017bm bmVar = this.f268908a;
        C124548d dVar = this.f268909b;
        BluetoothDevice bluetoothDevice = this.f268910c;
        boolean z = this.f268911d;
        Intent intent = this.f268912e;
        byte[] bArr = this.f268913f;
        boolean equals = C124636bb.OPA_ENABLED.equals(dVar.mo106521s());
        String address = bluetoothDevice.getAddress();
        if (!z && equals && dVar.mo106484Y()) {
            String stringExtra = intent.getStringExtra("account_name");
            if (stringExtra == null) {
                C59104x c = C96017bm.f268828a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c).mo56372aa(15634)).mo56386p("Missing accountName");
            } else {
                C124620am amVar = (C124620am) dVar.mo106464E().get(stringExtra);
                if (!(amVar == null || (amVar.f343763a & 1) == 0)) {
                    C59104x b = C96017bm.f268828a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                    ((C59052c) ((C59052c) b).mo56372aa(15633)).mo56389s("Clear DUSI/disable opa %s", address);
                    bmVar.f268834d.mo83394aj(address, C124636bb.OPA_DISABLED, (C124633az) null);
                    bmVar.f268834d.mo83380V(address, stringExtra, C95975ax.f268714a);
                }
            }
        }
        if (!z && !C124633az.OOBE_IN_PROGRESS.equals(dVar.mo106520r())) {
            bmVar.f268834d.mo83394aj(address, (C124636bb) null, C124633az.OOBE_IN_PROGRESS);
        }
        bmVar.mo89877a().mo88768d(bmVar.f268839i.mo88918a(bluetoothDevice), dVar, bArr, equals, false, bmVar.f268846p);
        String R = dVar.mo106477R();
        if (!C58879cp.m90962d(R)) {
            bmVar.mo89882e(R);
        }
        bmVar.mo89890p(bluetoothDevice.getAddress());
        bmVar.mo89881d();
        bmVar.mo89889o();
    }
}
