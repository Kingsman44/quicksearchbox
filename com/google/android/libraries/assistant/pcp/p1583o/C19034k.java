package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.o.k */
/* compiled from: PG */
public final /* synthetic */ class C19034k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C19034k f53420a = new C19034k();

    private /* synthetic */ C19034k() {
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
