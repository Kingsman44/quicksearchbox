package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import p3186j$.time.Duration;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dn */
/* compiled from: PG */
public final /* synthetic */ class C77242dn implements Function {

    /* renamed from: a */
    public final /* synthetic */ ZonedDateTime f213082a;

    public /* synthetic */ C77242dn(ZonedDateTime zonedDateTime) {
        this.f213082a = zonedDateTime;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.between(this.f213082a, (ZonedDateTime) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
