package p3186j$.util;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.C */
public final /* synthetic */ class C41035C implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f107491a;

    public /* synthetic */ C41035C(Consumer consumer) {
        this.f107491a = consumer;
    }

    public final void accept(long j) {
        this.f107491a.accept(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }
}
