package p5462h.p5482l;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.ae */
/* compiled from: PG */
public final class C69720ae implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69721af f186083a;

    /* renamed from: b */
    private final Iterator f186084b;

    public C69720ae(C69721af afVar) {
        this.f186083a = afVar;
        this.f186084b = afVar.f186085a.mo5191a();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f186084b.hasNext();
    }

    public final Object next() {
        return this.f186083a.f186086b.mo5761a(this.f186084b.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
