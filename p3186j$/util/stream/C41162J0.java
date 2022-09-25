package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.J0 */
class C41162J0 implements C41265k0 {

    /* renamed from: a */
    final int[] f107741a;

    /* renamed from: b */
    int f107742b;

    C41162J0(long j) {
        if (j < 2147483639) {
            this.f107741a = new int[((int) j)];
            this.f107742b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C41162J0(int[] iArr) {
        this.f107741a = iArr;
        this.f107742b = iArr.length;
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo43645b() {
        int[] iArr = this.f107741a;
        int length = iArr.length;
        int i = this.f107742b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    public final long count() {
        return (long) this.f107742b;
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        int i2 = this.f107742b;
        System.arraycopy(this.f107741a, 0, (int[]) obj, i, i2);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72100r(this, consumer);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f107742b; i++) {
            intConsumer.accept(this.f107741a[i]);
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
        return C41241e0.m72103u(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo43650i(Integer[] numArr, int i) {
        C41241e0.m72097o(this, numArr, i);
    }

    public final C41041I spliterator() {
        return C41059a0.m71670k(this.f107741a, 0, this.f107742b);
    }

    public String toString() {
        int[] iArr = this.f107741a;
        return String.format("IntArrayNode[%d][%s]", new Object[]{Integer.valueOf(iArr.length - this.f107742b), Arrays.toString(iArr)});
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241135spliterator() {
        return C41059a0.m71670k(this.f107741a, 0, this.f107742b);
    }
}
