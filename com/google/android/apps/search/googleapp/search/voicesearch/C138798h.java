package com.google.android.apps.search.googleapp.search.voicesearch;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.h */
/* compiled from: PG */
public final /* synthetic */ class C138798h implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f377550a;

    public /* synthetic */ C138798h(String str) {
        this.f377550a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f377550a;
        return str + "  " + ((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
