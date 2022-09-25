package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.an */
/* compiled from: PG */
public final class C94826an extends C94819ag {

    /* renamed from: d */
    private static final C59071e f265152d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.an");

    /* renamed from: e */
    private static final C58528ij f265153e = C58528ij.m90011K(C94841p.ON_CHARACTERISTIC_WRITE, C94841p.GATT_ERROR);

    /* renamed from: c */
    public final String f265154c;

    /* renamed from: f */
    private final C94828c f265155f;

    /* renamed from: g */
    private final byte[] f265156g;

    /* renamed from: h */
    private final int f265157h;

    public C94826an(C94828c cVar, String str, byte[] bArr, int i) {
        this.f265155f = cVar;
        this.f265154c = str;
        this.f265156g = bArr;
        this.f265157h = i;
    }

    /* renamed from: a */
    public final C94841p call() {
        C94828c cVar = this.f265155f;
        C94837l lVar = cVar.f265164e;
        C95013d dVar = (C95013d) cVar.f265162c.mo56111f();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) this.f265155f.mo88645a(this.f265154c).mo56111f();
        if (dVar == null || bluetoothGattCharacteristic == null) {
            return C94841p.FATAL_ERROR;
        }
        if (!bluetoothGattCharacteristic.setValue(this.f265156g)) {
            return C94841p.NON_FATAL_ERROR;
        }
        bluetoothGattCharacteristic.setWriteType(this.f265157h);
        lVar.mo88667a(this);
        if (dVar.mo88925g(bluetoothGattCharacteristic)) {
            return C94841p.ERROR_NOT_SPECIFIED;
        }
        lVar.mo88668b(this);
        return C94841p.NON_FATAL_ERROR;
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        if (f265153e.contains(akVar.mo88640a())) {
            C59104x b = f265152d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsWriteRequest");
            ((C59052c) ((C59052c) b).mo56372aa(17542)).mo56389s("Write request completed with response code %s", akVar.mo88640a());
            this.f265155f.f265164e.mo88668b(this);
            super.mo88628b(akVar);
        }
    }
}
