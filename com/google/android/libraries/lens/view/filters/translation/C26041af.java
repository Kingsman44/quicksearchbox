package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.af */
/* compiled from: PG */
public final /* synthetic */ class C26041af implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26041af f70762a = new C26041af();

    private /* synthetic */ C26041af() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C25327c cVar = (C25327c) obj;
        boolean z = true;
        if (!C25327c.DOWNLOADABLE.equals(cVar) && !C25327c.FAILED.equals(cVar)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
