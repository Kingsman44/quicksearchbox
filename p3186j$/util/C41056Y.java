package p3186j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.Y */
class C41056Y implements Spliterator {

    /* renamed from: a */
    private final Collection f107548a;

    /* renamed from: b */
    private Iterator f107549b = null;

    /* renamed from: c */
    private final int f107550c;

    /* renamed from: d */
    private long f107551d;

    /* renamed from: e */
    private int f107552e;

    public C41056Y(int i, Collection collection) {
        this.f107548a = collection;
        this.f107550c = (i & 4096) == 0 ? i | 64 | 16384 : i;
    }

    public final int characteristics() {
        return this.f107550c;
    }

    public final long estimateSize() {
        if (this.f107549b != null) {
            return this.f107551d;
        }
        Collection collection = this.f107548a;
        this.f107549b = collection.iterator();
        long size = (long) collection.size();
        this.f107551d = size;
        return size;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer != null) {
            Iterator it = this.f107549b;
            if (it == null) {
                Collection collection = this.f107548a;
                Iterator it2 = collection.iterator();
                this.f107549b = it2;
                this.f107551d = (long) collection.size();
                it = it2;
            }
            Iterator.EL.forEachRemaining(it, consumer);
            return;
        }
        throw null;
    }

    public Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        if (consumer != null) {
            if (this.f107549b == null) {
                Collection collection = this.f107548a;
                this.f107549b = collection.iterator();
                this.f107551d = (long) collection.size();
            }
            if (!this.f107549b.hasNext()) {
                return false;
            }
            consumer.accept(this.f107549b.next());
            return true;
        }
        throw null;
    }

    public final Spliterator trySplit() {
        long j;
        java.util.Iterator it = this.f107549b;
        if (it == null) {
            Collection collection = this.f107548a;
            java.util.Iterator it2 = collection.iterator();
            this.f107549b = it2;
            j = (long) collection.size();
            this.f107551d = j;
            it = it2;
        } else {
            j = this.f107551d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f107552e + 1024;
        if (((long) i) > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i || !it.hasNext()) {
                this.f107552e = i2;
                long j2 = this.f107551d;
            }
            objArr[i2] = it.next();
            i2++;
            break;
        } while (!it.hasNext());
        this.f107552e = i2;
        long j22 = this.f107551d;
        if (j22 != Long.MAX_VALUE) {
            this.f107551d = j22 - ((long) i2);
        }
        return new C41049Q(objArr, 0, i2, this.f107550c);
    }
}
