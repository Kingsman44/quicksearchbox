package com.google.common.p4522b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.o */
/* compiled from: PG */
class C58680o extends C58661nh {

    /* renamed from: a */
    final transient Map f156406a;

    /* renamed from: b */
    final /* synthetic */ C58307ae f156407b;

    public C58680o(C58307ae aeVar, Map map) {
        this.f156407b = aeVar;
        this.f156406a = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map.Entry mo55747a(Map.Entry entry) {
        Object key = entry.getKey();
        return new C58472gh(key, this.f156407b.mo54905f(key, (Collection) entry.getValue()));
    }

    /* renamed from: b */
    public final Set mo55700b() {
        return new C58626m(this);
    }

    public final void clear() {
        Map map = this.f156406a;
        C58307ae aeVar = this.f156407b;
        if (map == aeVar.f155873a) {
            aeVar.mo54917u();
        } else {
            C58570jy.m90162n(new C58653n(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return C58662ni.m90357p(this.f156406a, obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f156406a.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C58662ni.m90348g(this.f156406a, obj);
        if (collection == null) {
            return null;
        }
        return this.f156407b.mo54905f(obj, collection);
    }

    public final int hashCode() {
        return this.f156406a.hashCode();
    }

    public Set keySet() {
        return this.f156407b.mo54951D();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f156406a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.f156407b.mo54900a();
        a.addAll(collection);
        this.f156407b.f155874b -= collection.size();
        collection.clear();
        return a;
    }

    public final int size() {
        return this.f156406a.size();
    }

    public final String toString() {
        return this.f156406a.toString();
    }
}
