package p5462h.p5482l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.i */
/* compiled from: PG */
public final class C69729i implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69730j f186104a;

    /* renamed from: b */
    private Object f186105b;

    /* renamed from: c */
    private int f186106c = -2;

    public C69729i(C69730j jVar) {
        this.f186104a = jVar;
    }

    /* renamed from: a */
    private final void m101158a() {
        Object obj;
        if (this.f186106c == -2) {
            obj = ((C69741u) this.f186104a.f186107a).f186117a;
        } else {
            C69626l lVar = this.f186104a.f186108b;
            Object obj2 = this.f186105b;
            C69664n.m101058d(obj2);
            obj = lVar.mo5761a(obj2);
        }
        this.f186105b = obj;
        this.f186106c = obj == null ? 0 : 1;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f186106c < 0) {
            m101158a();
        }
        return this.f186106c == 1;
    }

    public final Object next() {
        if (this.f186106c < 0) {
            m101158a();
        }
        if (this.f186106c != 0) {
            Object obj = this.f186105b;
            C69664n.m101059e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f186106c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
