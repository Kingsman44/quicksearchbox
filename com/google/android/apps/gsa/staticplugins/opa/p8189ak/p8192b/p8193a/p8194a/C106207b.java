package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82900ep;
import com.google.android.libraries.gsa.conversation.p1855h.C22721y;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.b */
/* compiled from: PG */
class C106207b implements Function {
    /* renamed from: a */
    public final C82900ep apply(C22721y yVar) {
        C22721y yVar2 = C22721y.SUCCESS;
        int ordinal = yVar.ordinal();
        if (ordinal == 0) {
            return C82900ep.SUCCESS;
        }
        if (ordinal == 1) {
            return C82900ep.FAILURE;
        }
        if (ordinal == 2) {
            return C82900ep.CANCEL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(yVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
