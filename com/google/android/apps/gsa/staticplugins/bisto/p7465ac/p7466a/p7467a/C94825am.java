package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95012c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.am */
/* compiled from: PG */
public final class C94825am extends C94819ag {

    /* renamed from: c */
    private static final C59071e f265148c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.am");

    /* renamed from: d */
    private final C94828c f265149d;

    /* renamed from: e */
    private final String f265150e;

    /* renamed from: f */
    private final AtomicBoolean f265151f;

    public C94825am(C94828c cVar, String str, boolean z) {
        this.f265149d = cVar;
        this.f265150e = str;
        this.f265151f = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public final C94841p call() {
        C95013d dVar = (C95013d) this.f265149d.f265162c.mo56111f();
        C95012c cVar = (C95012c) this.f265149d.mo88646b().mo56111f();
        if (dVar == null || cVar == null) {
            return C94841p.FATAL_ERROR;
        }
        C59104x b = f265148c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsUnsubscribeReq");
        ((C59052c) ((C59052c) b).mo56372aa(17541)).mo56389s("About to unsubscribe from characteristic %s", this.f265150e);
        BluetoothGattCharacteristic characteristic = cVar.f265821a.getCharacteristic(UUID.fromString(this.f265150e));
        if (characteristic != null) {
            dVar.mo88924f(characteristic, false);
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(C94842q.f265235b);
            if (descriptor == null) {
                return C94841p.FATAL_ERROR;
            }
            descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            this.f265149d.f265164e.mo88667a(this);
            if (dVar.mo88926h(descriptor)) {
                return C94841p.ERROR_NOT_SPECIFIED;
            }
            this.f265149d.f265164e.mo88668b(this);
            return C94841p.NON_FATAL_ERROR;
        } else if (!this.f265151f.get()) {
            return C94841p.FATAL_ERROR;
        } else {
            C94812a aVar = new C94812a();
            aVar.mo88623b(C94841p.UNSUBSCRIPTION_SKIPPED);
            mo88628b(aVar.mo88622a());
            return C94841p.ERROR_NOT_SPECIFIED;
        }
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        boolean z;
        C94841p a = akVar.mo88640a();
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = a.ordinal();
        if (ordinal == 4) {
            z = this.f265150e.equals("dd1d1206-568f-4b2d-a48c-969d8ad1f457");
        } else if (ordinal == 5) {
            z = this.f265150e.equals("e90c4308-3984-41f3-be3c-7118093c3300");
        } else if (ordinal == 6) {
            z = this.f265150e.equals("389e8365-158f-4308-9204-756f29b6a87c");
        } else if (ordinal != 7) {
            if (!(ordinal == 13 || ordinal == 24)) {
                return;
            }
            super.mo88628b(akVar);
            this.f265149d.f265164e.mo88668b(this);
        } else {
            z = this.f265150e.equals("e991b170-ec9c-4574-83a4-fb929955b05e");
        }
        if (!z) {
            return;
        }
        super.mo88628b(akVar);
        this.f265149d.f265164e.mo88668b(this);
    }
}
