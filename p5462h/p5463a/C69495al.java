package p5462h.p5463a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.al */
/* compiled from: PG */
public final class C69495al implements ListIterator, Iterator, C69640a {

    /* renamed from: a */
    public static final C69495al f185917a = new C69495al();

    private C69495al() {
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return 0;
    }

    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
