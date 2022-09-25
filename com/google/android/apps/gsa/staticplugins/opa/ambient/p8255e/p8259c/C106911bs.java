package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bs */
/* compiled from: PG */
public final /* synthetic */ class C106911bs implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297817a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f297818b;

    public /* synthetic */ C106911bs(C106918bz bzVar, C58495hd hdVar) {
        this.f297817a = bzVar;
        this.f297818b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C123728av) obj).f341758d).map(new C106880ao(this.f297817a, this.f297818b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
