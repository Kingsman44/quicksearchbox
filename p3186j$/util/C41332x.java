package p3186j$.util;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.x */
public final /* synthetic */ class C41332x implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f108059a;

    public /* synthetic */ C41332x(Consumer consumer) {
        this.f108059a = consumer;
    }

    public final void accept(double d) {
        this.f108059a.accept(Double.valueOf(d));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }
}
