package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C111341aj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111341aj f309828a = new C111341aj();

    private /* synthetic */ C111341aj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
