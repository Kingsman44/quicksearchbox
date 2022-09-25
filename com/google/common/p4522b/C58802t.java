package com.google.common.p4522b;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.b.t */
/* compiled from: PG */
final class C58802t extends C58805w implements NavigableSet {

    /* renamed from: b */
    final /* synthetic */ C58307ae f156589b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58802t(C58307ae aeVar, NavigableMap navigableMap) {
        super(aeVar, navigableMap);
        this.f156589b = aeVar;
    }

    /* renamed from: a */
    public final /* synthetic */ SortedMap mo56024a() {
        return (NavigableMap) ((SortedMap) this.f156385d);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156385d)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new C58802t(this.f156589b, ((NavigableMap) ((SortedMap) this.f156385d)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156385d)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156385d)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156385d)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return C58570jy.m90157i(iterator());
    }

    public final Object pollLast() {
        return C58570jy.m90157i(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new C58802t(this.f156589b, ((NavigableMap) ((SortedMap) this.f156385d)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C58802t(this.f156589b, ((NavigableMap) ((SortedMap) this.f156385d)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C58802t(this.f156589b, ((NavigableMap) ((SortedMap) this.f156385d)).tailMap(obj, z));
    }
}
