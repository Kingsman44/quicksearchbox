package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.utils.C28136y;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cb */
/* compiled from: PG */
public final /* synthetic */ class C26091cb implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26091cb f70903a = new C26091cb();

    private /* synthetic */ C26091cb() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C28136y.m52431b((Locale) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
