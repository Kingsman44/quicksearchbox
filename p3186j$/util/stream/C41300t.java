package p3186j$.util.stream;

import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.t */
public final /* synthetic */ class C41300t implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ C41171L1 f108024a;

    public /* synthetic */ C41300t(C41171L1 l1) {
        this.f108024a = l1;
    }

    public final void accept(double d) {
        this.f108024a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }
}
