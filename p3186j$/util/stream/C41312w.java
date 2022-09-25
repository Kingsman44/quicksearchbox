package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.w */
final class C41312w extends C41320y {
    C41312w(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (!isParallel()) {
            C41320y.m72272r0(mo43824n0()).mo43448l(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final boolean mo43657k0() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        throw new UnsupportedOperationException();
    }
}
