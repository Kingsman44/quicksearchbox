package p5462h.p5482l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.g */
/* compiled from: PG */
public final class C69727g implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69728h f186098a;

    /* renamed from: b */
    private final Iterator f186099b;

    /* renamed from: c */
    private Iterator f186100c;

    public C69727g(C69728h hVar) {
        this.f186098a = hVar;
        this.f186099b = hVar.f186101a.mo5191a();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return m101156a();
    }

    public final Object next() {
        if (m101156a()) {
            java.util.Iterator it = this.f186100c;
            C69664n.m101058d(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: a */
    private final boolean m101156a() {
        java.util.Iterator it = this.f186100c;
        if (it != null && !it.hasNext()) {
            this.f186100c = null;
        }
        while (true) {
            if (this.f186100c == null) {
                if (this.f186099b.hasNext()) {
                    Object next = this.f186099b.next();
                    C69728h hVar = this.f186098a;
                    java.util.Iterator it2 = (java.util.Iterator) hVar.f186103c.mo5761a(hVar.f186102b.mo5761a(next));
                    if (it2.hasNext()) {
                        this.f186100c = it2;
                        break;
                    }
                } else {
                    return false;
                }
            } else {
                break;
            }
        }
        return true;
    }
}
