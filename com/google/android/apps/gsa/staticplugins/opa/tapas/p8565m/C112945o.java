package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.o */
/* compiled from: PG */
public final /* synthetic */ class C112945o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C59545do f313001a;

    public /* synthetic */ C112945o(C59545do doVar) {
        this.f313001a = doVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59545do doVar = this.f313001a;
        C113502n nVar = (C113502n) obj;
        Optional j = nVar.mo100047j();
        Objects.requireNonNull(doVar);
        j.ifPresent(new C112946p(doVar));
        Optional f = nVar.mo100042f();
        Objects.requireNonNull(doVar);
        f.ifPresent(new C112947q(doVar));
        return (C59546dp) doVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
