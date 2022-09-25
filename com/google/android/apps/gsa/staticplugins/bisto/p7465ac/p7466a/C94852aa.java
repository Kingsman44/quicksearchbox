package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C94852aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265248a;

    /* renamed from: b */
    public final /* synthetic */ int f265249b;

    /* renamed from: c */
    public final /* synthetic */ int f265250c;

    /* renamed from: d */
    public final /* synthetic */ BluetoothGatt f265251d;

    public /* synthetic */ C94852aa(C94866ao aoVar, int i, int i2, BluetoothGatt bluetoothGatt) {
        this.f265248a = aoVar;
        this.f265249b = i;
        this.f265250c = i2;
        this.f265251d = bluetoothGatt;
    }

    public final void run() {
        C94866ao aoVar = this.f265248a;
        int i = this.f265249b;
        int i2 = this.f265250c;
        BluetoothGatt bluetoothGatt = this.f265251d;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        Thread.currentThread().getName();
        if (aoVar.f265281a.f265298k.get()) {
            C59104x d = C94868aq.f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17386)).mo56389s("[%s] Non-fatal warning, onMtuChanged called but GATT has shut down", C94876ay.m156553b(bluetoothGatt));
            return;
        }
        aoVar.f265281a.f265299l.set(i2);
        C94868aq aqVar = aoVar.f265281a;
        if (aqVar.f265289A.f265354d != 3) {
            if (i != 0) {
                C59104x d2 = C94868aq.f265285a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                ((C59052c) ((C59052c) d2).mo56372aa(17385)).mo56354G("[%s] onMtuChanged triggered by connection event, error status : %s", C94876ay.m156555d(aoVar.f265281a.f265313z), C94868aq.m156500c(i));
            }
        } else if (i != 0) {
            aqVar.mo88704j(i);
        } else {
            aqVar.mo88701g();
            aoVar.f265281a.f265293f.mo88716f();
        }
    }
}
