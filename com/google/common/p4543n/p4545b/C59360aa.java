package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.n.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C59360aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C59363ad f157559a;

    /* renamed from: b */
    public final /* synthetic */ BiFunction f157560b;

    public /* synthetic */ C59360aa(C59363ad adVar, BiFunction biFunction) {
        this.f157559a = adVar;
        this.f157560b = biFunction;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59363ad adVar = this.f157559a;
        return this.f157560b.apply(adVar.f157566c.apply(obj), adVar.f157567d.apply(obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
