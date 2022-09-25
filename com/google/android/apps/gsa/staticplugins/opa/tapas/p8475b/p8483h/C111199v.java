package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51563mi;
import com.google.assistant.p3897e.p3917i.p3918a.C51564mj;
import com.google.common.p4526f.C59071e;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.v */
/* compiled from: PG */
public final /* synthetic */ class C111199v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111199v f309495a = new C111199v();

    private /* synthetic */ C111199v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58148f fVar = (C58148f) obj;
        C59071e eVar = C111175am.f309456a;
        C51563mi miVar = (C51563mi) C51564mj.f134396d.createBuilder();
        Optional e = C111175am.m184929e(fVar, "accumulatedTime");
        Objects.requireNonNull(miVar);
        e.ifPresent(new C111191n(miVar));
        Optional e2 = C111175am.m184929e(fVar, "elapsedTime");
        Objects.requireNonNull(miVar);
        e2.ifPresent(new C111202y(miVar));
        return (C51564mj) miVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
