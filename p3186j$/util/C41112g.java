package p3186j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p3186j$.util.List;
import p3186j$.util.function.UnaryOperator;

/* renamed from: j$.util.g */
abstract class C41112g extends C41088f implements List, RandomAccess, List {
    C41112g() {
    }

    /* renamed from: b */
    static void m71733b(int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex = " + i);
        } else if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex = " + i2);
        } else if (i > i2) {
            throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IndexOutOfBoundsException mo43628a(int i) {
        int size = size();
        return new IndexOutOfBoundsException("Index: " + i + " Size: " + size);
    }

    public final void add(int i, Object obj) {
        int i2 = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        int i2 = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (!it.hasNext() || !get(i).equals(it.next())) {
                return false;
            }
        }
        return !it.hasNext();
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        Objects.requireNonNull(obj);
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return new C41116k(this, size());
    }

    public final int lastIndexOf(Object obj) {
        Objects.requireNonNull(obj);
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public ListIterator listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return new C41116k(this, size, i);
        }
        throw mo43628a(i);
    }

    public final Object remove(int i) {
        int i2 = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        int i2 = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final void sort(Comparator comparator) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    public java.util.List subList(int i, int i2) {
        m71733b(i, i2, size());
        return C41328t.m72294c(this, i, i2);
    }
}
