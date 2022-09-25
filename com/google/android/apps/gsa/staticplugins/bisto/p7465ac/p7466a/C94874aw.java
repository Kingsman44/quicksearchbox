package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import android.os.Looper;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.android.libraries.assistant.accessory.gmutls.C11025h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.aw */
/* compiled from: PG */
final class C94874aw extends C11025h {

    /* renamed from: a */
    final /* synthetic */ C94875ax f265343a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94874aw(C94875ax axVar, Looper looper, Duration duration, Duration duration2) {
        super(looper, duration.toMillis(), duration2.toMillis());
        this.f265343a = axVar;
    }

    /* renamed from: a */
    public final void mo19470a() {
        C59104x d = C94875ax.f265344a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GattConnObserver");
        ((C59052c) ((C59052c) d).mo56372aa(17439)).mo56386p("GATT connect timeout!");
        mo19487c();
        C94867ap apVar = this.f265343a.f265347d;
        C95013d dVar = apVar.f265282a.f265313z;
        if (dVar == null) {
            C59104x d2 = C94868aq.f265285a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(17405)).mo56386p("GATT was null, ignoring timeout.");
            return;
        }
        BluetoothGatt bluetoothGatt = dVar.f265823b;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        apVar.f265282a.mo88705k(257);
    }

    /* renamed from: b */
    public final void mo19471b() {
        C59071e eVar = C94875ax.f265344a;
        C58976aa aaVar = C58975e.f156826a;
        C94875ax.f265345b.toMillis();
    }
}
