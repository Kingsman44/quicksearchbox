package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2067ak.C25261cm;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.w */
/* compiled from: PG */
public final /* synthetic */ class C26229w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26229w f71275a = new C26229w();

    private /* synthetic */ C26229w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = C26059ax.f70784a;
        return Locale.forLanguageTag(((C25261cm) obj).f68724a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
