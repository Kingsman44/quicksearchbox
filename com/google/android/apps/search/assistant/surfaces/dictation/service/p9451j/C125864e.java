package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64727f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.e */
/* compiled from: PG */
class C125864e implements Function {
    /* renamed from: a */
    public final C119299u apply(C64727f fVar) {
        C64727f fVar2 = C64727f.UNKNOWN_STICKINESS;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return C119299u.UNKNOWN_STICKINESS;
        }
        if (ordinal == 1) {
            return C119299u.DEFAULT;
        }
        if (ordinal == 2) {
            return C119299u.STICKY;
        }
        if (ordinal == 3) {
            return C119299u.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(fVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
