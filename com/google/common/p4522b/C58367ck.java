package com.google.common.p4522b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.ck */
/* compiled from: PG */
public final /* synthetic */ class C58367ck implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Function f155942a;

    /* renamed from: b */
    public final /* synthetic */ Function f155943b;

    public /* synthetic */ C58367ck(Function function, Function function2) {
        this.f155942a = function;
        this.f155943b = function2;
    }

    public final void accept(Object obj, Object obj2) {
        Function function = this.f155942a;
        Function function2 = this.f155943b;
        Collector collector = C58370cn.f155946a;
        ((C58486gv) obj).mo55419c(function.apply(obj2), function2.apply(obj2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
