package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41039G;
import p3186j$.util.C41333y;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.Q2 */
final class C41192Q2 implements C41039G {

    /* renamed from: a */
    private int f107789a;

    /* renamed from: b */
    private final int f107790b;

    /* renamed from: c */
    private int f107791c;

    private C41192Q2(int i, int i2, int i3) {
        this.f107789a = i;
        this.f107790b = i2;
        this.f107791c = i3;
    }

    C41192Q2(int i, int i2, boolean z) {
        this(i, i2, z ? 1 : 0);
    }

    public final int characteristics() {
        return 17749;
    }

    public final long estimateSize() {
        return (((long) this.f107790b) - ((long) this.f107789a)) + ((long) this.f107791c);
    }

    /* renamed from: f */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.f107789a;
        if (i < this.f107790b) {
            this.f107789a = i + 1;
        } else if (this.f107791c <= 0) {
            return false;
        } else {
            this.f107791c = 0;
        }
        intConsumer.accept(i);
        return true;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    /* renamed from: g */
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.f107789a;
        int i2 = this.f107791c;
        int i3 = this.f107790b;
        this.f107789a = i3;
        this.f107791c = 0;
        while (i < i3) {
            intConsumer.accept(i);
            i++;
        }
        if (i2 > 0) {
            intConsumer.accept(i);
        }
    }

    public final Comparator getComparator() {
        return null;
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
        int i;
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i2 = this.f107789a;
        if (estimateSize < 16777216) {
            i = 2;
        } else {
            i = 8;
        }
        int i3 = ((int) (estimateSize / ((long) i))) + i2;
        this.f107789a = i3;
        return new C41192Q2(i2, i3, 0);
    }
}
