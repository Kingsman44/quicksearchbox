package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.C18947l;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58472gh;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18557d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18557d f52569a = new C18557d();

    private /* synthetic */ C18557d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new C58472gh((C53306j) entry.getKey(), (C18947l) ((Optional) entry.getValue()).get());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
