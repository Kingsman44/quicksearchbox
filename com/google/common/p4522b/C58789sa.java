package com.google.common.p4522b;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.sa */
/* compiled from: PG */
abstract class C58789sa implements Iterator, p3186j$.util.Iterator {

    /* renamed from: b */
    final Iterator f156567b;

    public C58789sa(Iterator it) {
        it.getClass();
        this.f156567b = it;
    }

    /* renamed from: a */
    public abstract Object mo54999a(Object obj);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156567b.hasNext();
    }

    public final Object next() {
        return mo54999a(this.f156567b.next());
    }

    public final void remove() {
        this.f156567b.remove();
    }
}
