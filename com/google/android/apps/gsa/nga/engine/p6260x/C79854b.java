package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.b */
/* compiled from: PG */
class C79854b implements Function {
    /* renamed from: a */
    public final C80479d apply(C77556ai aiVar) {
        C77556ai aiVar2 = C77556ai.PARTIAL;
        int ordinal = aiVar.ordinal();
        if (ordinal == 0) {
            return C80479d.PARTIAL;
        }
        if (ordinal == 1) {
            return C80479d.PREFETCH;
        }
        if (ordinal == 2) {
            return C80479d.FINAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aiVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
