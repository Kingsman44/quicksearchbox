package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.nc */
/* compiled from: PG */
class C58656nc extends C58755qu {

    /* renamed from: d */
    final Map f156385d;

    public C58656nc(Map map) {
        map.getClass();
        this.f156385d = map;
    }

    public void clear() {
        this.f156385d.clear();
    }

    public final boolean contains(Object obj) {
        return this.f156385d.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f156385d.isEmpty();
    }

    public Iterator iterator() {
        return new C58638ml(this.f156385d.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f156385d.remove(obj);
        return true;
    }

    public final int size() {
        return this.f156385d.size();
    }
}
