package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.common.b.ab */
/* compiled from: PG */
final class C58304ab extends C58306ad implements NavigableSet {

    /* renamed from: f */
    final /* synthetic */ C58307ae f155870f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58304ab(C58307ae aeVar, Object obj, NavigableSet navigableSet, C58807y yVar) {
        super(aeVar, obj, navigableSet, yVar);
        this.f155870f = aeVar;
    }

    /* renamed from: e */
    private final NavigableSet m89282e(NavigableSet navigableSet) {
        C58307ae aeVar = this.f155870f;
        Object obj = this.f156596a;
        C58807y yVar = this.f156598c;
        if (yVar == null) {
            yVar = this;
        }
        return new C58304ab(aeVar, obj, navigableSet, yVar);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableSet) ((SortedSet) this.f156597b)).ceiling(obj);
    }

    /* renamed from: d */
    public final /* synthetic */ SortedSet mo54882d() {
        return (NavigableSet) ((SortedSet) this.f156597b);
    }

    public final Iterator descendingIterator() {
        return new C58806x(this, ((NavigableSet) ((SortedSet) this.f156597b)).descendingIterator());
    }

    public final NavigableSet descendingSet() {
        return m89282e(((NavigableSet) ((SortedSet) this.f156597b)).descendingSet());
    }

    public final Object floor(Object obj) {
        return ((NavigableSet) ((SortedSet) this.f156597b)).floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return m89282e(((NavigableSet) ((SortedSet) this.f156597b)).headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return ((NavigableSet) ((SortedSet) this.f156597b)).higher(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableSet) ((SortedSet) this.f156597b)).lower(obj);
    }

    public final Object pollFirst() {
        return C58570jy.m90157i(iterator());
    }

    public final Object pollLast() {
        return C58570jy.m90157i(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return m89282e(((NavigableSet) ((SortedSet) this.f156597b)).subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return m89282e(((NavigableSet) ((SortedSet) this.f156597b)).tailSet(obj, z));
    }
}
