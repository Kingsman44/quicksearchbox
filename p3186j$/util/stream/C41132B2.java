package p3186j$.util.stream;

import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.B2 */
public final /* synthetic */ class C41132B2 implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f107715a;

    public /* synthetic */ C41132B2(int i) {
        this.f107715a = i;
    }

    public final void accept(long j) {
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f107715a) {
            case 0:
                return LongConsumer.CC.$default$andThen(this, longConsumer);
            default:
                return LongConsumer.CC.$default$andThen(this, longConsumer);
        }
    }
}
