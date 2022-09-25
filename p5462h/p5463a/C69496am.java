package p5462h.p5463a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.am */
/* compiled from: PG */
public final class C69496am implements List, Serializable, RandomAccess, C69640a {

    /* renamed from: a */
    public static final C69496am f185918a = new C69496am();
    private static final long serialVersionUID = -7390468764508069838L;

    private C69496am() {
    }

    private final Object readResolve() {
        return f185918a;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C69664n.m101061g((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C69664n.m101061g((Void) obj, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return C69495al.f185917a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C69664n.m101061g((Void) obj, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return C69495al.f185917a;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C69495al.f185917a;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return this;
            }
            i = 0;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }

    public final String toString() {
        return "[]";
    }
}
