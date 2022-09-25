package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.ku */
/* compiled from: PG */
final class C58593ku extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final List f156289a;

    /* renamed from: b */
    final C58817ah f156290b;

    public C58593ku(List list, C58817ah ahVar) {
        list.getClass();
        this.f156289a = list;
        ahVar.getClass();
        this.f156290b = ahVar;
    }

    public final void clear() {
        this.f156289a.clear();
    }

    public final Object get(int i) {
        return this.f156290b.apply(this.f156289a.get(i));
    }

    public final boolean isEmpty() {
        return this.f156289a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new C58592kt(this, this.f156289a.listIterator(i));
    }

    public final Object remove(int i) {
        return this.f156290b.apply(this.f156289a.remove(i));
    }

    public final int size() {
        return this.f156289a.size();
    }
}
