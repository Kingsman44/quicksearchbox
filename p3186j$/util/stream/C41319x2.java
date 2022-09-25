package p3186j$.util.stream;

import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.x2 */
public final /* synthetic */ class C41319x2 implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f108044a;

    public /* synthetic */ C41319x2(int i) {
        this.f108044a = i;
    }

    public final void accept(double d) {
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f108044a) {
            case 0:
                return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
            default:
                return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
        }
    }
}
