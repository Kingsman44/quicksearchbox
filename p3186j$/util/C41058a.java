package p3186j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.a */
final class C41058a implements Spliterator {

    /* renamed from: a */
    private final List f107557a;

    /* renamed from: b */
    private int f107558b;

    /* renamed from: c */
    private int f107559c;

    private C41058a(C41058a aVar, int i, int i2) {
        this.f107557a = aVar.f107557a;
        this.f107558b = i;
        this.f107559c = i2;
    }

    C41058a(List list) {
        this.f107557a = list;
        this.f107558b = 0;
        this.f107559c = -1;
    }

    /* renamed from: c */
    private static Object m71658c(List list, int i) {
        try {
            return list.get(i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private int m71659d() {
        int i = this.f107559c;
        if (i >= 0) {
            return i;
        }
        int size = this.f107557a.size();
        this.f107559c = size;
        return size;
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        return (long) (m71659d() - this.f107558b);
    }

    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int d = m71659d();
        this.f107558b = d;
        for (int i = this.f107558b; i < d; i++) {
            consumer.accept(m71658c(this.f107557a, i));
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
            int d = m71659d();
            int i = this.f107558b;
            if (i >= d) {
                return false;
            }
            this.f107558b = i + 1;
            consumer.accept(m71658c(this.f107557a, i));
            return true;
        }
        throw null;
    }

    public final Spliterator trySplit() {
        int d = m71659d();
        int i = this.f107558b;
        int i2 = (d + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f107558b = i2;
        return new C41058a(this, i, i2);
    }
}
