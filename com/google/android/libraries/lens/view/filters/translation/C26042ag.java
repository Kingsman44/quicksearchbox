package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ag */
/* compiled from: PG */
public final /* synthetic */ class C26042ag implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26042ag f70763a = new C26042ag();

    private /* synthetic */ C26042ag() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C25327c cVar = (C25327c) obj;
        boolean z = true;
        if (!C25327c.DOWNLOADED.equals(cVar) && !C25327c.PERMANENT.equals(cVar)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
