package com.google.common.p4543n.p4545b;

import p3186j$.util.Objects;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.n.b.h */
/* compiled from: PG */
public final class C59374h implements C59359a {

    /* renamed from: a */
    final /* synthetic */ BiFunction f157577a;

    /* renamed from: b */
    final /* synthetic */ C59359a f157578b;

    public C59374h(BiFunction biFunction, C59359a aVar) {
        this.f157577a = biFunction;
        this.f157578b = aVar;
    }

    /* renamed from: a */
    public final Collector mo56890a(Function function, Function function2) {
        C59372f fVar = new C59372f(this.f157577a, function, function2);
        C59359a aVar = this.f157578b;
        Objects.requireNonNull(function);
        C59373g gVar = new C59373g(function);
        Objects.requireNonNull(function2);
        return C59364ae.m92268o(fVar, aVar.mo56890a(gVar, new C59373g(function2)));
    }
}
