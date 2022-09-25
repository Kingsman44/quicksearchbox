package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGatt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.w */
/* compiled from: PG */
public final /* synthetic */ class C94899w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94866ao f265440a;

    /* renamed from: b */
    public final /* synthetic */ int f265441b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothGatt f265442c;

    public /* synthetic */ C94899w(C94866ao aoVar, int i, BluetoothGatt bluetoothGatt) {
        this.f265440a = aoVar;
        this.f265441b = i;
        this.f265442c = bluetoothGatt;
    }

    public final void run() {
        C94866ao aoVar = this.f265440a;
        int i = this.f265441b;
        BluetoothGatt bluetoothGatt = this.f265442c;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156555d(aoVar.f265281a.f265313z);
        Thread.currentThread().getName();
        if (aoVar.f265281a.f265298k.get()) {
            C59104x d = C94868aq.f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17395)).mo56389s("[%s] Non-fatal warning, onServicesDiscovered called but GATT has shut down", C94876ay.m156553b(bluetoothGatt));
        } else if (i != 0) {
            aoVar.f265281a.f265297j.set(false);
            aoVar.f265281a.mo88704j(i);
        } else if (aoVar.f265281a.f265297j.getAndSet(false)) {
            aoVar.f265281a.mo88708n();
        } else {
            aoVar.f265281a.mo88701g();
            aoVar.f265281a.f265293f.mo88716f();
            if (aoVar.f265281a.f265296i.get()) {
                C94876ay.m156555d(aoVar.f265281a.f265313z);
                try {
                    aoVar.f265281a.mo88698d();
                    aoVar.f265281a.f265293f.mo88714d();
                    aoVar.f265281a.f265294g.unlock();
                } catch (C94893q e) {
                    C59104x c = C94868aq.f265285a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17394)).mo56386p("Could not acquire or release operation lock");
                }
                aoVar.f265281a.f265296i.set(false);
                return;
            }
            aoVar.f265281a.f265293f.mo88711a();
        }
    }
}
