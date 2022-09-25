package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.x */
/* compiled from: PG */
public final /* synthetic */ class C26230x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C26217r f71276a;

    public /* synthetic */ C26230x(C26217r rVar) {
        this.f71276a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f71276a.mo31432b((Locale) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
