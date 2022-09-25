package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.Spliterators$AbstractSpliterator */
public abstract class Spliterators$AbstractSpliterator<T> implements Spliterator<T> {

    /* renamed from: a */
    private final int f107534a;

    /* renamed from: b */
    private long f107535b;

    /* renamed from: c */
    private int f107536c;

    protected Spliterators$AbstractSpliterator(long j, int i) {
        this.f107535b = j;
        this.f107534a = (i & 64) != 0 ? i | 16384 : i;
    }

    public final int characteristics() {
        return this.f107534a;
    }

    public final long estimateSize() {
        return this.f107535b;
    }

    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    public /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final Spliterator trySplit() {
        C41048P p = new C41048P();
        long j = this.f107535b;
        if (j <= 1 || !tryAdvance(p)) {
            return null;
        }
        int i = this.f107536c + 1024;
        if (((long) i) > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = p.f107525a;
            i2++;
            if (i2 >= i || !tryAdvance(p)) {
                this.f107536c = i2;
                long j2 = this.f107535b;
            }
            objArr[i2] = p.f107525a;
            i2++;
            break;
        } while (!tryAdvance(p));
        this.f107536c = i2;
        long j22 = this.f107535b;
        if (j22 != Long.MAX_VALUE) {
            this.f107535b = j22 - ((long) i2);
        }
        return new C41049Q(objArr, 0, i2, this.f107534a);
    }
}
