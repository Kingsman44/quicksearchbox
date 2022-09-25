package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.aj */
/* compiled from: PG */
final class C94861aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ BluetoothGattDescriptor f265272a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f265273b;

    /* renamed from: c */
    final /* synthetic */ C94866ao f265274c;

    public C94861aj(C94866ao aoVar, BluetoothGattDescriptor bluetoothGattDescriptor, C60870cx cxVar) {
        this.f265274c = aoVar;
        this.f265272a = bluetoothGattDescriptor;
        this.f265273b = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C94868aq.f265285a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(17366)).mo56386p("Couldn't handle descriptor write");
        this.f265274c.f265281a.f265307t.remove(this.f265273b);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f265272a != null) {
            C59071e eVar = C94868aq.f265285a;
            C58976aa aaVar = C58975e.f156826a;
            this.f265272a.getUuid();
        }
        this.f265274c.f265281a.f265307t.remove(this.f265273b);
    }
}
