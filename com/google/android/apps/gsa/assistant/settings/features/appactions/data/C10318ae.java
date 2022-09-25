package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ae */
/* compiled from: PG */
public final /* synthetic */ class C10318ae implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C10325al f34965a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f34966b;

    public /* synthetic */ C10318ae(C10325al alVar, C58817ah ahVar) {
        this.f34965a = alVar;
        this.f34966b = ahVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C10325al alVar = this.f34965a;
        C58817ah ahVar = this.f34966b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        Objects.requireNonNull(ahVar);
        return Optional.m71637of(alVar.f34992g.mo28209i((C60870cx) optional.get(), "mutator", new C10365w(ahVar)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
