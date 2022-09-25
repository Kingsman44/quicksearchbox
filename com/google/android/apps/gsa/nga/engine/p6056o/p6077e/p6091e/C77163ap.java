package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import p3186j$.time.Duration;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C77163ap implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77167at f212949a;

    public /* synthetic */ C77163ap(C77167at atVar) {
        this.f212949a = atVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.between(this.f212949a.f212956a.mo74015g(), (ZonedDateTime) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
