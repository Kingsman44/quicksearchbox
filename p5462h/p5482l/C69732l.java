package p5462h.p5482l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.l */
/* compiled from: PG */
final class C69732l extends C69733m implements Iterator, p3186j$.util.Iterator, C69577g, C69640a {

    /* renamed from: a */
    public C69577g f186109a;

    /* renamed from: b */
    private int f186110b;

    /* renamed from: c */
    private Object f186111c;

    /* renamed from: d */
    private Iterator f186112d;

    /* renamed from: a */
    public final Object mo61426a(Object obj, C69577g gVar) {
        this.f186111c = obj;
        this.f186110b = 3;
        this.f186109a = gVar;
        return C69554a.COROUTINE_SUSPENDED;
    }

    /* renamed from: b */
    public final Object mo61427b(Iterator it, C69577g gVar) {
        if (!it.hasNext()) {
            return C69788q.f186170a;
        }
        this.f186112d = it;
        this.f186110b = 2;
        this.f186109a = gVar;
        return C69554a.COROUTINE_SUSPENDED;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return C69586p.f185991a;
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        C69714l.m101134b(obj);
        this.f186110b = 4;
    }

    public final Object next() {
        int i = this.f186110b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f186110b = 1;
            java.util.Iterator it = this.f186112d;
            C69664n.m101058d(it);
            return it.next();
        } else if (i == 3) {
            this.f186110b = 0;
            Object obj = this.f186111c;
            this.f186111c = null;
            return obj;
        } else {
            throw m101161e();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.f186110b;
            if (i != 0) {
                if (i == 1) {
                    java.util.Iterator it = this.f186112d;
                    C69664n.m101058d(it);
                    if (it.hasNext()) {
                        this.f186110b = 2;
                        return true;
                    }
                    this.f186112d = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m101161e();
                }
            }
            this.f186110b = 5;
            C69577g gVar = this.f186109a;
            C69664n.m101058d(gVar);
            this.f186109a = null;
            gVar.mo61338mb(C69788q.f186170a);
        }
    }

    /* renamed from: e */
    private final Throwable m101161e() {
        int i = this.f186110b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f186110b);
    }
}
