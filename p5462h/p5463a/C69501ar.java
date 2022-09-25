package p5462h.p5463a;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.ar */
/* compiled from: PG */
public final class C69501ar implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    private final Iterator f185924a;

    /* renamed from: b */
    private int f185925b;

    public C69501ar(Iterator it) {
        C69664n.m101061g(it, "iterator");
        this.f185924a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f185924a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f185925b;
        this.f185925b = i + 1;
        if (i < 0) {
            C69540x.m100952j();
        }
        return new C69499ap(i, this.f185924a.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
