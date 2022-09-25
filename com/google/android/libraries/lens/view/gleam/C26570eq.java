package com.google.android.libraries.lens.view.gleam;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.gleam.eq */
/* compiled from: PG */
public final /* synthetic */ class C26570eq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26570eq f72428a = new C26570eq();

    private /* synthetic */ C26570eq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Long) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
