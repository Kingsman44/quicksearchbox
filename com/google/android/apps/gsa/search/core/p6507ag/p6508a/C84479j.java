package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.j */
/* compiled from: PG */
public final /* synthetic */ class C84479j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C84479j f229905a = new C84479j();

    private /* synthetic */ C84479j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((Map) obj).values());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
