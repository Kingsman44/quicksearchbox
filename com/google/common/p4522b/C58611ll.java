package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.ll */
/* compiled from: PG */
final class C58611ll extends C58612lm {

    /* renamed from: a */
    final /* synthetic */ C58635mi f156322a;

    public C58611ll(C58635mi miVar) {
        this.f156322a = miVar;
    }

    public final void clear() {
        this.f156322a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f156322a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f156322a.isEmpty();
    }

    public final Iterator iterator() {
        return new C58610lk(this.f156322a);
    }

    public final boolean remove(Object obj) {
        return this.f156322a.remove(obj) != null;
    }

    public final int size() {
        return this.f156322a.size();
    }
}
