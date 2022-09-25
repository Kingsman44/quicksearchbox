package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89141m;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71118fj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.f */
/* compiled from: PG */
class C108078f implements Function {
    /* renamed from: a */
    public final C71118fj apply(C89141m mVar) {
        C89141m mVar2 = C89141m.NOTDEFINED;
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            return C71118fj.NOTDEFINED;
        }
        if (ordinal == 1) {
            return C71118fj.OPA_AGSA;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(mVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
