package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.r */
/* compiled from: PG */
class C58761r extends C58656nc {

    /* renamed from: a */
    final /* synthetic */ C58307ae f156538a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58761r(C58307ae aeVar, Map map) {
        super(map);
        this.f156538a = aeVar;
    }

    public final void clear() {
        C58570jy.m90162n(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.f156385d.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f156385d.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f156385d.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C58734q(this, this.f156385d.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f156385d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f156538a.f155874b -= size;
        return size > 0;
    }
}
