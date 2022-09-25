package com.google.common.p4522b;

import com.google.common.base.C58839bc;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: com.google.common.b.qt */
/* compiled from: PG */
class C58754qt extends C58753qs implements SortedSet {
    public C58754qt(SortedSet sortedSet, C58839bc bcVar) {
        super(sortedSet, bcVar);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.f155948a).comparator();
    }

    public final Object first() {
        return C58570jy.m90154f(this.f155948a.iterator(), this.f155949b);
    }

    public final SortedSet headSet(Object obj) {
        return new C58754qt(((SortedSet) this.f155948a).headSet(obj), this.f155949b);
    }

    public Object last() {
        SortedSet sortedSet = (SortedSet) this.f155948a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f155949b.mo5941a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new C58754qt(((SortedSet) this.f155948a).subSet(obj, obj2), this.f155949b);
    }

    public final SortedSet tailSet(Object obj) {
        return new C58754qt(((SortedSet) this.f155948a).tailSet(obj), this.f155949b);
    }
}
