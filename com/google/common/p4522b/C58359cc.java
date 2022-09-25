package com.google.common.p4522b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.cc */
/* compiled from: PG */
public final /* synthetic */ class C58359cc implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Function f155932a;

    /* renamed from: b */
    public final /* synthetic */ Function f155933b;

    public /* synthetic */ C58359cc(Function function, Function function2) {
        this.f155932a = function;
        this.f155933b = function2;
    }

    public final void accept(Object obj, Object obj2) {
        Function function = this.f155932a;
        Function function2 = this.f155933b;
        Collector collector = C58370cn.f155946a;
        ((C58529ik) obj).mo55495c(function.apply(obj2), function2.apply(obj2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
