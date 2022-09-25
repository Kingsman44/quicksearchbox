package com.google.common.p4522b;

import com.google.common.base.C58839bc;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: com.google.common.b.qr */
/* compiled from: PG */
final class C58752qr extends C58754qt implements NavigableSet {
    public C58752qr(NavigableSet navigableSet, C58839bc bcVar) {
        super(navigableSet, bcVar);
    }

    public final Object ceiling(Object obj) {
        return C58557jl.m90144y(((NavigableSet) this.f155948a).tailSet(obj, true), this.f155949b);
    }

    public final Iterator descendingIterator() {
        return C58570jy.m90152d(((NavigableSet) this.f155948a).descendingIterator(), this.f155949b);
    }

    public final NavigableSet descendingSet() {
        return C58758qx.m90650h(((NavigableSet) this.f155948a).descendingSet(), this.f155949b);
    }

    public final Object floor(Object obj) {
        return C58570jy.m90168t(((NavigableSet) this.f155948a).headSet(obj, true).descendingIterator(), this.f155949b);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return C58758qx.m90650h(((NavigableSet) this.f155948a).headSet(obj, z), this.f155949b);
    }

    public final Object higher(Object obj) {
        return C58557jl.m90144y(((NavigableSet) this.f155948a).tailSet(obj, false), this.f155949b);
    }

    public final Object last() {
        return C58570jy.m90154f(((NavigableSet) this.f155948a).descendingIterator(), this.f155949b);
    }

    public final Object lower(Object obj) {
        return C58570jy.m90168t(((NavigableSet) this.f155948a).headSet(obj, false).descendingIterator(), this.f155949b);
    }

    public final Object pollFirst() {
        return C58557jl.m90134o((NavigableSet) this.f155948a, this.f155949b);
    }

    public final Object pollLast() {
        return C58557jl.m90134o(((NavigableSet) this.f155948a).descendingSet(), this.f155949b);
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return C58758qx.m90650h(((NavigableSet) this.f155948a).subSet(obj, z, obj2, z2), this.f155949b);
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return C58758qx.m90650h(((NavigableSet) this.f155948a).tailSet(obj, z), this.f155949b);
    }
}
