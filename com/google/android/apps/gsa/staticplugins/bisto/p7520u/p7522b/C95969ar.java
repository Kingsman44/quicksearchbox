package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C95969ar implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268702a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268703b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f268704c;

    public /* synthetic */ C95969ar(C96017bm bmVar, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268702a = bmVar;
        this.f268703b = bluetoothDevice;
        this.f268704c = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268702a;
        BluetoothDevice bluetoothDevice = this.f268703b;
        C124548d dVar = this.f268704c;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g((Exception) obj)).mo56372aa(15664)).mo56389s("[%s] Could not read feature flags, proceed to handle connected intent", C94876ay.m156552a(bluetoothDevice));
        bmVar.mo89883f(bluetoothDevice, dVar, false);
    }
}
