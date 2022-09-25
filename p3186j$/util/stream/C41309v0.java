package p3186j$.util.stream;

import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.v0 */
final class C41309v0 extends C41321y0 implements C41261j0 {
    C41309v0(C41261j0 j0Var, C41261j0 j0Var2) {
        super(j0Var, j0Var2);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43650i(Double[] dArr, int i) {
        C41241e0.m72096n(this, dArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72099q(this, consumer);
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72102t(this, j, j2);
    }

    public final Object newArray(int i) {
        return new double[i];
    }

    public final C41041I spliterator() {
        return new C41174M0(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241141spliterator() {
        return new C41174M0(this);
    }
}
