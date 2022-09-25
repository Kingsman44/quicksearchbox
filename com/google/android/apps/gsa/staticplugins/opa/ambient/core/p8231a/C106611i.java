package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.assistant.shared.C73801ae;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.i */
/* compiled from: PG */
public final /* synthetic */ class C106611i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C106611i f297246a = new C106611i();

    private /* synthetic */ C106611i() {
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
        return C73801ae.m108365a((BluetoothDevice) obj);
    }
}
