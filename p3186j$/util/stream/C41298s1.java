package p3186j$.util.stream;

import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.ObjIntConsumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.s1 */
final class C41298s1 extends C41314w1 implements C41310v1, C41163J1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f108019b;

    /* renamed from: c */
    final /* synthetic */ ObjIntConsumer f108020c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f108021d;

    C41298s1(Supplier supplier, ObjIntConsumer objIntConsumer, BinaryOperator binaryOperator) {
        this.f108019b = supplier;
        this.f108020c = objIntConsumer;
        this.f108021d = binaryOperator;
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(int i) {
        this.f108020c.accept(this.f108042a, i);
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108042a = this.f108019b.get();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f108042a = this.f108021d.apply(this.f108042a, ((C41298s1) v1Var).f108042a);
    }
}
