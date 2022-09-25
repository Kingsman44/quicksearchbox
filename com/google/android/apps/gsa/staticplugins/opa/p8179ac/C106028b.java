package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.assistant.p1528m.p1529a.C18430o;
import com.google.assistant.p3745ab.p3746a.C48188l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.b */
/* compiled from: PG */
class C106028b implements Function {
    /* renamed from: a */
    public final C48188l apply(C18430o oVar) {
        C18430o oVar2 = C18430o.UNKNOWN;
        switch (oVar.ordinal()) {
            case 0:
                return C48188l.UNKNOWN_STORAGE_STATUS;
            case 1:
                return C48188l.OK;
            case 2:
                return C48188l.ERROR;
            case 3:
                return C48188l.INVALID_ARGUMENT;
            case 4:
                return C48188l.SKIP;
            case 5:
                return C48188l.ALREADY_EXIST;
            case 6:
                return C48188l.USER_UNVERIFIED;
            case 7:
                return C48188l.BLOCKED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(oVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
