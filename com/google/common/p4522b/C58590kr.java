package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.kr */
/* compiled from: PG */
final class C58590kr implements ListIterator, Iterator {

    /* renamed from: a */
    boolean f156284a;

    /* renamed from: b */
    final /* synthetic */ ListIterator f156285b;

    /* renamed from: c */
    final /* synthetic */ C58591ks f156286c;

    public C58590kr(C58591ks ksVar, ListIterator listIterator) {
        this.f156286c = ksVar;
        this.f156285b = listIterator;
    }

    public final void add(Object obj) {
        this.f156285b.add(obj);
        this.f156285b.previous();
        this.f156284a = false;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156285b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.f156285b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f156284a = true;
            return this.f156285b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        C58591ks ksVar = this.f156286c;
        int nextIndex = this.f156285b.nextIndex();
        int size = ksVar.size();
        C58838bb.m90864E(nextIndex, size);
        return size - nextIndex;
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.f156284a = true;
            return this.f156285b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        C58838bb.m90884s(this.f156284a, "no calls to next() since the last call to remove()");
        this.f156285b.remove();
        this.f156284a = false;
    }

    public final void set(Object obj) {
        C58838bb.m90883r(this.f156284a);
        this.f156285b.set(obj);
    }
}
