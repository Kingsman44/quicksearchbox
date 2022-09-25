package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.b.jw */
/* compiled from: PG */
enum C58568jw implements Iterator, p3186j$.util.Iterator {
    ;

    private C58568jw() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        C58838bb.m90884s(false, "no calls to next() since the last call to remove()");
    }
}
