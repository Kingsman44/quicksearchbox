package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.A0 */
class C41126A0 implements C41261j0 {

    /* renamed from: a */
    final double[] f107711a;

    /* renamed from: b */
    int f107712b;

    C41126A0(long j) {
        if (j < 2147483639) {
            this.f107711a = new double[((int) j)];
            this.f107712b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C41126A0(double[] dArr) {
        this.f107711a = dArr;
        this.f107712b = dArr.length;
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo43645b() {
        double[] dArr = this.f107711a;
        int length = dArr.length;
        int i = this.f107712b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    public final long count() {
        return (long) this.f107712b;
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        int i2 = this.f107712b;
        System.arraycopy(this.f107711a, 0, (double[]) obj, i, i2);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72099q(this, consumer);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.f107712b; i++) {
            doubleConsumer.accept(this.f107711a[i]);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ int mo43651l() {
        return 0;
    }

    /* renamed from: m */
    public final /* synthetic */ Object[] mo43652m(IntFunction intFunction) {
        return C41241e0.m72095m(this, intFunction);
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72102t(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo43650i(Double[] dArr, int i) {
        C41241e0.m72096n(this, dArr, i);
    }

    public final C41041I spliterator() {
        return C41059a0.m71669j(this.f107711a, 0, this.f107712b);
    }

    public String toString() {
        double[] dArr = this.f107711a;
        return String.format("DoubleArrayNode[%d][%s]", new Object[]{Integer.valueOf(dArr.length - this.f107712b), Arrays.toString(dArr)});
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241129spliterator() {
        return C41059a0.m71669j(this.f107711a, 0, this.f107712b);
    }
}
