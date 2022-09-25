package p3186j$.util;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.A */
public final /* synthetic */ class C41033A implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f107490a;

    public /* synthetic */ C41033A(Consumer consumer) {
        this.f107490a = consumer;
    }

    public final void accept(int i) {
        this.f107490a.accept(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
