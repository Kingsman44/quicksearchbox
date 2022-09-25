package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82936fy;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.c */
/* compiled from: PG */
class C106208c implements Function {
    /* renamed from: a */
    public final C82936fy apply(C106204a aVar) {
        C106204a aVar2 = C106204a.CREATE;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return C82936fy.CREATE;
        }
        if (ordinal == 1) {
            return C82936fy.CONNECT;
        }
        if (ordinal == 2) {
            return C82936fy.START;
        }
        if (ordinal == 3) {
            return C82936fy.STOP;
        }
        if (ordinal == 4) {
            return C82936fy.DISCONNECT;
        }
        if (ordinal == 5) {
            return C82936fy.UPDATE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
