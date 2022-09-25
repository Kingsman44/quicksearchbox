package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.T */
final class C41051T extends C41333y implements C41038F {
    C41051T() {
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72295c(this, consumer);
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

    /* renamed from: i */
    public final boolean mo43447i(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return false;
    }

    /* renamed from: l */
    public final void mo43448l(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72298h(this, consumer);
    }
}
