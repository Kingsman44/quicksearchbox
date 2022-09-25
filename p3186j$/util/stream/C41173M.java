package p3186j$.util.stream;

import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.M */
public final /* synthetic */ class C41173M implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ C41171L1 f107763a;

    public /* synthetic */ C41173M(C41171L1 l1) {
        this.f107763a = l1;
    }

    public final void accept(int i) {
        this.f107763a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
