package com.google.android.apps.search.googleapp.search.voicesearch;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.z */
/* compiled from: PG */
public final /* synthetic */ class C138918z implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f377851a;

    public /* synthetic */ C138918z(String str) {
        this.f377851a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f377851a;
        return str + "  " + ((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
