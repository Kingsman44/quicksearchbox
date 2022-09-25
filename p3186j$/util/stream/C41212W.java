package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.W */
final class C41212W extends C41215X {
    C41212W(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    public final void forEachOrdered(LongConsumer longConsumer) {
        if (!isParallel()) {
            C41215X.m71977r0(mo43824n0()).mo43451a(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
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
