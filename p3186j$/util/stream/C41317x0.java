package p3186j$.util.stream;

import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.x0 */
final class C41317x0 extends C41321y0 implements C41269l0 {
    C41317x0(C41269l0 l0Var, C41269l0 l0Var2) {
        super(l0Var, l0Var2);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43650i(Long[] lArr, int i) {
        C41241e0.m72098p(this, lArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72101s(this, consumer);
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72104v(this, j, j2);
    }

    public final Object newArray(int i) {
        return new long[i];
    }

    public final C41041I spliterator() {
        return new C41182O0(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241143spliterator() {
        return new C41182O0(this);
    }
}
