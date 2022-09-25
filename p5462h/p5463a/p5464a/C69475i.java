package p5462h.p5463a.p5464a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.a.i */
/* compiled from: PG */
public final class C69475i extends C69474h implements Iterator, p3186j$.util.Iterator, C69640a {
    public C69475i(C69477k kVar) {
        super(kVar);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final Object next() {
        int i = this.f185893b;
        C69477k kVar = this.f185892a;
        if (i < kVar.f185898d) {
            this.f185893b = i + 1;
            this.f185894c = i;
            Object obj = kVar.f185895a[i];
            mo61097a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
