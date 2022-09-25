package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ca */
/* compiled from: PG */
public final /* synthetic */ class C26090ca implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26090ca f70902a = new C26090ca();

    private /* synthetic */ C26090ca() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Locale) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
