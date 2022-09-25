package com.google.common.p4522b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.bm */
/* compiled from: PG */
public final /* synthetic */ class C58342bm implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Function f155914a;

    public /* synthetic */ C58342bm(Function function) {
        this.f155914a = function;
    }

    public final void accept(Object obj, Object obj2) {
        Function function = this.f155914a;
        Collector collector = C58370cn.f155946a;
        Object apply = function.apply(obj2);
        apply.getClass();
        ((C58692ol) obj).mo54931lF(apply, 1);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
