package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.U */
final class C41052U extends C41333y implements C41039G {
    C41052U() {
    }

    /* renamed from: f */
    public final boolean mo43449f(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    /* renamed from: g */
    public final void mo43450g(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
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
        return C41333y.m72299j(this, consumer);
    }
}
