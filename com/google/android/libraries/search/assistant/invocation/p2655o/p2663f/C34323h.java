package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import java.util.Set;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;
import p5462h.C69685i;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.h */
/* compiled from: PG */
final class C34323h implements UnaryOperator {

    /* renamed from: a */
    final /* synthetic */ C69685i f91266a;

    public C34323h(C69685i iVar) {
        this.f91266a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Set set = (Set) obj;
        C69664n.m101060f(set, "it");
        return C69514bd.m100892f(set, this.f91266a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
