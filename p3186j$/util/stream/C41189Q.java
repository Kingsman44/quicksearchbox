package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.Q */
final class C41189Q extends C41200T {
    C41189Q(C41039G g, int i) {
        super(g, i);
    }

    public final void forEach(IntConsumer intConsumer) {
        if (!isParallel()) {
            C41200T.m71941r0(mo43824n0()).mo43450g(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    public final void forEachOrdered(IntConsumer intConsumer) {
        if (!isParallel()) {
            C41200T.m71941r0(mo43824n0()).mo43450g(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
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
