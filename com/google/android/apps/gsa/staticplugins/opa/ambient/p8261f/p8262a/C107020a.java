package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.p8262a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C107020a implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ Optional f298037a;

    public /* synthetic */ C107020a(Optional optional) {
        this.f298037a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106596h hVar = (C106596h) obj;
        return (C106596h) this.f298037a.get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
