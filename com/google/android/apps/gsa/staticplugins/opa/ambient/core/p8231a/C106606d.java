package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothDevice;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.d */
/* compiled from: PG */
public final /* synthetic */ class C106606d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106606d f297239a = new C106606d();

    private /* synthetic */ C106606d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((BluetoothDevice) obj).getName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
