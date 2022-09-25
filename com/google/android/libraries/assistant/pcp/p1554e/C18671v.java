package com.google.android.libraries.assistant.pcp.p1554e;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.e.v */
/* compiled from: PG */
public final /* synthetic */ class C18671v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18671v f52704a = new C18671v();

    private /* synthetic */ C18671v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Integer) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
