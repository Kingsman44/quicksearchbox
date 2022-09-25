package com.google.android.apps.gsa.opa.smartspace.p6454c;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c.b */
/* compiled from: PG */
public final /* synthetic */ class C83746b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83751g f228276a;

    public /* synthetic */ C83746b(C83751g gVar) {
        this.f228276a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.ofMillis(this.f228276a.f228283d.mo26871c()).minus((Duration) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
