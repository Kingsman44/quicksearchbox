package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.e */
/* compiled from: PG */
public final /* synthetic */ class C10347e implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C69464a f35029a;

    public /* synthetic */ C10347e(C69464a aVar) {
        this.f35029a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        return optional.isPresent() ? optional : Optional.m71637of((C60870cx) this.f35029a.mo17428b());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
