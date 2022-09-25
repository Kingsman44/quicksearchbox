package com.google.android.apps.gsa.searchplate;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.searchplate.ap */
/* compiled from: PG */
public final /* synthetic */ class C88914ap implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C88914ap f240867a = new C88914ap();

    private /* synthetic */ C88914ap() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale forLanguageTag = Locale.forLanguageTag((String) obj);
        return forLanguageTag.getDisplayLanguage(forLanguageTag);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
