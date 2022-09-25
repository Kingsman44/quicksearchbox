package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82897em;
import com.google.android.libraries.gsa.conversation.p1855h.C22714r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.a */
/* compiled from: PG */
class C106206a implements Function {
    /* renamed from: a */
    public final C82897em apply(C22714r rVar) {
        C22714r rVar2 = C22714r.UNSPECIFIED;
        int ordinal = rVar.ordinal();
        if (ordinal == 0) {
            return C82897em.UNSPECIFIED;
        }
        if (ordinal == 1) {
            return C82897em.SUCCESS;
        }
        if (ordinal == 2) {
            return C82897em.POSTPONED;
        }
        if (ordinal == 3) {
            return C82897em.FAILURE;
        }
        if (ordinal == 4) {
            return C82897em.CANCEL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(rVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
