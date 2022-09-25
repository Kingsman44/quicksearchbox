package com.google.common.p4522b;

import java.util.List;
import java.util.ListIterator;
import p3186j$.util.Iterator;

/* renamed from: com.google.common.b.z */
/* compiled from: PG */
final class C58808z extends C58806x implements ListIterator, Iterator {

    /* renamed from: d */
    final /* synthetic */ C58303aa f156601d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58808z(C58303aa aaVar) {
        super(aaVar);
        this.f156601d = aaVar;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f156601d.isEmpty();
        mo56045a();
        ((ListIterator) this.f156593a).add(obj);
        C58307ae.m89285y(this.f156601d.f155869f);
        if (isEmpty) {
            this.f156601d.mo56046a();
        }
    }

    public final boolean hasPrevious() {
        mo56045a();
        return ((ListIterator) this.f156593a).hasPrevious();
    }

    public final int nextIndex() {
        mo56045a();
        return ((ListIterator) this.f156593a).nextIndex();
    }

    public final Object previous() {
        mo56045a();
        return ((ListIterator) this.f156593a).previous();
    }

    public final int previousIndex() {
        mo56045a();
        return ((ListIterator) this.f156593a).previousIndex();
    }

    public final void set(Object obj) {
        mo56045a();
        ((ListIterator) this.f156593a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58808z(C58303aa aaVar, int i) {
        super(aaVar, ((List) aaVar.f156597b).listIterator(i));
        this.f156601d = aaVar;
    }
}
