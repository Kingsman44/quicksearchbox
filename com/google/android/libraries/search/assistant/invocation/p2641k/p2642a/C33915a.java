package com.google.android.libraries.search.assistant.invocation.p2641k.p2642a;

import com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71102eu;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.a.a */
/* compiled from: PG */
class C33915a implements Function {
    /* renamed from: a */
    public final C71102eu apply(C33891b bVar) {
        C33891b bVar2 = C33891b.INVOCATION_STATE_UNSPECIFIED;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return C71102eu.INVOCATION_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return C71102eu.IMPLICIT;
        }
        if (ordinal == 2) {
            return C71102eu.EXPLICIT;
        }
        if (ordinal == 3) {
            return C71102eu.CANCELED;
        }
        if (ordinal == 4) {
            return C71102eu.EXECUTED;
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
