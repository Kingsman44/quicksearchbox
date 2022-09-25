package p5462h.p5463a.p5464a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p5462h.p5463a.C69527k;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69643d;

/* renamed from: h.a.a.m */
/* compiled from: PG */
public final class C69479m extends C69527k implements Set, C69643d {

    /* renamed from: a */
    private final C69477k f185908a;

    public C69479m(C69477k kVar) {
        this.f185908a = kVar;
    }

    /* renamed from: a */
    public final int mo61125a() {
        return this.f185908a.f185899e;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f185908a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f185908a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f185908a.isEmpty();
    }

    public final Iterator iterator() {
        return new C69475i(this.f185908a);
    }

    public final boolean remove(Object obj) {
        return this.f185908a.mo61106d(obj) >= 0;
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185908a.mo61107e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185908a.mo61107e();
        return super.retainAll(collection);
    }
}
