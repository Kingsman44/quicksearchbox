package com.google.android.apps.search.transcription.voiceime;

import p3186j$.util.function.LongUnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.voiceime.w */
/* compiled from: PG */
public final /* synthetic */ class C142043w implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C141972ak f385391a;

    public /* synthetic */ C142043w(C141972ak akVar) {
        this.f385391a = akVar;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator.CC.$default$andThen(this, longUnaryOperator);
    }

    public final long applyAsLong(long j) {
        return Math.max(j, this.f385391a.f385245j.mo26870b());
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator.CC.$default$compose(this, longUnaryOperator);
    }
}
