package p5462h.p5463a.p5464a;

import java.util.Collection;
import java.util.Iterator;
import p5462h.p5463a.C69525i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69641b;

/* renamed from: h.a.a.n */
/* compiled from: PG */
public final class C69480n extends C69525i implements Collection, C69641b {

    /* renamed from: a */
    private final C69477k f185909a;

    public C69480n(C69477k kVar) {
        this.f185909a = kVar;
    }

    /* renamed from: a */
    public final int mo61143a() {
        return this.f185909a.f185899e;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f185909a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f185909a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f185909a.isEmpty();
    }

    public final Iterator iterator() {
        return new C69476j(this.f185909a);
    }

    public final boolean remove(Object obj) {
        C69477k kVar = this.f185909a;
        kVar.mo61107e();
        int c = kVar.mo61102c(obj);
        if (c < 0) {
            return false;
        }
        kVar.mo61110f(c);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185909a.mo61107e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185909a.mo61107e();
        return super.retainAll(collection);
    }
}
