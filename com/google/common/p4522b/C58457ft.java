package com.google.common.p4522b;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.common.b.ft */
/* compiled from: PG */
abstract class C58457ft extends AbstractSet {

    /* renamed from: b */
    final C58458fu f156070b;

    public C58457ft(C58458fu fuVar) {
        this.f156070b = fuVar;
    }

    /* renamed from: a */
    public abstract Object mo55310a(int i);

    public final void clear() {
        this.f156070b.clear();
    }

    public final Iterator iterator() {
        return new C58456fs(this);
    }

    public final int size() {
        return this.f156070b.f156073c;
    }
}
