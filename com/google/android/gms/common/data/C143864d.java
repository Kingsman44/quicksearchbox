package com.google.android.gms.common.data;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.gms.common.data.d */
/* compiled from: PG */
public final class C143864d implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    protected final C143863c f389972a;

    /* renamed from: b */
    protected int f389973b = -1;

    public C143864d(C143863c cVar) {
        this.f389972a = cVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f389973b < this.f389972a.mo119324c() + -1;
    }

    public final Object next() {
        if (hasNext()) {
            C143863c cVar = this.f389972a;
            int i = this.f389973b + 1;
            this.f389973b = i;
            return cVar.mo119329d(i);
        }
        int i2 = this.f389973b;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
