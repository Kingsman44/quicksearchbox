package com.google.android.apps.gsa.staticplugins.bisto.p7493k;

import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.k.a */
/* compiled from: PG */
public final /* synthetic */ class C95475a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C95477c f267164a;

    public /* synthetic */ C95475a(C95477c cVar) {
        this.f267164a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f267164a.f267172e.mo57444a().isBefore(((Instant) obj).plus(C95477c.f267169b)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
