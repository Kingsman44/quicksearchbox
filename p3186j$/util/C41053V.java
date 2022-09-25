package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.V */
final class C41053V extends C41333y implements C41040H {
    C41053V() {
    }

    /* renamed from: a */
    public final void mo43451a(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }

    /* renamed from: b */
    public final boolean mo43452b(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72297e(this, consumer);
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

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72300k(this, consumer);
    }
}
