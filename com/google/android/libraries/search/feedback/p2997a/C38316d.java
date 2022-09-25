package com.google.android.libraries.search.feedback.p2997a;

import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.feedback.a.d */
/* compiled from: PG */
public final /* synthetic */ class C38316d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C38316d f101490a = new C38316d();

    private /* synthetic */ C38316d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C38319g.f101493a;
        return Collection.EL.stream(((Map) obj).entrySet());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
