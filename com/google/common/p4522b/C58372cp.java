package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.cp */
/* compiled from: PG */
class C58372cp extends AbstractCollection {

    /* renamed from: a */
    final Collection f155948a;

    /* renamed from: b */
    final C58839bc f155949b;

    public C58372cp(Collection collection, C58839bc bcVar) {
        this.f155948a = collection;
        this.f155949b = bcVar;
    }

    public final boolean add(Object obj) {
        C58838bb.m90868c(this.f155949b.mo5941a(obj));
        return this.f155948a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object a : collection) {
            C58838bb.m90868c(this.f155949b.mo5941a(a));
        }
        return this.f155948a.addAll(collection);
    }

    public final void clear() {
        C58557jl.m90145z(this.f155948a, this.f155949b);
    }

    public final boolean contains(Object obj) {
        if (C58374cr.m89412d(this.f155948a, obj)) {
            return this.f155949b.mo5941a(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        return C58374cr.m89411c(this, collection);
    }

    public final boolean isEmpty() {
        return !C58557jl.m90138s(this.f155948a, this.f155949b);
    }

    public final Iterator iterator() {
        return C58570jy.m90152d(this.f155948a.iterator(), this.f155949b);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.f155948a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f155948a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f155949b.mo5941a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f155948a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f155949b.mo5941a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object a : this.f155948a) {
            if (this.f155949b.mo5941a(a)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
