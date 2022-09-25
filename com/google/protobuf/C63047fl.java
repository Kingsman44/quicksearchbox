package com.google.protobuf;

import java.util.ListIterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.fl */
/* compiled from: PG */
final class C63047fl implements ListIterator, Iterator {

    /* renamed from: a */
    final ListIterator f170162a;

    /* renamed from: b */
    final /* synthetic */ int f170163b;

    /* renamed from: c */
    final /* synthetic */ C63049fn f170164c;

    public C63047fl(C63049fn fnVar, int i) {
        this.f170164c = fnVar;
        this.f170163b = i;
        this.f170162a = fnVar.f170167a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f170162a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f170162a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f170162a.next();
    }

    public final int nextIndex() {
        return this.f170162a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f170162a.previous();
    }

    public final int previousIndex() {
        return this.f170162a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
