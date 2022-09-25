package p5462h.p5463a.p5464a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.a.l */
/* compiled from: PG */
public final class C69478l extends C69467a {

    /* renamed from: a */
    private final C69477k f185907a;

    public C69478l(C69477k kVar) {
        this.f185907a = kVar;
    }

    /* renamed from: a */
    public final int mo61125a() {
        return this.f185907a.f185899e;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        C69664n.m101061g((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo61056b(Map.Entry entry) {
        C69664n.m101061g(entry, "element");
        return this.f185907a.mo61113h(entry);
    }

    /* renamed from: c */
    public final boolean mo61057c(Map.Entry entry) {
        C69664n.m101061g(entry, "element");
        C69477k kVar = this.f185907a;
        C69664n.m101061g(entry, "entry");
        kVar.mo61107e();
        int b = kVar.mo61101b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = kVar.f185896b;
        C69664n.m101058d(objArr);
        if (!C69664n.m101066l(objArr[b], entry.getValue())) {
            return false;
        }
        kVar.mo61110f(b);
        return true;
    }

    public final void clear() {
        this.f185907a.clear();
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f185907a.mo61111g(collection);
    }

    public final boolean isEmpty() {
        return this.f185907a.isEmpty();
    }

    public final Iterator iterator() {
        return new C69472f(this.f185907a);
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185907a.mo61107e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        this.f185907a.mo61107e();
        return super.retainAll(collection);
    }
}
