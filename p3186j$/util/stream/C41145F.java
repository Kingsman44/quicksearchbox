package p3186j$.util.stream;

import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.F */
final class C41145F extends C41161J implements C41159I1 {

    /* renamed from: b */
    final DoubleConsumer f107726b;

    C41145F(DoubleConsumer doubleConsumer) {
        super(true);
        this.f107726b = doubleConsumer;
    }

    public final void accept(double d) {
        this.f107726b.accept(d);
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
