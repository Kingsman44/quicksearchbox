package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79952b;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54810ac;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.be */
/* compiled from: PG */
class C112199be implements Function {
    /* renamed from: a */
    public final C54810ac apply(C79952b bVar) {
        C79952b bVar2 = C79952b.UNKNOWN_ORIGIN;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return C54810ac.UNKNOWN_ORIGIN;
        }
        if (ordinal == 1) {
            return C54810ac.SERVER_ORIGIN;
        }
        if (ordinal == 2) {
            return C54810ac.CLIENT_ORIGIN;
        }
        if (ordinal == 3) {
            return C54810ac.IL_CLIENT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
