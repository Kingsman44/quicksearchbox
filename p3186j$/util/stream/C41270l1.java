package p3186j$.util.stream;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Collector;

/* renamed from: j$.util.stream.l1 */
final class C41270l1 extends C41241e0 {

    /* renamed from: h */
    final /* synthetic */ BinaryOperator f107968h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f107969i;

    /* renamed from: j */
    final /* synthetic */ Supplier f107970j;

    /* renamed from: k */
    final /* synthetic */ Collector f107971k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41270l1(C41263j2 j2Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(j2Var);
        this.f107968h = binaryOperator;
        this.f107969i = biConsumer;
        this.f107970j = supplier;
        this.f107971k = collector;
    }

    /* renamed from: W */
    public final C41310v1 mo43844W() {
        return new C41274m1(this.f107970j, this.f107969i, this.f107968h);
    }

    /* renamed from: b */
    public final int mo43759b() {
        if (this.f107971k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return C41259i2.f107934r;
        }
        return 0;
    }
}
