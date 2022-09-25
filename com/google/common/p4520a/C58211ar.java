package com.google.common.p4520a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* renamed from: com.google.common.a.ar */
/* compiled from: PG */
class C58211ar extends SoftReference implements C58219az {

    /* renamed from: a */
    final C58241bu f155682a;

    public C58211ar(ReferenceQueue referenceQueue, Object obj, C58241bu buVar) {
        super(obj, referenceQueue);
        this.f155682a = buVar;
    }

    /* renamed from: a */
    public int mo54700a() {
        return 1;
    }

    /* renamed from: b */
    public C58219az mo54701b(ReferenceQueue referenceQueue, Object obj, C58241bu buVar) {
        return new C58211ar(referenceQueue, obj, buVar);
    }

    /* renamed from: c */
    public final C58241bu mo54702c() {
        return this.f155682a;
    }

    /* renamed from: d */
    public final Object mo54703d() {
        return get();
    }

    /* renamed from: e */
    public final void mo54704e(Object obj) {
    }

    /* renamed from: f */
    public final boolean mo54705f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo54706g() {
        return false;
    }
}
