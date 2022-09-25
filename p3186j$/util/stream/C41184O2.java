package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.O2 */
abstract class C41184O2 implements Spliterator {

    /* renamed from: a */
    int f107779a;

    C41184O2() {
    }

    public final int characteristics() {
        return 17488;
    }

    public final long estimateSize() {
        return (long) ((-this.f107779a) - 1);
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

    public final Spliterator trySplit() {
        return null;
    }
}
