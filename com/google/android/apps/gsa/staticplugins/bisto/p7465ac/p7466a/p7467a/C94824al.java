package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95012c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.al */
/* compiled from: PG */
public final class C94824al extends C94819ag {

    /* renamed from: c */
    private final C94828c f265145c;

    /* renamed from: d */
    private final String f265146d;

    /* renamed from: e */
    private final AtomicBoolean f265147e;

    public C94824al(C94828c cVar, String str, boolean z) {
        this.f265145c = cVar;
        this.f265146d = str;
        this.f265147e = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public final C94841p call() {
        byte[] bArr;
        C95013d dVar = (C95013d) this.f265145c.f265162c.mo56111f();
        C95012c cVar = (C95012c) this.f265145c.mo88646b().mo56111f();
        if (dVar == null || cVar == null) {
            return C94841p.FATAL_ERROR;
        }
        BluetoothGattCharacteristic characteristic = cVar.f265821a.getCharacteristic(UUID.fromString(this.f265146d));
        if (characteristic != null) {
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(C94842q.f265235b);
            if (descriptor == null) {
                return C94841p.FATAL_ERROR;
            }
            if ((characteristic.getProperties() & 32) != 0) {
                bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            }
            descriptor.setValue(bArr);
            if (!dVar.mo88926h(descriptor)) {
                return C94841p.FATAL_ERROR;
            }
            this.f265145c.f265164e.mo88667a(this);
            if (dVar.mo88924f(characteristic, true)) {
                return C94841p.ERROR_NOT_SPECIFIED;
            }
            this.f265145c.f265164e.mo88668b(this);
            return C94841p.NON_FATAL_ERROR;
        } else if (!this.f265147e.get()) {
            return C94841p.FATAL_ERROR;
        } else {
            C94812a aVar = new C94812a();
            aVar.mo88623b(C94841p.SUBSCRIPTION_SKIPPED);
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
        if (!(ordinal == 13 || ordinal == 23)) {
            switch (ordinal) {
                case 8:
                    z = this.f265146d.equals("dd1d1206-568f-4b2d-a48c-969d8ad1f457");
                    break;
                case 9:
                    z = this.f265146d.equals("e90c4308-3984-41f3-be3c-7118093c3300");
                    break;
                case 10:
                    z = this.f265146d.equals("389e8365-158f-4308-9204-756f29b6a87c");
                    break;
                case 11:
                    z = this.f265146d.equals("e991b170-ec9c-4574-83a4-fb929955b05e");
                    break;
                default:
                    return;
            }
            if (!z) {
                return;
            }
        }
        super.mo88628b(akVar);
        this.f265145c.f265164e.mo88668b(this);
    }
}
