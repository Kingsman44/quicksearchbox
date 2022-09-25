package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.C41059a0;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r0 */
class C41293r0 implements C41277n0 {

    /* renamed from: a */
    final Object[] f108011a;

    /* renamed from: b */
    int f108012b;

    C41293r0(long j, IntFunction intFunction) {
        if (j < 2147483639) {
            this.f108011a = (Object[]) intFunction.apply((int) j);
            this.f108012b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C41293r0(Object[] objArr) {
        this.f108011a = objArr;
        this.f108012b = objArr.length;
    }

    /* renamed from: a */
    public final C41277n0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f108012b;
    }

    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f108012b; i++) {
            consumer.accept(this.f108011a[i]);
        }
    }

    /* renamed from: i */
    public final void mo43650i(Object[] objArr, int i) {
        System.arraycopy(this.f108011a, 0, objArr, i, this.f108012b);
    }

    /* renamed from: l */
    public final /* synthetic */ int mo43651l() {
        return 0;
    }

    /* renamed from: m */
    public final Object[] mo43652m(IntFunction intFunction) {
        Object[] objArr = this.f108011a;
        if (objArr.length == this.f108012b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72105w(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return C41059a0.m71672m(this.f108011a, 0, this.f108012b);
    }

    public String toString() {
        Object[] objArr = this.f108011a;
        return String.format("ArrayNode[%d][%s]", new Object[]{Integer.valueOf(objArr.length - this.f108012b), Arrays.toString(objArr)});
    }
}
