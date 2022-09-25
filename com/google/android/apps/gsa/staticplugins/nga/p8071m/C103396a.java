package com.google.android.apps.gsa.staticplugins.nga.p8071m;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.m.a */
/* compiled from: PG */
public final /* synthetic */ class C103396a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103396a f288236a = new C103396a();

    private /* synthetic */ C103396a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Double.valueOf((double) ((Duration) obj).toMillis());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
