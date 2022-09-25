package com.google.common.p4522b;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.bn */
/* compiled from: PG */
public final /* synthetic */ class C58343bn implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C58343bn f155915a = new C58343bn();

    private /* synthetic */ C58343bn() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58692ol olVar = (C58692ol) obj;
        Collector collector = C58370cn.f155946a;
        olVar.addAll((C58692ol) obj2);
        return olVar;
    }
}
