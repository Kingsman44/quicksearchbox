package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bj */
/* compiled from: PG */
public final /* synthetic */ class C106902bj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297804a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f297805b;

    public /* synthetic */ C106902bj(C106918bz bzVar, C58495hd hdVar) {
        this.f297804a = bzVar;
        this.f297805b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C123728av) obj).f341758d).map(new C106910br(this.f297804a, this.f297805b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
