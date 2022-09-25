package p3186j$.util.stream;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.j1 */
final class C41262j1 extends C41314w1 implements C41310v1 {

    /* renamed from: b */
    final /* synthetic */ Object f107948b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f107949c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f107950d;

    C41262j1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f107948b = obj;
        this.f107949c = biFunction;
        this.f107950d = binaryOperator;
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
        this.f108042a = this.f107949c.apply(this.f108042a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108042a = this.f107948b;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f108042a = this.f107950d.apply(this.f108042a, ((C41262j1) v1Var).f108042a);
    }
}
