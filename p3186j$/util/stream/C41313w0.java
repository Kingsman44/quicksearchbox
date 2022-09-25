package p3186j$.util.stream;

import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.w0 */
final class C41313w0 extends C41321y0 implements C41265k0 {
    C41313w0(C41265k0 k0Var, C41265k0 k0Var2) {
        super(k0Var, k0Var2);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43650i(Integer[] numArr, int i) {
        C41241e0.m72097o(this, numArr, i);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72100r(this, consumer);
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72103u(this, j, j2);
    }

    public final Object newArray(int i) {
        return new int[i];
    }

    public final C41041I spliterator() {
        return new C41178N0(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241142spliterator() {
        return new C41178N0(this);
    }
}
