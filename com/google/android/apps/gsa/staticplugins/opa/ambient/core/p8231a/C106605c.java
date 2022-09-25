package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothDevice;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.c */
/* compiled from: PG */
public final /* synthetic */ class C106605c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106605c f297238a = new C106605c();

    private /* synthetic */ C106605c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((BluetoothDevice) obj).getAddress();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
