package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.cq */
/* compiled from: PG */
public final class C58373cq extends AbstractCollection {

    /* renamed from: a */
    final Collection f155950a;

    /* renamed from: b */
    final C58817ah f155951b;

    public C58373cq(Collection collection, C58817ah ahVar) {
        collection.getClass();
        this.f155950a = collection;
        ahVar.getClass();
        this.f155951b = ahVar;
    }

    public final void clear() {
        this.f155950a.clear();
    }

    public final boolean isEmpty() {
        return this.f155950a.isEmpty();
    }

    public final Iterator iterator() {
        return C58570jy.m90161m(this.f155950a.iterator(), this.f155951b);
    }

    public final int size() {
        return this.f155950a.size();
    }
}
