package com.google.common.p4536h;

import java.util.Map;

/* renamed from: com.google.common.h.z */
/* compiled from: PG */
public final class C59269z {

    /* renamed from: a */
    public final Map f157382a;

    /* renamed from: b */
    public volatile transient Map.Entry f157383b;

    public C59269z(Map map) {
        this.f157382a = map;
    }

    /* renamed from: b */
    public final Object mo56738b(Object obj) {
        Map.Entry entry = this.f157383b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo56739c(Object obj, Object obj2) {
        this.f157383b = null;
        return this.f157382a.put(obj, obj2);
    }

    /* renamed from: a */
    public final Object mo56737a(Object obj) {
        obj.getClass();
        Object b = mo56738b(obj);
        return b == null ? this.f157382a.get(obj) : b;
    }
}
