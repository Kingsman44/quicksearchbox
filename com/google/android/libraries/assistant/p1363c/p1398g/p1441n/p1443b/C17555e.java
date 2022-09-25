package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.e */
/* compiled from: PG */
public final /* synthetic */ class C17555e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f50609a;

    public /* synthetic */ C17555e(Optional optional) {
        this.f50609a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f50609a.flatMap(new C17558h((Locale) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
