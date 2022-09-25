package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.y */
/* compiled from: PG */
public final /* synthetic */ class C94901y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265446a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothGatt f265447b;

    public /* synthetic */ C94901y(C94866ao aoVar, BluetoothGatt bluetoothGatt) {
        this.f265446a = aoVar;
        this.f265447b = bluetoothGatt;
    }

    public final void run() {
        C94866ao aoVar = this.f265446a;
        BluetoothGatt bluetoothGatt = this.f265447b;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156553b(bluetoothGatt);
        Thread.currentThread().getName();
        if (aoVar.f265281a.f265298k.get()) {
            C59104x d = C94868aq.f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17391)).mo56389s("[%s] Non-fatal warning, onServiceChanged called but GATT has shut down", C94876ay.m156553b(bluetoothGatt));
            return;
        }
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        C60888db dbVar = aoVar.f265281a.f265309v;
        if (dbVar == null) {
            C59104x d2 = C94868aq.f265285a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(17390)).mo56389s("[%s] No background runner available, ignoring service changed", C94876ay.m156555d(aoVar.f265281a.f265313z));
            return;
        }
        C60856cj.m92911t(dbVar.mo29164d(new C94855ad(aoVar), C94868aq.f265287c, TimeUnit.MILLISECONDS), new C94862ak(), aoVar.f265281a.f265310w);
    }
}
