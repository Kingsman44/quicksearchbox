package com.google.apps.p3589d.p3591b;

/* renamed from: com.google.apps.d.b.k */
/* compiled from: PG */
public final class C45720k {

    /* renamed from: a */
    public final C45724o f120223a = C45724o.m81498d();

    /* renamed from: a */
    public final C45721l mo49824a() {
        return this.f120223a.mo49834c();
    }

    /* renamed from: b */
    public final void mo49825b(Object obj, Object obj2) {
        if (!this.f120223a.f120221a.containsKey(obj)) {
            this.f120223a.f120221a.put(obj, obj2);
            return;
        }
        String valueOf = String.valueOf(obj);
        throw new AssertionError("Map already contains \"" + valueOf + "\"");
    }

    /* renamed from: c */
    public final void mo49826c(Object obj, Object obj2, Object obj3) {
        mo49825b(obj, obj3);
        mo49825b(obj2, obj3);
    }

    /* renamed from: d */
    public final void mo49827d(Object obj, Object obj2, Object obj3, Object obj4) {
        mo49825b(obj, obj4);
        mo49825b(obj2, obj4);
        mo49825b(obj3, obj4);
    }
}
