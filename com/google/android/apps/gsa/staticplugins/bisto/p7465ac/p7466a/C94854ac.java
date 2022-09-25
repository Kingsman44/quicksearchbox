package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C94854ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265254a;

    /* renamed from: b */
    public final /* synthetic */ int f265255b;

    /* renamed from: c */
    public final /* synthetic */ int f265256c;

    /* renamed from: d */
    public final /* synthetic */ BluetoothGatt f265257d;

    public /* synthetic */ C94854ac(C94866ao aoVar, int i, int i2, BluetoothGatt bluetoothGatt) {
        this.f265254a = aoVar;
        this.f265255b = i;
        this.f265256c = i2;
        this.f265257d = bluetoothGatt;
    }

    public final void run() {
        C94866ao aoVar = this.f265254a;
        int i = this.f265255b;
        int i2 = this.f265256c;
        BluetoothGatt bluetoothGatt = this.f265257d;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        Thread.currentThread().getName();
        try {
            if (!bluetoothGatt.getDevice().equals(aoVar.f265281a.mo88697b().mo88919a().f265818a)) {
                C59104x d = C94868aq.f265285a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                ((C59052c) ((C59052c) d).mo56372aa(17381)).mo56389s("[%s] Received event from an unexpected device", C94876ay.m156555d(aoVar.f265281a.f265313z));
            } else if (i2 == 2) {
                C94875ax axVar = aoVar.f265281a.f265305r;
                if (axVar != null) {
                    axVar.mo88728a();
                }
                C94868aq aqVar = aoVar.f265281a;
                aqVar.f265309v.execute(new C94898v(aqVar));
            } else if (i2 == 0) {
                C94875ax axVar2 = aoVar.f265281a.f265305r;
                if (axVar2 != null) {
                    axVar2.mo88728a();
                }
                aoVar.f265281a.mo88705k(i);
            }
        } catch (C94893q e) {
            C59104x c = C94868aq.f265285a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17382)).mo56389s("[%s] Failed to check bluetooth device", C94876ay.m156555d(aoVar.f265281a.f265313z));
        }
    }
}
