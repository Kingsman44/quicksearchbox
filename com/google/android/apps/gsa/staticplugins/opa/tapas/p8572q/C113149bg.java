package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.nfc.NfcAdapter;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bg */
/* compiled from: PG */
public final /* synthetic */ class C113149bg implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113149bg f313465a = new C113149bg();

    private /* synthetic */ C113149bg() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((NfcAdapter) obj).isEnabled());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
