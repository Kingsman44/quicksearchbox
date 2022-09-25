package com.google.android.libraries.lens.view.filters.translation.p2106a;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.a.e */
/* compiled from: PG */
public final /* synthetic */ class C26029e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26029e f70746a = new C26029e();

    private /* synthetic */ C26029e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Locale.forLanguageTag((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
