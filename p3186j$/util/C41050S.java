package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.S */
final class C41050S implements C41038F {

    /* renamed from: a */
    private final double[] f107530a;

    /* renamed from: b */
    private int f107531b;

    /* renamed from: c */
    private final int f107532c;

    /* renamed from: d */
    private final int f107533d;

    public C41050S(double[] dArr, int i, int i2, int i3) {
        this.f107530a = dArr;
        this.f107531b = i;
        this.f107532c = i2;
        this.f107533d = i3 | 64 | 16384;
    }

    public final int characteristics() {
        return this.f107533d;
    }

    public final long estimateSize() {
        return (long) (this.f107532c - this.f107531b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72295c(this, consumer);
    }

    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* renamed from: i */
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        if (doubleConsumer != null) {
            int i = this.f107531b;
            if (i < 0 || i >= this.f107532c) {
                return false;
            }
            this.f107531b = i + 1;
            doubleConsumer.accept(this.f107530a[i]);
            return true;
        }
        throw null;
    }

    /* renamed from: l */
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i;
        if (doubleConsumer != null) {
            double[] dArr = this.f107530a;
            int length = dArr.length;
            int i2 = this.f107532c;
            if (length >= i2 && (i = this.f107531b) >= 0) {
                this.f107531b = i2;
                if (i < i2) {
                    do {
                        doubleConsumer.accept(dArr[i]);
                        i++;
                    } while (i < i2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72298h(this, consumer);
    }

    public final Spliterator trySplit() {
        int i = this.f107531b;
        int i2 = (this.f107532c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f107531b = i2;
        return new C41050S(this.f107530a, i, i2, this.f107533d);
    }
}
