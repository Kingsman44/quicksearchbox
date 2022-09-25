package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.l */
/* compiled from: PG */
public final /* synthetic */ class C111189l implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f309485a;

    public /* synthetic */ C111189l(Optional optional) {
        this.f309485a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = this.f309485a;
        C59071e eVar = C111175am.f309456a;
        return optional.map(new C111185h((Long) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
