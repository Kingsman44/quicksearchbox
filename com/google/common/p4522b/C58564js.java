package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.js */
/* compiled from: PG */
final class C58564js implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ int f156226a;

    /* renamed from: b */
    final /* synthetic */ Iterator f156227b;

    /* renamed from: c */
    private int f156228c;

    public C58564js(int i, Iterator it) {
        this.f156226a = i;
        this.f156227b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156228c < this.f156226a && this.f156227b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f156228c++;
            return this.f156227b.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        this.f156227b.remove();
    }
}
