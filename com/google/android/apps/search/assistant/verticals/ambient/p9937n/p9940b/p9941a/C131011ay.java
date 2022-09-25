package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131088k;
import com.google.assistant.p3886c.p3887a.C50682r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C131011ay implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131011ay f358410a = new C131011ay();

    private /* synthetic */ C131011ay() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131088k kVar = (C131088k) obj;
        Duration duration = C131043cc.f358455a;
        C50682r a = kVar.mo110058a();
        return Collection.EL.stream(((C58495hd) Collection.EL.stream(kVar.mo110059b()).collect(C58370cn.m89403c(C131007au.f358405a, new C131008av(Instant.ofEpochMilli(a.f131857c), Instant.ofEpochMilli(a.f131858d)), C131009aw.f358408a))).entrySet()).map(new C131010ax(C131043cc.m213553f(kVar)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
