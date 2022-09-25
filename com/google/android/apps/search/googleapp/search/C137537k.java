package com.google.android.apps.search.googleapp.search;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.k */
/* compiled from: PG */
public final /* synthetic */ class C137537k implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f374082a;

    public /* synthetic */ C137537k(String str) {
        this.f374082a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f374082a;
        return str + "  " + ((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
