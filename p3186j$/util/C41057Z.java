package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.Z */
final class C41057Z implements C41040H {

    /* renamed from: a */
    private final long[] f107553a;

    /* renamed from: b */
    private int f107554b;

    /* renamed from: c */
    private final int f107555c;

    /* renamed from: d */
    private final int f107556d;

    public C41057Z(long[] jArr, int i, int i2, int i3) {
        this.f107553a = jArr;
        this.f107554b = i;
        this.f107555c = i2;
        this.f107556d = i3 | 64 | 16384;
    }

    /* renamed from: a */
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        if (longConsumer != null) {
            long[] jArr = this.f107553a;
            int length = jArr.length;
            int i2 = this.f107555c;
            if (length >= i2 && (i = this.f107554b) >= 0) {
                this.f107554b = i2;
                if (i < i2) {
                    do {
                        longConsumer.accept(jArr[i]);
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

    /* renamed from: b */
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (longConsumer != null) {
            int i = this.f107554b;
            if (i < 0 || i >= this.f107555c) {
                return false;
            }
            this.f107554b = i + 1;
            longConsumer.accept(this.f107553a[i]);
            return true;
        }
        throw null;
    }

    public final int characteristics() {
        return this.f107556d;
    }

    public final long estimateSize() {
        return (long) (this.f107555c - this.f107554b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72297e(this, consumer);
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

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72300k(this, consumer);
    }

    public final Spliterator trySplit() {
        int i = this.f107554b;
        int i2 = (this.f107555c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f107554b = i2;
        return new C41057Z(this.f107553a, i, i2, this.f107556d);
    }
}
