package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothDevice;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.p */
/* compiled from: PG */
public final /* synthetic */ class C17675p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C17675p f50825a = new C17675p();

    private /* synthetic */ C17675p() {
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
