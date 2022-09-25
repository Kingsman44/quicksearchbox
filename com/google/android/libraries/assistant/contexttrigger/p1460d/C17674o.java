package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothDevice;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.o */
/* compiled from: PG */
public final /* synthetic */ class C17674o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f50824a;

    public /* synthetic */ C17674o(boolean z) {
        this.f50824a = z;
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
        return this.f50824a == C17659a.m34947a(bluetoothDevice) && !bluetoothDevice.getName().isEmpty();
    }
}
