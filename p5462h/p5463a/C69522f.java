package p5462h.p5463a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.f */
/* compiled from: PG */
final class C69522f extends C69521e implements ListIterator, Iterator, C69640a {

    /* renamed from: c */
    final /* synthetic */ C69524h f185939c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69522f(C69524h hVar, int i) {
        super(hVar);
        this.f185939c = hVar;
        C69520d.m100899b(i, hVar.mo61249a());
        this.f185937a = i;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        return this.f185937a > 0;
    }

    public final int nextIndex() {
        return this.f185937a;
    }

    public final Object previous() {
        if (hasPrevious()) {
            C69524h hVar = this.f185939c;
            int i = this.f185937a - 1;
            this.f185937a = i;
            return hVar.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f185937a - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
