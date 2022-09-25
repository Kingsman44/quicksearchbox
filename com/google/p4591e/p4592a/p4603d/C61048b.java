package com.google.p4591e.p4592a.p4603d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.e.a.d.b */
/* compiled from: PG */
final class C61048b implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C61050d f165284a;

    /* renamed from: b */
    private boolean f165285b;

    /* renamed from: c */
    private int f165286c;

    public C61048b(C61050d dVar) {
        this.f165284a = dVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f165286c < this.f165284a.f165288a;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f165286c;
        C61050d dVar = this.f165284a;
        if (i != dVar.f165288a) {
            this.f165286c = i + 1;
            this.f165285b = false;
            return new C61039a(dVar, i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        int i = this.f165286c - 1;
        if (this.f165285b || i < 0) {
            throw new IllegalArgumentException();
        }
        this.f165284a.mo57598c(i + i);
        this.f165286c--;
        this.f165285b = true;
    }
}
