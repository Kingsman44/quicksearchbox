package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.b.s */
/* compiled from: PG */
final class C58788s extends C58804v implements NavigableMap {

    /* renamed from: c */
    final /* synthetic */ C58307ae f156566c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58788s(C58307ae aeVar, NavigableMap navigableMap) {
        super(aeVar, navigableMap);
        this.f156566c = aeVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map.Entry mo55977c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection a = this.f156566c.mo54900a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        return new C58472gh(entry.getKey(), this.f156566c.mo54904e(a));
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f156406a)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo55747a(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156406a)).ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NavigableSet mo55987g() {
        return new C58802t(this.f156566c, (NavigableMap) ((SortedMap) this.f156406a));
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new C58788s(this.f156566c, ((NavigableMap) ((SortedMap) this.f156406a)).descendingMap());
    }

    /* renamed from: f */
    public final /* synthetic */ SortedMap mo55983f() {
        return (NavigableMap) ((SortedMap) this.f156406a);
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f156406a)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo55747a(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f156406a)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo55747a(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156406a)).floorKey(obj);
    }

    /* renamed from: h */
    public final /* synthetic */ SortedSet mo55988h() {
        return (NavigableSet) super.keySet();
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f156406a)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo55747a(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156406a)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f156406a)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo55747a(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f156406a)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo55747a(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f156406a)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo55977c(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo55977c(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new C58788s(this.f156566c, ((NavigableMap) ((SortedMap) this.f156406a)).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C58788s(this.f156566c, ((NavigableMap) ((SortedMap) this.f156406a)).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C58788s(this.f156566c, ((NavigableMap) ((SortedMap) this.f156406a)).tailMap(obj, z));
    }
}
