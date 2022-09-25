package p5462h.p5463a;

import java.util.Enumeration;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.ab */
/* compiled from: PG */
public final class C69485ab implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ Enumeration f185914a;

    public C69485ab(Enumeration enumeration) {
        this.f185914a = enumeration;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f185914a.hasMoreElements();
    }

    public final Object next() {
        return this.f185914a.nextElement();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
