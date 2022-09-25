package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.rr */
/* compiled from: PG */
class C58779rr extends C58780rs implements Collection {
    private static final long serialVersionUID = 0;

    public C58779rr(Collection collection, Object obj) {
        super(collection, obj);
    }

    /* renamed from: a */
    public Collection mo55949a() {
        return (Collection) this.f156561a;
    }

    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f156562b) {
            add = mo55949a().add(obj);
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f156562b) {
            addAll = mo55949a().addAll(collection);
        }
        return addAll;
    }

    public final void clear() {
        synchronized (this.f156562b) {
            mo55949a().clear();
        }
    }

    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f156562b) {
            contains = mo55949a().contains(obj);
        }
        return contains;
    }

    public final boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f156562b) {
            containsAll = mo55949a().containsAll(collection);
        }
        return containsAll;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f156562b) {
            isEmpty = mo55949a().isEmpty();
        }
        return isEmpty;
    }

    public final Iterator iterator() {
        return mo55949a().iterator();
    }

    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f156562b) {
            remove = mo55949a().remove(obj);
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f156562b) {
            removeAll = mo55949a().removeAll(collection);
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f156562b) {
            retainAll = mo55949a().retainAll(collection);
        }
        return retainAll;
    }

    public final int size() {
        int size;
        synchronized (this.f156562b) {
            size = mo55949a().size();
        }
        return size;
    }

    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f156562b) {
            array = mo55949a().toArray();
        }
        return array;
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f156562b) {
            array = mo55949a().toArray(objArr);
        }
        return array;
    }
}
