package com.google.android.libraries.lens.view.p2056af;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.af.i */
/* compiled from: PG */
public final /* synthetic */ class C25079i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C25079i f68336a = new C25079i();

    private /* synthetic */ C25079i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
