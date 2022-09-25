package com.google.android.libraries.search.silk.web.core;

import com.google.android.libraries.web.base.WebConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.silk.web.core.e */
/* compiled from: PG */
public final /* synthetic */ class C40751e implements Function {

    /* renamed from: a */
    public final /* synthetic */ WebConfig f106852a;

    public /* synthetic */ C40751e(WebConfig webConfig) {
        this.f106852a = webConfig;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f106852a.mo46298a((Class) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
