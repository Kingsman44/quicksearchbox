package p5462h.p5463a;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.as */
/* compiled from: PG */
public abstract class C69502as implements Iterator, p3186j$.util.Iterator, C69640a {
    /* renamed from: a */
    public abstract int mo5128a();

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo5128a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
