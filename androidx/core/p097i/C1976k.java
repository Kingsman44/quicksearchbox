package androidx.core.p097i;

import android.util.SparseArray;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: androidx.core.i.k */
/* compiled from: PG */
public final class C1976k implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ SparseArray f5895a;

    /* renamed from: b */
    private int f5896b;

    public C1976k(SparseArray sparseArray) {
        this.f5895a = sparseArray;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f5896b < this.f5895a.size();
    }

    public final Object next() {
        SparseArray sparseArray = this.f5895a;
        int i = this.f5896b;
        this.f5896b = i + 1;
        return sparseArray.valueAt(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
