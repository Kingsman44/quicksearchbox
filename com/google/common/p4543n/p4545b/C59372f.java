package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.f */
/* compiled from: PG */
public final /* synthetic */ class C59372f implements Function {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f157573a;

    /* renamed from: b */
    public final /* synthetic */ Function f157574b;

    /* renamed from: c */
    public final /* synthetic */ Function f157575c;

    public /* synthetic */ C59372f(BiFunction biFunction, Function function, Function function2) {
        this.f157573a = biFunction;
        this.f157574b = function;
        this.f157575c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        BiFunction biFunction = this.f157573a;
        Function function = this.f157574b;
        Function function2 = this.f157575c;
        Object apply = function.apply(obj);
        function2.apply(obj);
        return ((C59369c) biFunction).f157570a.apply(apply);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
