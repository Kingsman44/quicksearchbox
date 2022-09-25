package com.google.common.p4543n.p4545b;

import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.common.n.b.j */
/* compiled from: PG */
public final class C59376j implements C59359a {

    /* renamed from: a */
    final /* synthetic */ Collector f157581a;

    public C59376j(Collector collector) {
        this.f157581a = collector;
    }

    /* renamed from: a */
    public final Collector mo56890a(Function function, Function function2) {
        return Collectors.mapping(new C59375i(function, function2), this.f157581a);
    }
}
