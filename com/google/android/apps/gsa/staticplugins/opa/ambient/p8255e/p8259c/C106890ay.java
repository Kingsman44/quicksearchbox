package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ay */
/* compiled from: PG */
public final /* synthetic */ class C106890ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297788a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f297789b;

    public /* synthetic */ C106890ay(C106918bz bzVar, C58495hd hdVar) {
        this.f297788a = bzVar;
        this.f297789b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C53020k) obj).f138974c).map(new C106891az(this.f297788a, this.f297789b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
