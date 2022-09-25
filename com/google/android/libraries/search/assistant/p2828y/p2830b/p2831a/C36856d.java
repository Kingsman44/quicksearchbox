package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a;

import java.util.List;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C36856d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C36856d f96001a = new C36856d();

    private /* synthetic */ C36856d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        return Stream.CC.concat(Stream.CC.concat(C36858f.m65549a(list, 1), C36858f.m65549a(list, 2)), C36858f.m65549a(list, 3));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
