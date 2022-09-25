package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothDevice;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.t */
/* compiled from: PG */
public final /* synthetic */ class C17679t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C17679t f50829a = new C17679t();

    private /* synthetic */ C17679t() {
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
        return C17659a.m34947a((BluetoothDevice) obj);
    }
}
