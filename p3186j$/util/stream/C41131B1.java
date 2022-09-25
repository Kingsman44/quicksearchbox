package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.B1 */
final class C41131B1 extends C41143E1 {
    C41131B1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            mo43824n0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            mo43824n0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
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
