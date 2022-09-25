package com.google.android.libraries.assistant.auto.tng.p1028l;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ab */
/* compiled from: PG */
public final /* synthetic */ class C13718ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13718ab f41831a = new C13718ab();

    private /* synthetic */ C13718ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Duration.ofNanos(((Long) obj).longValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
