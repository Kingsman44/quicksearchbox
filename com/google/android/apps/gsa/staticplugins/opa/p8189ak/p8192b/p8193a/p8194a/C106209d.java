package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82941gc;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.d */
/* compiled from: PG */
abstract class C106209d implements Function {
    /* renamed from: a */
    public final C82941gc apply(C107706q qVar) {
        C107706q qVar2 = C107706q.CONNECTED;
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return C82941gc.CONNECTED;
        }
        if (ordinal == 1) {
            return C82941gc.STARTED;
        }
        if (ordinal == 2) {
            return mo95456b();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public abstract C82941gc mo95456b();

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
