package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.p */
/* compiled from: PG */
public final /* synthetic */ class C18693p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18693p f52743a = new C18693p();

    private /* synthetic */ C18693p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C18579g) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
