package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.assistant.p3825an.p3830c.p3831a.C49264aj;
import com.google.assistant.p3825an.p3830c.p3831a.C49265ak;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.ad */
/* compiled from: PG */
public final /* synthetic */ class C130435ad implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130435ad f357397a = new C130435ad();

    private /* synthetic */ C130435ad() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58148f fVar = (C58148f) obj;
        C49264aj ajVar = (C49264aj) C49265ak.f127342c.createBuilder();
        Optional a = C130440ai.m212874a(fVar, "name");
        Objects.requireNonNull(ajVar);
        a.ifPresent(new C130455p(ajVar));
        C58485gu guVar = (C58485gu) C130440ai.m212875b(fVar, "parameter").flatMap(C130432aa.f357394a).map(C130433ab.f357395a).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            ajVar.copyOnWrite();
            C49265ak akVar = (C49265ak) ajVar.instance;
            akVar.mo53225a();
            C62947c.addAll((Iterable) guVar, (List) akVar.f127345b);
        }
        return (C49265ak) ajVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
