package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.assistant.p3860as.C49802p;
import p3186j$.time.LocalDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.j */
/* compiled from: PG */
public final /* synthetic */ class C106684j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106696v f297356a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f297357b;

    public /* synthetic */ C106684j(C106696v vVar, LocalDateTime localDateTime) {
        this.f297356a = vVar;
        this.f297357b = localDateTime;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f297356a.mo95615c((C49802p) obj, this.f297357b) == C106694t.f297376b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
