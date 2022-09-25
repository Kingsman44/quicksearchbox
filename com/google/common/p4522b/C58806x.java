package com.google.common.p4522b;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.x */
/* compiled from: PG */
class C58806x implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f156593a;

    /* renamed from: b */
    final Collection f156594b;

    /* renamed from: c */
    final /* synthetic */ C58807y f156595c;

    public C58806x(C58807y yVar) {
        Iterator it;
        this.f156595c = yVar;
        this.f156594b = yVar.f156597b;
        Collection collection = yVar.f156597b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f156593a = it;
    }

    public C58806x(C58807y yVar, Iterator it) {
        this.f156595c = yVar;
        this.f156594b = yVar.f156597b;
        this.f156593a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56045a() {
        this.f156595c.mo56049b();
        if (this.f156595c.f156597b != this.f156594b) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        mo56045a();
        return this.f156593a.hasNext();
    }

    public final Object next() {
        mo56045a();
        return this.f156593a.next();
    }

    public final void remove() {
        this.f156593a.remove();
        C58307ae.m89286z(this.f156595c.f156600e);
        this.f156595c.mo56050c();
    }
}
