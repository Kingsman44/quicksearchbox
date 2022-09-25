package com.google.common.p4522b;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: com.google.common.b.lx */
/* compiled from: PG */
final class C58623lx extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ C58635mi f156338a;

    public C58623lx(C58635mi miVar) {
        this.f156338a = miVar;
    }

    public final void clear() {
        this.f156338a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f156338a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f156338a.isEmpty();
    }

    public final Iterator iterator() {
        return new C58622lw(this.f156338a);
    }

    public final int size() {
        return this.f156338a.size();
    }

    public final Object[] toArray() {
        return C58635mi.m90313d(this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58635mi.m90313d(this).toArray(objArr);
    }
}
