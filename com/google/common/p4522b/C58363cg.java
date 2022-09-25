package com.google.common.p4522b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.cg */
/* compiled from: PG */
public final /* synthetic */ class C58363cg implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Function f155937a;

    /* renamed from: b */
    public final /* synthetic */ Function f155938b;

    public /* synthetic */ C58363cg(Function function, Function function2) {
        this.f155937a = function;
        this.f155938b = function2;
    }

    public final void accept(Object obj, Object obj2) {
        Function function = this.f155937a;
        Function function2 = this.f155938b;
        Collector collector = C58370cn.f155946a;
        ((C58490gz) obj).mo55429h(function.apply(obj2), function2.apply(obj2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
