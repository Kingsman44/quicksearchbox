package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70931p;

/* renamed from: com.google.android.libraries.search.assistant.f.b.i */
/* compiled from: PG */
class C32931i implements Function {
    /* renamed from: a */
    public final C70931p apply(C32831bz bzVar) {
        C32831bz bzVar2 = C32831bz.UNKNOWN_INVOCATION_TYPE;
        int ordinal = bzVar.ordinal();
        if (ordinal == 0) {
            return C70931p.UNKNOWN_INVOCATION_TYPE;
        }
        if (ordinal == 1) {
            return C70931p.ASSIST_DATA;
        }
        if (ordinal == 2) {
            return C70931p.SCREENSHOT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bzVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
