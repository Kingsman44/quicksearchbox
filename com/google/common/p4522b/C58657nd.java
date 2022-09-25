package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.nd */
/* compiled from: PG */
public final class C58657nd extends C58655nb {

    /* renamed from: a */
    final Map f156386a;

    /* renamed from: b */
    final C58650mx f156387b;

    public C58657nd(Map map, C58650mx mxVar) {
        map.getClass();
        this.f156386a = map;
        mxVar.getClass();
        this.f156387b = mxVar;
    }

    /* renamed from: a */
    public final Iterator mo55718a() {
        Iterator it = this.f156386a.entrySet().iterator();
        C58650mx mxVar = this.f156387b;
        mxVar.getClass();
        return C58570jy.m90161m(it, new C58637mk(mxVar));
    }

    public final void clear() {
        this.f156386a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f156386a.containsKey(obj);
    }

    public final Object get(Object obj) {
        Object obj2 = this.f156386a.get(obj);
        if (obj2 != null || this.f156386a.containsKey(obj)) {
            return this.f156387b.mo27296a(obj, obj2);
        }
        return null;
    }

    public final Set keySet() {
        return this.f156386a.keySet();
    }

    public final Object remove(Object obj) {
        if (this.f156386a.containsKey(obj)) {
            return this.f156387b.mo27296a(obj, this.f156386a.remove(obj));
        }
        return null;
    }

    public final int size() {
        return this.f156386a.size();
    }

    public final Collection values() {
        return new C58660ng(this);
    }
}
