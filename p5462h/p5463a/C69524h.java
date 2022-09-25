package p5462h.p5463a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.h */
/* compiled from: PG */
public abstract class C69524h extends C69510b implements List, C69640a {
    protected C69524h() {
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C69664n.m101061g(collection, "other");
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object l : this) {
            if (!C69664n.m101066l(l, it.next())) {
            }
        }
        return true;
        return false;
    }

    public abstract Object get(int i);

    public final int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object l : this) {
            if (C69664n.m101066l(l, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Iterator iterator() {
        return new C69521e(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C69664n.m101066l(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new C69522f(this, 0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        return new C69523g(this, i, i2);
    }

    public final ListIterator listIterator(int i) {
        return new C69522f(this, i);
    }
}
