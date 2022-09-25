package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.i */
/* compiled from: PG */
public final /* synthetic */ class C15483i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C15483i f46430a = new C15483i();

    private /* synthetic */ C15483i() {
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
