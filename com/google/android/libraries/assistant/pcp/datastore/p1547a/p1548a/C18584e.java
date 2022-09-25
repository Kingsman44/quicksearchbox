package com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a;

import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C18584e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18584e f52608a = new C18584e();

    private /* synthetic */ C18584e() {
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
