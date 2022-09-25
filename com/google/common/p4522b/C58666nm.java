package com.google.common.p4522b;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.b.nm */
/* compiled from: PG */
public final /* synthetic */ class C58666nm implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C58666nm f156396a = new C58666nm();

    private /* synthetic */ C58666nm() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58669np npVar = (C58669np) obj;
        if (npVar.f156400b.isEmpty()) {
            return Optional.ofNullable(npVar.f156399a);
        }
        throw npVar.mo55743a(false);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
