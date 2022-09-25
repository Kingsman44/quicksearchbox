package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.c */
/* compiled from: PG */
public final /* synthetic */ class C95486c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Instant f267208a;

    public /* synthetic */ C95486c(Instant instant) {
        this.f267208a = instant;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Instant instant = this.f267208a;
        C58976aa aaVar = C58975e.f156826a;
        return Boolean.valueOf(((Instant) obj).isAfter(instant.plus(C95493j.f267220d)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
