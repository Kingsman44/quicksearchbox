package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.av */
/* compiled from: PG */
public final /* synthetic */ class C111954av implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111971bl f311023a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311024b;

    public /* synthetic */ C111954av(C111971bl blVar, C113405ep epVar) {
        this.f311023a = blVar;
        this.f311024b = epVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111971bl blVar = this.f311023a;
        C113405ep epVar = this.f311024b;
        return blVar.f311059f.mo28210j((C60870cx) obj, "Rerank slow response", new C111965bf(blVar, epVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
