package p5462h.p5463a.p5464a;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p5462h.p5463a.C69527k;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69643d;

/* renamed from: h.a.a.q */
/* compiled from: PG */
public final class C69483q extends C69527k implements Set, Serializable, C69643d {

    /* renamed from: a */
    public final C69477k f185913a;

    public C69483q() {
        this.f185913a = new C69477k(8);
    }

    /* renamed from: a */
    public final int mo61125a() {
        return this.f185913a.f185899e;
    }

    public final boolean add(Object obj) {
        return this.f185913a.mo61100a(obj) >= 0;
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185913a.mo61107e();
        return super.addAll(collection);
    }

    public final void clear() {
        this.f185913a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f185913a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f185913a.isEmpty();
    }

    public final Iterator iterator() {
        return new C69475i(this.f185913a);
    }

    public final boolean remove(Object obj) {
        return this.f185913a.mo61106d(obj) >= 0;
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185913a.mo61107e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185913a.mo61107e();
        return super.retainAll(collection);
    }

    private final Object writeReplace() {
        if (this.f185913a.f185900f) {
            return new C69481o(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public C69483q(int i) {
        this.f185913a = new C69477k(i);
    }
}
