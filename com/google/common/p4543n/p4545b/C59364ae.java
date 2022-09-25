package com.google.common.p4543n.p4545b;

import com.google.common.p4522b.C58495hd;
import java.util.Comparator;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.common.n.b.ae */
/* compiled from: PG */
public abstract class C59364ae implements AutoCloseable {
    /* renamed from: l */
    public static C59364ae m92266l(Map map) {
        return m92267m(Collection.EL.stream(map.entrySet()));
    }

    /* renamed from: m */
    public static C59364ae m92267m(Stream stream) {
        return new C59389w(stream, C59378l.f157583a, C59379m.f157584a, stream);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.stream.Stream m92269p(java.lang.Iterable r2) {
        /*
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0009
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            return r2
        L_0x0009:
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            r0 = 0
            com.google.common.b.sm r2 = r2.listIterator(r0)
            com.google.common.n.b.x r1 = new com.google.common.n.b.x
            r1.<init>(r2)
            j$.util.stream.Stream r2 = p3186j$.util.stream.StreamSupport.stream(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4543n.p4545b.C59364ae.m92269p(java.lang.Iterable):j$.util.stream.Stream");
    }

    /* renamed from: a */
    public Stream mo56898a() {
        return mo56895e(C59385s.f157590a);
    }

    /* renamed from: b */
    public abstract C59364ae mo56891b(Function function);

    /* renamed from: c */
    public abstract C59364ae mo56892c(Function function);

    /* renamed from: e */
    public abstract Stream mo56895e(BiFunction biFunction);

    /* renamed from: f */
    public abstract Object mo56896f(C59359a aVar);

    /* renamed from: g */
    public abstract void mo56897g(BiConsumer biConsumer);

    /* renamed from: h */
    public final C58495hd mo56899h() {
        return (C58495hd) mo56896f(C59382p.f157587a);
    }

    /* renamed from: i */
    public final C59364ae mo56900i(BiPredicate biPredicate) {
        biPredicate.getClass();
        return m92267m(mo56898a().filter(new C59377k(biPredicate)));
    }

    /* renamed from: j */
    public final C59364ae mo56901j(Predicate predicate) {
        predicate.getClass();
        return mo56900i(new C59384r(predicate));
    }

    /* renamed from: k */
    public final C59364ae mo56902k(Predicate predicate) {
        predicate.getClass();
        return mo56900i(new C59387u(predicate));
    }

    /* renamed from: n */
    public final C59364ae mo56903n(Comparator comparator) {
        comparator.getClass();
        return m92267m(mo56898a().sorted(Comparator.CC.comparing(C59378l.f157583a, comparator)));
    }

    /* renamed from: o */
    public static Collector m92268o(Function function, Collector collector) {
        function.getClass();
        return Collectors.collectingAndThen(Collectors.groupingBy(function, C59383q.f157588a, collector), C59388v.f157593a);
    }
}
