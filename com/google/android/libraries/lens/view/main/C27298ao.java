package com.google.android.libraries.lens.view.main;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.main.ao */
/* compiled from: PG */
public final /* synthetic */ class C27298ao implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27298ao f74708a = new C27298ao();

    private /* synthetic */ C27298ao() {
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
