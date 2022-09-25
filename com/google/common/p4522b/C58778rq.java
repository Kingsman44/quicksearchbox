package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.rq */
/* compiled from: PG */
public class C58778rq extends C58328az implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Map f156559a;

    /* renamed from: b */
    private transient Map f156560b;

    public C58778rq(Map map) {
        this.f156559a = map;
    }

    /* renamed from: a */
    public final Object mo55009a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.mo55009a(obj, obj2);
    }

    /* renamed from: e */
    public final Iterator mo55013e() {
        return new C58770ri(this);
    }

    /* renamed from: i */
    public final void mo55019i() {
        this.f156559a.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (java.util.Map) com.google.common.p4522b.C58662ni.m90348g(mo55202t(), r2);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55021k(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0018
            if (r3 == 0) goto L_0x0018
            java.util.Map r0 = r1.mo55202t()
            java.lang.Object r2 = com.google.common.p4522b.C58662ni.m90348g(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0018
            boolean r2 = com.google.common.p4522b.C58662ni.m90357p(r2, r3)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58778rq.mo55021k(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: l */
    public final boolean mo55022l(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map containsValue : mo55202t().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final int mo55196n() {
        int i = 0;
        for (Map size : this.f156559a.values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: p */
    public final boolean mo55948p(Object obj) {
        return obj != null && C58662ni.m90357p(this.f156559a, obj);
    }

    /* renamed from: t */
    public final Map mo55202t() {
        Map map = this.f156560b;
        if (map != null) {
            return map;
        }
        C58776ro roVar = new C58776ro(this);
        this.f156560b = roVar;
        return roVar;
    }

    /* renamed from: b */
    public final Object mo55010b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        Map map = (Map) this.f156559a.get(obj);
        if (map == null) {
            map = C58662ni.m90353l(0);
            this.f156559a.put(obj, map);
        }
        return map.put(obj2, obj3);
    }
}
