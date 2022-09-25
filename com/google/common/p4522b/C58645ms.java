package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.b.ms */
/* compiled from: PG */
abstract class C58645ms extends C58661nh {

    /* renamed from: a */
    final Map f156370a;

    /* renamed from: b */
    final C58839bc f156371b;

    public C58645ms(Map map, C58839bc bcVar) {
        this.f156370a = map;
        this.f156371b = bcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo55691c(Object obj, Object obj2) {
        return this.f156371b.mo5941a(new C58472gh(obj, obj2));
    }

    public boolean containsKey(Object obj) {
        return this.f156370a.containsKey(obj) && mo55691c(obj, this.f156370a.get(obj));
    }

    public final Object get(Object obj) {
        Object obj2 = this.f156370a.get(obj);
        if (obj2 == null || !mo55691c(obj, obj2)) {
            return null;
        }
        return obj2;
    }

    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* renamed from: lu */
    public final Collection mo55695lu() {
        return new C58652mz(this, this.f156370a, this.f156371b);
    }

    public final Object put(Object obj, Object obj2) {
        C58838bb.m90868c(mo55691c(obj, obj2));
        return this.f156370a.put(obj, obj2);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C58838bb.m90868c(mo55691c(entry.getKey(), entry.getValue()));
        }
        this.f156370a.putAll(map);
    }

    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.f156370a.remove(obj);
        }
        return null;
    }
}
