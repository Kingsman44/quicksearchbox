package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.voiceime.p10680a.C141959b;
import p3186j$.util.function.LongUnaryOperator;

/* renamed from: com.google.android.apps.search.transcription.voiceime.ag */
/* compiled from: PG */
public final /* synthetic */ class C141968ag implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C141959b f385230a;

    public /* synthetic */ C141968ag(C141959b bVar) {
        this.f385230a = bVar;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator.CC.$default$andThen(this, longUnaryOperator);
    }

    public final long applyAsLong(long j) {
        return Math.max(j, this.f385230a.f385215b);
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return LongUnaryOperator.CC.$default$compose(this, longUnaryOperator);
    }
}
