package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.rl */
/* compiled from: PG */
final class C58773rl extends C58655nb {

    /* renamed from: a */
    final Object f156552a;

    /* renamed from: b */
    Map f156553b;

    /* renamed from: c */
    final /* synthetic */ C58778rq f156554c;

    public C58773rl(C58778rq rqVar, Object obj) {
        this.f156554c = rqVar;
        obj.getClass();
        this.f156552a = obj;
    }

    /* renamed from: a */
    public final Iterator mo55718a() {
        mo55933c();
        Map map = this.f156553b;
        if (map == null) {
            return C58568jw.f156237a;
        }
        return new C58771rj(this, map.entrySet().iterator());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55932b() {
        mo55933c();
        Map map = this.f156553b;
        if (map != null && map.isEmpty()) {
            this.f156554c.f156559a.remove(this.f156552a);
            this.f156553b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo55933c() {
        Map map = this.f156553b;
        if (map == null || (map.isEmpty() && this.f156554c.f156559a.containsKey(this.f156552a))) {
            this.f156553b = (Map) this.f156554c.f156559a.get(this.f156552a);
        }
    }

    public final void clear() {
        mo55933c();
        Map map = this.f156553b;
        if (map != null) {
            map.clear();
        }
        mo55932b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r1.f156553b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r1.mo55933c()
            if (r2 == 0) goto L_0x0011
            java.util.Map r0 = r1.f156553b
            if (r0 == 0) goto L_0x0011
            boolean r2 = com.google.common.p4522b.C58662ni.m90357p(r0, r2)
            if (r2 == 0) goto L_0x0011
            r2 = 1
            return r2
        L_0x0011:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58773rl.containsKey(java.lang.Object):boolean");
    }

    public final Object get(Object obj) {
        Map map;
        mo55933c();
        if (obj == null || (map = this.f156553b) == null) {
            return null;
        }
        return C58662ni.m90348g(map, obj);
    }

    public final Object remove(Object obj) {
        mo55933c();
        Map map = this.f156553b;
        if (map == null) {
            return null;
        }
        Object h = C58662ni.m90349h(map, obj);
        mo55932b();
        return h;
    }

    public final int size() {
        mo55933c();
        Map map = this.f156553b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        Map map = this.f156553b;
        if (map == null || map.isEmpty()) {
            return this.f156554c.mo55010b(this.f156552a, obj, obj2);
        }
        return this.f156553b.put(obj, obj2);
    }
}
