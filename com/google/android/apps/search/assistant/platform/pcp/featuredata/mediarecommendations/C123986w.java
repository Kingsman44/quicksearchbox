package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.w */
/* compiled from: PG */
public final /* synthetic */ class C123986w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123928ad f342453a;

    public /* synthetic */ C123986w(C123928ad adVar) {
        this.f342453a = adVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123928ad adVar = this.f342453a;
        Instant instant = (Instant) obj;
        Instant a = adVar.f342288a.mo57444a();
        Duration.between(instant, a);
        return Boolean.valueOf(instant.plus(C62950b.m95473d((C62910ar) adVar.f342290c.mo17428b())).isAfter(a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
