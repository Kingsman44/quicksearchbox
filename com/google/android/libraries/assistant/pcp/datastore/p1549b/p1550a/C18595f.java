package com.google.android.libraries.assistant.pcp.datastore.p1549b.p1550a;

import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C18595f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18595f f52619a = new C18595f();

    private /* synthetic */ C18595f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Optional) ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
