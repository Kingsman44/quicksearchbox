package p5462h.p5463a.p5464a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.a.b */
/* compiled from: PG */
final class C69468b implements ListIterator, Iterator, C69640a {

    /* renamed from: a */
    private final C69469c f185881a;

    /* renamed from: b */
    private int f185882b;

    /* renamed from: c */
    private int f185883c = -1;

    public C69468b(C69469c cVar, int i) {
        this.f185881a = cVar;
        this.f185882b = i;
    }

    public final void add(Object obj) {
        C69469c cVar = this.f185881a;
        int i = this.f185882b;
        this.f185882b = i + 1;
        cVar.add(i, obj);
        this.f185883c = -1;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f185882b < this.f185881a.f185886c;
    }

    public final boolean hasPrevious() {
        return this.f185882b > 0;
    }

    public final Object next() {
        int i = this.f185882b;
        C69469c cVar = this.f185881a;
        if (i < cVar.f185886c) {
            this.f185882b = i + 1;
            this.f185883c = i;
            return cVar.f185884a[cVar.f185885b + i];
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f185882b;
    }

    public final Object previous() {
        int i = this.f185882b;
        if (i > 0) {
            int i2 = i - 1;
            this.f185882b = i2;
            this.f185883c = i2;
            C69469c cVar = this.f185881a;
            return cVar.f185884a[cVar.f185885b + i2];
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f185882b - 1;
    }

    public final void remove() {
        int i = this.f185883c;
        if (i != -1) {
            this.f185881a.mo61071b(i);
            this.f185882b = this.f185883c;
            this.f185883c = -1;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
    }

    public final void set(Object obj) {
        int i = this.f185883c;
        if (i != -1) {
            this.f185881a.set(i, obj);
            return;
        }
        throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
    }
}
