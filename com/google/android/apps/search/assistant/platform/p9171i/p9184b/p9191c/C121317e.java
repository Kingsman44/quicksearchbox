package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.e */
/* compiled from: PG */
public final /* synthetic */ class C121317e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f336906a;

    public /* synthetic */ C121317e(Optional optional) {
        this.f336906a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int intValue = ((Integer) obj).intValue();
        return "android.resource://" + ((String) this.f336906a.get()) + "/" + intValue;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
