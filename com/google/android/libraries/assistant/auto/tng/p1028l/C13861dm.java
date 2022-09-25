package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.speech.recognizer.p5233a.C67438ag;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dm */
/* compiled from: PG */
public final /* synthetic */ class C13861dm implements Function {

    /* renamed from: a */
    public final /* synthetic */ C67438ag f42204a;

    public /* synthetic */ C13861dm(C67438ag agVar) {
        this.f42204a = agVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Duration) obj).minusMillis(this.f42204a.f183265h);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
