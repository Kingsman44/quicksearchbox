package com.google.android.apps.search.transcription.voiceime;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.voiceime.p */
/* compiled from: PG */
public final /* synthetic */ class C142013p implements UnaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C142013p f385326a = new C142013p();

    private /* synthetic */ C142013p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C142022s sVar = (C142022s) obj;
        int i = sVar.f385345b;
        if (i == 0) {
            return sVar;
        }
        return new C142022s(sVar.f385344a, i - 1);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
