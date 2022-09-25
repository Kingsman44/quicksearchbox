package com.google.android.apps.search.transcription.voiceime;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.voiceime.q */
/* compiled from: PG */
public final /* synthetic */ class C142020q implements UnaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C142020q f385340a = new C142020q();

    private /* synthetic */ C142020q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C142022s sVar = (C142022s) obj;
        if (sVar.mo116974a()) {
            return sVar;
        }
        return new C142022s(sVar.f385344a, sVar.f385345b + 1);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
