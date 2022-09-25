package p3186j$.util.stream;

import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.D0 */
final class C41138D0 extends C41154H0 implements C41261j0 {
    C41138D0() {
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo43645b() {
        return C41241e0.f107887g;
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

    public final C41041I spliterator() {
        return C41059a0.m71661b();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241132spliterator() {
        return C41059a0.m71661b();
    }
}
