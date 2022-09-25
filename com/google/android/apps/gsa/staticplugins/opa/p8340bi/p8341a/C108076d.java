package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89137i;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71114ff;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.d */
/* compiled from: PG */
class C108076d implements Function {
    /* renamed from: a */
    public final C71114ff apply(C89137i iVar) {
        C89137i iVar2 = C89137i.UNSPECIFIED;
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return C71114ff.UNSPECIFIED;
        }
        if (ordinal == 1) {
            return C71114ff.FLUIDACTIONS;
        }
        if (ordinal == 2) {
            return C71114ff.SERVER;
        }
        if (ordinal == 3) {
            return C71114ff.PORTMON;
        }
        if (ordinal == 4) {
            return C71114ff.NGA;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(iVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
