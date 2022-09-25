package com.google.common.p4543n.p4545b;

import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.i */
/* compiled from: PG */
public final /* synthetic */ class C59375i implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f157579a;

    /* renamed from: b */
    public final /* synthetic */ Function f157580b;

    public /* synthetic */ C59375i(Function function, Function function2) {
        this.f157579a = function;
        this.f157580b = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Function function = this.f157579a;
        Function function2 = this.f157580b;
        function.apply(obj);
        return function2.apply(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
