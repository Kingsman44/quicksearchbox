package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.assistant.p3825an.p3830c.p3831a.C49319ck;
import com.google.assistant.p3825an.p3830c.p3831a.C49320cl;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C130433ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130433ab f357395a = new C130433ab();

    private /* synthetic */ C130433ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58148f fVar = (C58148f) obj;
        C49319ck ckVar = (C49319ck) C49320cl.f127467c.createBuilder();
        Optional a = C130440ai.m212874a(fVar, "name");
        Objects.requireNonNull(ckVar);
        a.ifPresent(new C130457r(ckVar));
        C58485gu guVar = (C58485gu) C130440ai.m212875b(fVar, "value").flatMap(C130458s.f357422a).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            ckVar.mo53231a(guVar);
        }
        return (C49320cl) ckVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
