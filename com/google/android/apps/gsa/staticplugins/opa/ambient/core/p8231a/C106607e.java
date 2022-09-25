package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.assistant.shared.C73801ae;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.e */
/* compiled from: PG */
public final /* synthetic */ class C106607e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f297240a;

    public /* synthetic */ C106607e(boolean z) {
        this.f297240a = z;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        return this.f297240a == C73801ae.m108365a(bluetoothDevice) && !bluetoothDevice.getName().isEmpty();
    }
}
