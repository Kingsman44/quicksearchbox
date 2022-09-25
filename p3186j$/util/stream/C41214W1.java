package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.W1 */
final class C41214W1 implements Spliterator {

    /* renamed from: a */
    int f107822a;

    /* renamed from: b */
    final int f107823b;

    /* renamed from: c */
    int f107824c;

    /* renamed from: d */
    final int f107825d;

    /* renamed from: e */
    Object[] f107826e;

    /* renamed from: f */
    final /* synthetic */ C41247f2 f107827f;

    C41214W1(C41247f2 f2Var, int i, int i2, int i3, int i4) {
        this.f107827f = f2Var;
        this.f107822a = i;
        this.f107823b = i2;
        this.f107824c = i3;
        this.f107825d = i4;
        Object[][] objArr = f2Var.f107902e;
        this.f107826e = objArr == null ? f2Var.f107901d : objArr[i];
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i = this.f107822a;
        int i2 = this.f107825d;
        int i3 = this.f107823b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f107824c);
        }
        long[] jArr = this.f107827f.f107880c;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f107824c);
    }

    public final void forEachRemaining(Consumer consumer) {
        C41247f2 f2Var;
        Objects.requireNonNull(consumer);
        int i = this.f107822a;
        int i2 = this.f107825d;
        int i3 = this.f107823b;
        if (i < i3 || (i == i3 && this.f107824c < i2)) {
            int i4 = this.f107824c;
            while (true) {
                f2Var = this.f107827f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = f2Var.f107902e[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f107822a == i3 ? this.f107826e : f2Var.f107902e[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f107822a = i3;
            this.f107824c = i2;
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.f107822a;
        int i2 = this.f107823b;
        if (i >= i2 && (i != i2 || this.f107824c >= this.f107825d)) {
            return false;
        }
        Object[] objArr = this.f107826e;
        int i3 = this.f107824c;
        this.f107824c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f107824c == this.f107826e.length) {
            this.f107824c = 0;
            int i4 = this.f107822a + 1;
            this.f107822a = i4;
            Object[][] objArr2 = this.f107827f.f107902e;
            if (objArr2 != null && i4 <= i2) {
                this.f107826e = objArr2[i4];
            }
        }
        return true;
    }

    public final Spliterator trySplit() {
        int i = this.f107822a;
        int i2 = this.f107823b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f107824c;
            C41247f2 f2Var = this.f107827f;
            C41214W1 w1 = new C41214W1(f2Var, i, i3, i4, f2Var.f107902e[i3].length);
            this.f107822a = i2;
            this.f107824c = 0;
            this.f107826e = f2Var.f107902e[i2];
            return w1;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f107824c;
            int i6 = (this.f107825d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            Spliterator m = C41059a0.m71672m(this.f107826e, i5, i5 + i6);
            this.f107824c += i6;
            return m;
        }
    }
}
