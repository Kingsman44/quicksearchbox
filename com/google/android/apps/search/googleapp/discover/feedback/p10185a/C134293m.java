package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import com.google.common.p4522b.C58425eo;
import java.util.Collection;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69641b;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.m */
/* compiled from: PG */
final class C134293m implements Collection, C69641b {

    /* renamed from: a */
    private final C58425eo f365805a;

    public C134293m(C58425eo eoVar) {
        this.f365805a = eoVar;
    }

    public final boolean add(Object obj) {
        C69664n.m101061g(obj, "element");
        this.f365805a.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f365805a.addAll(collection);
    }

    public final void clear() {
        this.f365805a.clear();
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f365805a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f365805a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.f365805a.isEmpty();
    }

    public final Iterator iterator() {
        Iterator it = this.f365805a.iterator();
        C69664n.m101060f(it, "iterator(...)");
        return it;
    }

    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f365805a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f365805a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f365805a.retainAll(collection);
    }

    public final int size() {
        return this.f365805a.size();
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }
}
