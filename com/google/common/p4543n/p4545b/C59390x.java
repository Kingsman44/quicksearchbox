package com.google.common.p4543n.p4545b;

import java.util.Comparator;
import java.util.Iterator;
import p3186j$.util.Spliterator;
import p3186j$.util.Spliterators$AbstractSpliterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.n.b.x */
/* compiled from: PG */
final class C59390x extends Spliterators$AbstractSpliterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f157595a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59390x(Iterator it) {
        super(Long.MAX_VALUE, 0);
        this.f157595a = it;
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
        boolean hasNext = this.f157595a.hasNext();
        if (hasNext) {
            consumer.accept(this.f157595a.next());
        }
        return hasNext;
    }
}
