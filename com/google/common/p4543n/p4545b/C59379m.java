package com.google.common.p4543n.p4545b;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.m */
/* compiled from: PG */
public final /* synthetic */ class C59379m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C59379m f157584a = new C59379m();

    private /* synthetic */ C59379m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
