package com.google.common.p4520a;

import com.google.common.p4575r.C60757n;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: com.google.common.a.ba */
/* compiled from: PG */
final class C58221ba extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ C58234bn f155704a;

    public C58221ba(C58234bn bnVar) {
        this.f155704a = bnVar;
    }

    public final void clear() {
        this.f155704a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f155704a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f155704a.isEmpty();
    }

    public final Iterator iterator() {
        return new C58218ay(this.f155704a);
    }

    public final int size() {
        return C60757n.m92748i(this.f155704a.mo54789b());
    }

    public final Object[] toArray() {
        return C58234bn.m89128g(this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58234bn.m89128g(this).toArray(objArr);
    }
}
