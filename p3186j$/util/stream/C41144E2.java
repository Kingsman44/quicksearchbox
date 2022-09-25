package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.E2 */
final class C41144E2 extends C41148F2 implements Spliterator {
    C41144E2(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0, Math.min(spliterator.estimateSize(), j2));
    }

    private C41144E2(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Spliterator mo43659c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C41144E2(spliterator, j, j2, j3, j4);
    }

    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f107732e;
        long j2 = this.f107728a;
        if (j2 < j) {
            long j3 = this.f107731d;
            if (j3 < j) {
                if (j3 < j2 || this.f107730c.estimateSize() + j3 > this.f107729b) {
                    while (j2 > this.f107731d) {
                        this.f107730c.tryAdvance(new C41281o0(10));
                        this.f107731d++;
                    }
                    while (this.f107731d < this.f107732e) {
                        this.f107730c.tryAdvance(consumer);
                        this.f107731d++;
                    }
                    return;
                }
                this.f107730c.forEachRemaining(consumer);
                this.f107731d = this.f107732e;
            }
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
        long j;
        Objects.requireNonNull(consumer);
        long j2 = this.f107732e;
        long j3 = this.f107728a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f107731d;
            if (j3 <= j) {
                break;
            }
            this.f107730c.tryAdvance(new C41281o0(11));
            this.f107731d++;
        }
        if (j >= this.f107732e) {
            return false;
        }
        this.f107731d = j + 1;
        return this.f107730c.tryAdvance(consumer);
    }
}
