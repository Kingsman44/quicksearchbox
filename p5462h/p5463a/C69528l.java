package p5462h.p5463a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69653c;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.l */
/* compiled from: PG */
final class C69528l implements Collection, C69640a {

    /* renamed from: a */
    private final Object[] f185943a;

    /* renamed from: b */
    private final boolean f185944b;

    public C69528l(Object[] objArr, boolean z) {
        C69664n.m101061g(objArr, "values");
        this.f185943a = objArr;
        this.f185944b = z;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return C69531o.m100940q(this.f185943a, obj);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object q : collection) {
            if (!C69531o.m100940q(this.f185943a, q)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f185943a.length == 0;
    }

    public final Iterator iterator() {
        return C69653c.m101040a(this.f185943a);
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

    public final int size() {
        return this.f185943a.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f185943a;
        boolean z = this.f185944b;
        C69664n.m101061g(objArr, "<this>");
        if (z && C69664n.m101066l(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C69664n.m101060f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }
}
