package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113496i;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.gr */
/* compiled from: PG */
public final /* synthetic */ class C112900gr implements Function {

    /* renamed from: a */
    public final /* synthetic */ C59545do f312915a;

    public /* synthetic */ C112900gr(C59545do doVar) {
        this.f312915a = doVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59545do doVar = this.f312915a;
        Optional b = ((C113496i) obj).mo99952b();
        Objects.requireNonNull(doVar);
        b.ifPresent(new C112901gs(doVar));
        return (C59546dp) doVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
