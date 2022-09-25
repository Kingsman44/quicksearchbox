package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89139k;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71116fh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.e */
/* compiled from: PG */
class C108077e implements Function {
    /* renamed from: a */
    public final C71116fh apply(C89139k kVar) {
        C89139k kVar2 = C89139k.UNDEFINED;
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            return C71116fh.UNDEFINED;
        }
        if (ordinal == 1) {
            return C71116fh.VOICE;
        }
        if (ordinal == 2) {
            return C71116fh.TEXT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(kVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
