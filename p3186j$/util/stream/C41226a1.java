package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.a1 */
final class C41226a1 extends C41247f2 implements C41277n0, C41257i0 {
    C41226a1() {
    }

    /* renamed from: a */
    public final C41277n0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final void accept(Object obj) {
        super.accept(obj);
    }

    public final C41277n0 build() {
        return this;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        clear();
        mo43851o(j);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
    }

    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    /* renamed from: i */
    public final void mo43650i(Object[] objArr, int i) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) objArr.length) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f107879b == 0) {
            System.arraycopy(this.f107901d, 0, objArr, i, this.f107878a);
        } else {
            for (int i2 = 0; i2 < this.f107879b; i2++) {
                Object[] objArr2 = this.f107902e[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.f107902e[i2].length;
            }
            int i3 = this.f107878a;
            if (i3 > 0) {
                System.arraycopy(this.f107901d, 0, objArr, i, i3);
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ int mo43651l() {
        return 0;
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
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72105w(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
