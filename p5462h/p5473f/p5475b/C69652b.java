package p5462h.p5473f.p5475b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.f.b.b */
/* compiled from: PG */
final class C69652b implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    private final Object[] f186029a;

    /* renamed from: b */
    private int f186030b;

    public C69652b(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        this.f186029a = objArr;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f186030b < this.f186029a.length;
    }

    public final Object next() {
        try {
            Object[] objArr = this.f186029a;
            int i = this.f186030b;
            this.f186030b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f186030b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
