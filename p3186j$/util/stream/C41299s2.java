package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.s2 */
final class C41299s2 implements Spliterator {

    /* renamed from: a */
    long f108022a;

    /* renamed from: b */
    final Supplier f108023b;

    C41299s2(long j, Supplier supplier) {
        this.f108022a = j;
        this.f108023b = supplier;
    }

    public final /* bridge */ /* synthetic */ int characteristics() {
        return 1024;
    }

    public final long estimateSize() {
        return this.f108022a;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
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
        consumer.accept(this.f108023b.get());
        return true;
    }

    public final Spliterator trySplit() {
        long j = this.f108022a;
        if (j == 0) {
            return null;
        }
        long j2 = j >>> 1;
        this.f108022a = j2;
        return new C41299s2(j2, this.f108023b);
    }
}
