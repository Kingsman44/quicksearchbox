package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ae */
/* compiled from: PG */
public final /* synthetic */ class C111814ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111823an f310743a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310744b;

    public /* synthetic */ C111814ae(C111823an anVar, C113405ep epVar) {
        this.f310743a = anVar;
        this.f310744b = epVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111823an anVar = this.f310743a;
        C113405ep epVar = this.f310744b;
        return anVar.f310761d.f310773g.mo28210j((C60870cx) obj, "Rerank slow response", new C111819aj(anVar, epVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
