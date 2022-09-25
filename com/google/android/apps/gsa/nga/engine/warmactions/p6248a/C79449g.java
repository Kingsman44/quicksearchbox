package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.g */
/* compiled from: PG */
class C79449g implements Function {
    /* renamed from: a */
    public final C79562t apply(C128460d dVar) {
        C128460d dVar2 = C128460d.START;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return C79562t.CONTEXT_START;
        }
        if (ordinal == 1) {
            return C79562t.CONTEXT_END;
        }
        if (ordinal == 2) {
            return C79562t.CONTEXT_TIMEOUT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(dVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
