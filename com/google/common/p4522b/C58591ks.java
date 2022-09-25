package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.common.b.ks */
/* compiled from: PG */
class C58591ks extends AbstractList {

    /* renamed from: a */
    public final List f156287a;

    public C58591ks(List list) {
        list.getClass();
        this.f156287a = list;
    }

    /* renamed from: a */
    private final int m90207a(int i) {
        int size = size();
        C58838bb.m90861B(i, size, "index");
        return (size - 1) - i;
    }

    public final void add(int i, Object obj) {
        List list = this.f156287a;
        int size = size();
        C58838bb.m90864E(i, size);
        list.add(size - i, obj);
    }

    public final void clear() {
        this.f156287a.clear();
    }

    public final Object get(int i) {
        return this.f156287a.get(m90207a(i));
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        int size = size();
        C58838bb.m90864E(i, size);
        return new C58590kr(this, this.f156287a.listIterator(size - i));
    }

    public final Object remove(int i) {
        return this.f156287a.remove(m90207a(i));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final Object set(int i, Object obj) {
        return this.f156287a.set(m90207a(i), obj);
    }

    public final int size() {
        return this.f156287a.size();
    }

    public final List subList(int i, int i2) {
        C58838bb.m90882q(i, i2, size());
        List list = this.f156287a;
        int size = size();
        C58838bb.m90864E(i2, size);
        int size2 = size();
        C58838bb.m90864E(i, size2);
        return C58597ky.m90216g(list.subList(size - i2, size2 - i));
    }
}
