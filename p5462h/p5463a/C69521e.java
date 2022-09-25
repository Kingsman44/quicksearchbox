package p5462h.p5463a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.e */
/* compiled from: PG */
class C69521e implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    public int f185937a;

    /* renamed from: b */
    final /* synthetic */ C69524h f185938b;

    public C69521e(C69524h hVar) {
        this.f185938b = hVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f185937a < this.f185938b.mo61249a();
    }

    public final Object next() {
        if (hasNext()) {
            C69524h hVar = this.f185938b;
            int i = this.f185937a;
            this.f185937a = i + 1;
            return hVar.get(i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
