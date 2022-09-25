package p3186j$.util.stream;

import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41108t;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.h1 */
final class C41254h1 extends C41314w1 implements C41310v1, C41159I1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f107912b;

    /* renamed from: c */
    final /* synthetic */ C41108t f107913c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f107914d;

    C41254h1(Supplier supplier, C41108t tVar, BinaryOperator binaryOperator) {
        this.f107912b = supplier;
        this.f107913c = tVar;
        this.f107914d = binaryOperator;
    }

    public final void accept(double d) {
        Object obj = this.f108042a;
        switch (((C41228b) this.f107913c).f107847a) {
            case 19:
                double[] dArr = (double[]) obj;
                Collectors.m71778c(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.m71778c(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108042a = this.f107912b.get();
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        this.f108042a = this.f107914d.apply(this.f108042a, ((C41254h1) v1Var).f108042a);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }
}
