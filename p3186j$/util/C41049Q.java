package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.Q */
final class C41049Q implements Spliterator {

    /* renamed from: a */
    private final Object[] f107526a;

    /* renamed from: b */
    private int f107527b;

    /* renamed from: c */
    private final int f107528c;

    /* renamed from: d */
    private final int f107529d;

    public C41049Q(Object[] objArr, int i, int i2, int i3) {
        this.f107526a = objArr;
        this.f107527b = i;
        this.f107528c = i2;
        this.f107529d = i3 | 64 | 16384;
    }

    public final int characteristics() {
        return this.f107529d;
    }

    public final long estimateSize() {
        return (long) (this.f107528c - this.f107527b);
    }

    public final void forEachRemaining(Consumer consumer) {
        int i;
        if (consumer != null) {
            Object[] objArr = this.f107526a;
            int length = objArr.length;
            int i2 = this.f107528c;
            if (length >= i2 && (i = this.f107527b) >= 0) {
                this.f107527b = i2;
                if (i < i2) {
                    do {
                        consumer.accept(objArr[i]);
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

    public final boolean tryAdvance(Consumer consumer) {
        if (consumer != null) {
            int i = this.f107527b;
            if (i < 0 || i >= this.f107528c) {
                return false;
            }
            this.f107527b = i + 1;
            consumer.accept(this.f107526a[i]);
            return true;
        }
        throw null;
    }

    public final Spliterator trySplit() {
        int i = this.f107527b;
        int i2 = (this.f107528c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f107527b = i2;
        return new C41049Q(this.f107526a, i, i2, this.f107529d);
    }
}
