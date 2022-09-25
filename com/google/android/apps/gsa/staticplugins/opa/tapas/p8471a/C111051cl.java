package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.p4129b.p4136c.C54761i;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cl */
/* compiled from: PG */
public final /* synthetic */ class C111051cl implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111053cn f309258a;

    public /* synthetic */ C111051cl(C111053cn cnVar) {
        this.f309258a = cnVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111053cn cnVar = this.f309258a;
        C49301bt btVar = (C49301bt) obj;
        C54761i iVar = btVar.f127429e;
        if (iVar == null) {
            iVar = C54761i.f143683c;
        }
        C62971cq cqVar = iVar.f143685a;
        return C60922j.m93044g(C60856cj.m92896e((Iterable) Collection.EL.stream(cqVar).map(new C111044ce(cnVar)).collect(C58370cn.f155946a)), new C111045cf(cqVar, btVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
