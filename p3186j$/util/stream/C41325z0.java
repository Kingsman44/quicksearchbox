package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.z0 */
final class C41325z0 extends C41289q0 {
    C41325z0(C41277n0 n0Var, C41277n0 n0Var2) {
        super(n0Var, n0Var2);
    }

    public final void forEach(Consumer consumer) {
        this.f108004a.forEach(consumer);
        this.f108005b.forEach(consumer);
    }

    /* renamed from: i */
    public final void mo43650i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        C41277n0 n0Var = this.f108004a;
        n0Var.mo43650i(objArr, i);
        this.f108005b.mo43650i(objArr, i + ((int) n0Var.count()));
    }

    /* renamed from: m */
    public final Object[] mo43652m(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            mo43650i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: n */
    public final C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f108004a.count();
        if (j >= count) {
            return this.f108005b.mo43653n(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.f108004a.mo43653n(j, j2, intFunction);
        }
        IntFunction intFunction2 = intFunction;
        return C41241e0.m72074F(C41263j2.REFERENCE, this.f108004a.mo43653n(j, count, intFunction2), this.f108005b.mo43653n(0, j2 - count, intFunction2));
    }

    public final Spliterator spliterator() {
        return new C41190Q0(this);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("ConcNode[%s.%s]", new Object[]{this.f108004a, this.f108005b});
        }
        return String.format("ConcNode[size=%d]", new Object[]{Long.valueOf(count())});
    }
}
