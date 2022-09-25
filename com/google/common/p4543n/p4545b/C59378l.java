package com.google.common.p4543n.p4545b;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.l */
/* compiled from: PG */
public final /* synthetic */ class C59378l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C59378l f157583a = new C59378l();

    private /* synthetic */ C59378l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
