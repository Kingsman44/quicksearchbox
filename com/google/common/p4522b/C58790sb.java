package com.google.common.p4522b;

import java.util.ListIterator;
import p3186j$.util.Iterator;

/* renamed from: com.google.common.b.sb */
/* compiled from: PG */
abstract class C58790sb extends C58789sa implements ListIterator, Iterator {
    public C58790sb(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f156567b).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f156567b).nextIndex();
    }

    public final Object previous() {
        return mo54999a(((ListIterator) this.f156567b).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f156567b).previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
