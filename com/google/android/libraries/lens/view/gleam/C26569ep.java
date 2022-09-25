package com.google.android.libraries.lens.view.gleam;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.gleam.ep */
/* compiled from: PG */
public final /* synthetic */ class C26569ep implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26569ep f72427a = new C26569ep();

    private /* synthetic */ C26569ep() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Integer) ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
