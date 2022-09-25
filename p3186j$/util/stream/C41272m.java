package p3186j$.util.stream;

import java.util.Set;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.m */
final class C41272m implements Collector {

    /* renamed from: a */
    private final Supplier f107973a;

    /* renamed from: b */
    private final BiConsumer f107974b;

    /* renamed from: c */
    private final BinaryOperator f107975c;

    /* renamed from: d */
    private final Function f107976d;

    /* renamed from: e */
    private final Set f107977e;

    C41272m(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f107973a = supplier;
        this.f107974b = biConsumer;
        this.f107975c = binaryOperator;
        this.f107976d = function;
        this.f107977e = set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C41272m(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new C41228b(1), set);
        Set set2 = Collectors.f107719a;
    }

    public final BiConsumer accumulator() {
        return this.f107974b;
    }

    public final Set characteristics() {
        return this.f107977e;
    }

    public final BinaryOperator combiner() {
        return this.f107975c;
    }

    public final Function finisher() {
        return this.f107976d;
    }

    public final Supplier supplier() {
        return this.f107973a;
    }
}
