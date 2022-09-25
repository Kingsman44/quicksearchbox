package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82944gf;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.e */
/* compiled from: PG */
class C106210e implements Function {
    /* renamed from: a */
    public final C82944gf apply(C107708s sVar) {
        C107708s sVar2 = C107708s.OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER;
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            return C82944gf.OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER;
        }
        if (ordinal == 1) {
            return C82944gf.NGA_SEARCH_SERVICE_CLIENT_USER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
