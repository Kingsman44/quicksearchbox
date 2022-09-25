package com.google.common.p4543n.p4545b;

import p3186j$.util.Objects;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.common.n.b.ad */
/* compiled from: PG */
public class C59363ad extends C59364ae {

    /* renamed from: b */
    public final Stream f157565b;

    /* renamed from: c */
    public final Function f157566c;

    /* renamed from: d */
    public final Function f157567d;

    public C59363ad(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.f157565b = stream;
        function.getClass();
        this.f157566c = function;
        function2.getClass();
        this.f157567d = function2;
    }

    /* renamed from: b */
    public final C59364ae mo56891b(Function function) {
        return new C59363ad(this.f157565b, this.f157566c.andThen(function), this.f157567d);
    }

    /* renamed from: c */
    public final C59364ae mo56892c(Function function) {
        return new C59363ad(this.f157565b, this.f157566c, this.f157567d.andThen(function));
    }

    public final void close() {
        this.f157565b.close();
    }

    /* renamed from: e */
    public final Stream mo56895e(BiFunction biFunction) {
        return this.f157565b.map(mo56894d(biFunction));
    }

    /* renamed from: f */
    public final Object mo56896f(C59359a aVar) {
        Stream stream = this.f157565b;
        Function function = this.f157566c;
        Objects.requireNonNull(function);
        C59391y yVar = new C59391y(function);
        Function function2 = this.f157567d;
        Objects.requireNonNull(function2);
        return stream.collect(aVar.mo56890a(yVar, new C59391y(function2)));
    }

    /* renamed from: d */
    public final Function mo56894d(BiFunction biFunction) {
        biFunction.getClass();
        return new C59360aa(this, biFunction);
    }

    /* renamed from: g */
    public final void mo56897g(BiConsumer biConsumer) {
        biConsumer.getClass();
        this.f157565b.forEach(new C59362ac(this, biConsumer));
    }
}
