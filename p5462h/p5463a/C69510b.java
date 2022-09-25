package p5462h.p5463a;

import java.util.Collection;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.b */
/* compiled from: PG */
public abstract class C69510b implements Collection, C69640a {
    protected C69510b() {
    }

    /* renamed from: a */
    public abstract int mo61249a();

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object l : this) {
            if (C69664n.m101066l(l, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return mo61249a() == 0;
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

    public final /* bridge */ int size() {
        return mo61249a();
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final String toString() {
        return C69540x.m100851ag(this, ", ", "[", "]", new C69466a(this), 24);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        Object[] b = C69658h.m101050b(this, objArr);
        C69664n.m101059e(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }
}
