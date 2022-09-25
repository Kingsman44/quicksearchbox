package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.V0 */
final class C41209V0 extends C41222Z0 implements C41159I1 {

    /* renamed from: h */
    private final double[] f107817h;

    C41209V0(Spliterator spliterator, C41241e0 e0Var, double[] dArr) {
        super(dArr.length, spliterator, e0Var);
        this.f107817h = dArr;
    }

    C41209V0(C41209V0 v0, Spliterator spliterator, long j, long j2) {
        super(v0, spliterator, j, j2, v0.f107817h.length);
        this.f107817h = v0.f107817h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41222Z0 mo43799a(Spliterator spliterator, long j, long j2) {
        return new C41209V0(this, spliterator, j, j2);
    }

    public final void accept(double d) {
        int i = this.f107840f;
        if (i < this.f107841g) {
            this.f107840f = i + 1;
            this.f107817h[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f107840f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }
}
