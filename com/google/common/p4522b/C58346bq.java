package com.google.common.p4522b;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.bq */
/* compiled from: PG */
public final /* synthetic */ class C58346bq implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C58346bq f155918a = new C58346bq();

    private /* synthetic */ C58346bq() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58523ie ieVar = (C58523ie) obj;
        for (C58714pg b : ((C58523ie) obj2).f156170a) {
            ieVar.mo55482b(b);
        }
        return ieVar;
    }
}
