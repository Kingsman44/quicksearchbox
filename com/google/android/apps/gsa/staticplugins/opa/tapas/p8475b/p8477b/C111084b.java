package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C111084b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111090h f309313a;

    public /* synthetic */ C111084b(C111090h hVar) {
        this.f309313a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111090h hVar = this.f309313a;
        Stream stream = Collection.EL.stream((C58485gu) obj);
        C113206m mVar = hVar.f309320b;
        Objects.requireNonNull(mVar);
        return (C58485gu) stream.map(new C111085c(mVar)).filter(C111086d.f309315a).map(C111087e.f309316a).filter(new C111088f(hVar)).map(new C111089g(hVar)).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
