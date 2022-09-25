package p3186j$.util.stream;

import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.V */
public final /* synthetic */ class C41208V implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ C41171L1 f107816a;

    public /* synthetic */ C41208V(C41171L1 l1) {
        this.f107816a = l1;
    }

    public final void accept(long j) {
        this.f107816a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }
}
