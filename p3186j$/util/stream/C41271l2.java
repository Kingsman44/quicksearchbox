package p3186j$.util.stream;

import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.l2 */
final class C41271l2 extends C41275m2 implements IntConsumer {

    /* renamed from: c */
    final int[] f107972c;

    C41271l2(int i) {
        this.f107972c = new int[i];
    }

    public final void accept(int i) {
        int i2 = this.f107981b;
        this.f107981b = i2 + 1;
        this.f107972c[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
