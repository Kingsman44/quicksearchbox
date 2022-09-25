package com.google.protobuf.p4746a;

import java.util.ListIterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.g */
/* compiled from: PG */
public final class C62888g implements ListIterator, Iterator, C69640a {

    /* renamed from: a */
    private final /* synthetic */ ListIterator f169787a;

    public C62888g(ListIterator listIterator) {
        C69664n.m101061g(listIterator, "delegate");
        this.f169787a = listIterator;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f169787a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f169787a.hasPrevious();
    }

    public final Object next() {
        return this.f169787a.next();
    }

    public final int nextIndex() {
        return this.f169787a.nextIndex();
    }

    public final Object previous() {
        return this.f169787a.previous();
    }

    public final int previousIndex() {
        return this.f169787a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
