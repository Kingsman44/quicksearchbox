package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.jn */
/* compiled from: PG */
final class C58559jn implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    Iterator f156217a = C58568jw.f156237a;

    /* renamed from: b */
    final /* synthetic */ Iterable f156218b;

    public C58559jn(Iterable iterable) {
        this.f156218b = iterable;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156217a.hasNext() || this.f156218b.iterator().hasNext();
    }

    public final Object next() {
        if (!this.f156217a.hasNext()) {
            java.util.Iterator it = this.f156218b.iterator();
            this.f156217a = it;
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        return this.f156217a.next();
    }

    public final void remove() {
        this.f156217a.remove();
    }
}
