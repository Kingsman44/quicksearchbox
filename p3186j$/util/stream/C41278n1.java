package p3186j$.util.stream;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.n1 */
final class C41278n1 extends C41314w1 implements C41310v1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f107983b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f107984c;

    /* renamed from: d */
    final /* synthetic */ BiConsumer f107985d;

    C41278n1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f107983b = supplier;
        this.f107984c = biConsumer;
        this.f107985d = biConsumer2;
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
        this.f107984c.accept(this.f108042a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108042a = this.f107983b.get();
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f107985d.accept(this.f108042a, ((C41278n1) v1Var).f108042a);
    }
}
