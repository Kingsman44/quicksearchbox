package com.google.android.apps.gsa.opa.smartspace.p6454c;

import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c.c */
/* compiled from: PG */
public final /* synthetic */ class C83747c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83751g f228277a;

    public /* synthetic */ C83747c(C83751g gVar) {
        this.f228277a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.between((Instant) obj, Instant.ofEpochMilli(this.f228277a.f228283d.mo26870b())).abs();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
