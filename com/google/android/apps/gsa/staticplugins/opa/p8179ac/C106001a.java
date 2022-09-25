package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.assistant.p1528m.p1529a.C18423h;
import com.google.assistant.p3745ab.p3746a.C48188l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.a */
/* compiled from: PG */
class C106001a implements Function {
    /* renamed from: a */
    public final C48188l apply(C18423h hVar) {
        C18423h hVar2 = C18423h.UNKNOWN;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return C48188l.UNKNOWN_STORAGE_STATUS;
        }
        if (ordinal == 1) {
            return C48188l.OK;
        }
        if (ordinal == 2) {
            return C48188l.KEY_NOT_FOUND;
        }
        if (ordinal == 3) {
            return C48188l.INVALID_ARGUMENT;
        }
        if (ordinal == 4) {
            return C48188l.USER_UNVERIFIED;
        }
        if (ordinal == 5) {
            return C48188l.BLOCKED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(hVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
