package p3186j$.util.stream;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.m1 */
final class C41274m1 extends C41314w1 implements C41310v1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f107978b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f107979c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f107980d;

    C41274m1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f107978b = supplier;
        this.f107979c = biConsumer;
        this.f107980d = binaryOperator;
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final void accept(Object obj) {
        this.f107979c.accept(this.f108042a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108042a = this.f107978b.get();
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f108042a = this.f107980d.apply(this.f108042a, ((C41274m1) v1Var).f108042a);
    }
}
