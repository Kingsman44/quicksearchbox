package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.X */
final class C41055X implements C41039G {

    /* renamed from: a */
    private final int[] f107544a;

    /* renamed from: b */
    private int f107545b;

    /* renamed from: c */
    private final int f107546c;

    /* renamed from: d */
    private final int f107547d;

    public C41055X(int[] iArr, int i, int i2, int i3) {
        this.f107544a = iArr;
        this.f107545b = i;
        this.f107546c = i2;
        this.f107547d = i3 | 64 | 16384;
    }

    public final int characteristics() {
        return this.f107547d;
    }

    public final long estimateSize() {
        return (long) (this.f107546c - this.f107545b);
    }

    /* renamed from: f */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (intConsumer != null) {
            int i = this.f107545b;
            if (i < 0 || i >= this.f107546c) {
                return false;
            }
            this.f107545b = i + 1;
            intConsumer.accept(this.f107544a[i]);
            return true;
        }
        throw null;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    /* renamed from: g */
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        if (intConsumer != null) {
            int[] iArr = this.f107544a;
            int length = iArr.length;
            int i2 = this.f107546c;
            if (length >= i2 && (i = this.f107545b) >= 0) {
                this.f107545b = i2;
                if (i < i2) {
                    do {
                        intConsumer.accept(iArr[i]);
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
        return C41333y.m72299j(this, consumer);
    }

    public final Spliterator trySplit() {
        int i = this.f107545b;
        int i2 = (this.f107546c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f107545b = i2;
        return new C41055X(this.f107544a, i, i2, this.f107547d);
    }
}
