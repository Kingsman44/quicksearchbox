package com.google.android.libraries.p11016ak.p11019c.p11020a;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ak.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C147640d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147640d f398481a = new C147640d();

    private /* synthetic */ C147640d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Integer) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
