package com.google.android.libraries.appactions.serviceengine.p11038b;

import com.google.android.libraries.appactions.serviceengine.impl.C147908aq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.b.f */
/* compiled from: PG */
public final /* synthetic */ class C147887f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147887f f398934a = new C147887f();

    private /* synthetic */ C147887f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C147908aq aqVar = (C147908aq) obj;
        if (aqVar instanceof C147908aq) {
            return aqVar;
        }
        throw new IllegalArgumentException("Input accessor needs to be created by service engine.");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
