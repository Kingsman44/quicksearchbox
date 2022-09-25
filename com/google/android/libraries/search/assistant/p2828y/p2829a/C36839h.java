package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C50971bp;
import com.google.assistant.p3931f.p3939c.C52831h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.h */
/* compiled from: PG */
class C36839h implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52831h hVar = (C52831h) obj;
        C52831h hVar2 = C52831h.UNKNOWN;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return C50971bp.UNKNOWN;
        }
        if (ordinal == 1) {
            return C50971bp.PENDING;
        }
        if (ordinal == 2) {
            return C50971bp.DISAMBIG;
        }
        if (ordinal == 3) {
            return C50971bp.ACCEPTED;
        }
        if (ordinal == 4) {
            return C50971bp.REJECTED;
        }
        if (ordinal == 5) {
            return C50971bp.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(hVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
