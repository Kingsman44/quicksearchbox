package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ce */
/* compiled from: PG */
public final /* synthetic */ class C113174ce implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ double f313490a;

    /* renamed from: b */
    public final /* synthetic */ double f313491b;

    public /* synthetic */ C113174ce(double d, double d2) {
        this.f313490a = d;
        this.f313491b = d2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        double d = this.f313490a;
        double d2 = this.f313491b;
        String str = (String) obj;
        Double d3 = (Double) obj2;
        d3.getClass();
        return Double.valueOf((d3.doubleValue() - d) / d2);
    }
}
