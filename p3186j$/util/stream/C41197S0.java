package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.S0 */
class C41197S0 implements C41269l0 {

    /* renamed from: a */
    final long[] f107805a;

    /* renamed from: b */
    int f107806b;

    C41197S0(long j) {
        if (j < 2147483639) {
            this.f107805a = new long[((int) j)];
            this.f107806b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C41197S0(long[] jArr) {
        this.f107805a = jArr;
        this.f107806b = jArr.length;
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo43645b() {
        long[] jArr = this.f107805a;
        int length = jArr.length;
        int i = this.f107806b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    public final long count() {
        return (long) this.f107806b;
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        int i2 = this.f107806b;
        System.arraycopy(this.f107805a, 0, (long[]) obj, i, i2);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C41241e0.m72101s(this, consumer);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.f107806b; i++) {
            longConsumer.accept(this.f107805a[i]);
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
        return C41241e0.m72104v(this, j, j2);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo43650i(Long[] lArr, int i) {
        C41241e0.m72098p(this, lArr, i);
    }

    public final C41041I spliterator() {
        return C41059a0.m71671l(this.f107805a, 0, this.f107806b);
    }

    public String toString() {
        long[] jArr = this.f107805a;
        return String.format("LongArrayNode[%d][%s]", new Object[]{Integer.valueOf(jArr.length - this.f107806b), Arrays.toString(jArr)});
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241138spliterator() {
        return C41059a0.m71671l(this.f107805a, 0, this.f107806b);
    }
}
