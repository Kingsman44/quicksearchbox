package p3186j$.util.function;

import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.function.g */
public final /* synthetic */ class C41095g implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ DoubleConsumer f107654a;

    /* renamed from: b */
    public final /* synthetic */ DoubleConsumer f107655b;

    public /* synthetic */ C41095g(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        this.f107654a = doubleConsumer;
        this.f107655b = doubleConsumer2;
    }

    public final void accept(double d) {
        this.f107654a.accept(d);
        this.f107655b.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }
}
