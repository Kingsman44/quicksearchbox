package p3186j$.util.function;

import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.function.r */
public final /* synthetic */ class C41106r implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ LongConsumer f107675a;

    /* renamed from: b */
    public final /* synthetic */ LongConsumer f107676b;

    public /* synthetic */ C41106r(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.f107675a = longConsumer;
        this.f107676b = longConsumer2;
    }

    public final void accept(long j) {
        this.f107675a.accept(j);
        this.f107676b.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }
}
