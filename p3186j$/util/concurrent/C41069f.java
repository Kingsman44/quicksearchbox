package p3186j$.util.concurrent;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.f */
final class C41069f extends C41079p implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f107596i;

    /* renamed from: j */
    long f107597j;

    C41069f(C41074k[] kVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, i3);
        this.f107596i = concurrentHashMap;
        this.f107597j = j;
    }

    public final int characteristics() {
        return 4353;
    }

    public final long estimateSize() {
        return this.f107597j;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer != null) {
            while (true) {
                C41074k c = mo43572c();
                if (c != null) {
                    consumer.accept(new C41073j(c.f107606b, c.f107607c, this.f107596i));
                } else {
                    return;
                }
            }
        } else {
            throw null;
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
        if (consumer != null) {
            C41074k c = mo43572c();
            if (c == null) {
                return false;
            }
            consumer.accept(new C41073j(c.f107606b, c.f107607c, this.f107596i));
            return true;
        }
        throw null;
    }

    public final Spliterator trySplit() {
        int i = this.f107618f;
        int i2 = this.f107619g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C41074k[] kVarArr = this.f107613a;
        int i4 = this.f107620h;
        this.f107619g = i3;
        long j = this.f107597j >>> 1;
        this.f107597j = j;
        return new C41069f(kVarArr, i4, i3, i2, j, this.f107596i);
    }
}
