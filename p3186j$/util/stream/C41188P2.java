package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.P2 */
final class C41188P2 implements Spliterator {

    /* renamed from: a */
    protected final Spliterator f107784a;

    /* renamed from: b */
    protected final Spliterator f107785b;

    /* renamed from: c */
    boolean f107786c = true;

    /* renamed from: d */
    final boolean f107787d;

    C41188P2(Spliterator spliterator, Spliterator spliterator2) {
        this.f107784a = spliterator;
        this.f107785b = spliterator2;
        boolean z = true;
        this.f107787d = spliterator2.estimateSize() + spliterator.estimateSize() >= 0 ? false : z;
    }

    public final int characteristics() {
        boolean z = this.f107786c;
        Spliterator spliterator = this.f107785b;
        if (!z) {
            return spliterator.characteristics();
        }
        return this.f107784a.characteristics() & spliterator.characteristics() & (((this.f107787d ? 16448 : 0) | 5) ^ -1);
    }

    public final long estimateSize() {
        boolean z = this.f107786c;
        Spliterator spliterator = this.f107785b;
        if (!z) {
            return spliterator.estimateSize();
        }
        long estimateSize = spliterator.estimateSize() + this.f107784a.estimateSize();
        if (estimateSize >= 0) {
            return estimateSize;
        }
        return Long.MAX_VALUE;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f107786c) {
            this.f107784a.forEachRemaining(consumer);
        }
        this.f107785b.forEachRemaining(consumer);
    }

    public final Comparator getComparator() {
        if (!this.f107786c) {
            return this.f107785b.getComparator();
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
        if (this.f107786c) {
            boolean tryAdvance = this.f107784a.tryAdvance(consumer);
            if (tryAdvance) {
                return tryAdvance;
            }
            this.f107786c = false;
        }
        return this.f107785b.tryAdvance(consumer);
    }

    public final Spliterator trySplit() {
        Spliterator trySplit = this.f107786c ? this.f107784a : this.f107785b.trySplit();
        this.f107786c = false;
        return trySplit;
    }
}
