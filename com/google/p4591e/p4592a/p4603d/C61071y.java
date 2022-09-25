package com.google.p4591e.p4592a.p4603d;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.e.a.d.y */
/* compiled from: PG */
final class C61071y implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final int f165347a;

    /* renamed from: b */
    int f165348b = 0;

    /* renamed from: c */
    final /* synthetic */ C61072z f165349c;

    public C61071y(C61072z zVar) {
        this.f165349c = zVar;
        this.f165347a = Array.getLength(zVar.f165350a);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f165348b < this.f165347a;
    }

    public final Object next() {
        if (hasNext()) {
            Object obj = this.f165349c.f165350a;
            int i = this.f165348b;
            this.f165348b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
