package p5462h.p5482l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.ac */
/* compiled from: PG */
public final class C69718ac implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69719ad f186077a;

    /* renamed from: b */
    private final Iterator f186078b;

    /* renamed from: c */
    private int f186079c = -1;

    /* renamed from: d */
    private Object f186080d;

    public C69718ac(C69719ad adVar) {
        this.f186077a = adVar;
        this.f186078b = adVar.f186081a.mo5191a();
    }

    /* renamed from: a */
    private final void m101148a() {
        if (this.f186078b.hasNext()) {
            Object next = this.f186078b.next();
            if (((Boolean) this.f186077a.f186082b.mo5761a(next)).booleanValue()) {
                this.f186079c = 1;
                this.f186080d = next;
                return;
            }
        }
        this.f186079c = 0;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f186079c == -1) {
            m101148a();
        }
        return this.f186079c == 1;
    }

    public final Object next() {
        if (this.f186079c == -1) {
            m101148a();
        }
        if (this.f186079c != 0) {
            Object obj = this.f186080d;
            this.f186080d = null;
            this.f186079c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
