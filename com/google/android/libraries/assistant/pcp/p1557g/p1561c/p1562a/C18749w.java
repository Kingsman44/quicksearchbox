package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C18749w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52855a;

    public /* synthetic */ C18749w(C18727ah ahVar) {
        this.f52855a = ahVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream(((C123726at) obj).f341747b).map(new C18721ab(this.f52855a)).filter(C18722ac.f52802a).map(C18723ad.f52803a).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
