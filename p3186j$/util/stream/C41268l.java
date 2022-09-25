package p3186j$.util.stream;

import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.l */
final class C41268l implements Consumer {

    /* renamed from: a */
    Object f107965a = null;

    /* renamed from: b */
    boolean f107966b = false;

    /* renamed from: c */
    final /* synthetic */ BinaryOperator f107967c;

    C41268l(BinaryOperator binaryOperator) {
        this.f107967c = binaryOperator;
    }

    public final void accept(Object obj) {
        if (this.f107966b) {
            this.f107965a = this.f107967c.apply(this.f107965a, obj);
            return;
        }
        this.f107965a = obj;
        this.f107966b = true;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
