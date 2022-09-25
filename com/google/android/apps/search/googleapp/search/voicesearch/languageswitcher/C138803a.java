package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.a */
/* compiled from: PG */
public final /* synthetic */ class C138803a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C138803a f377559a = new C138803a();

    private /* synthetic */ C138803a() {
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
