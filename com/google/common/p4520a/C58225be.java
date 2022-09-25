package com.google.common.p4520a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.common.a.be */
/* compiled from: PG */
class C58225be extends WeakReference implements C58219az {

    /* renamed from: a */
    final C58241bu f155717a;

    public C58225be(ReferenceQueue referenceQueue, Object obj, C58241bu buVar) {
        super(obj, referenceQueue);
        this.f155717a = buVar;
    }

    /* renamed from: a */
    public int mo54700a() {
        return 1;
    }

    /* renamed from: b */
    public C58219az mo54701b(ReferenceQueue referenceQueue, Object obj, C58241bu buVar) {
        return new C58225be(referenceQueue, obj, buVar);
    }

    /* renamed from: c */
    public final C58241bu mo54702c() {
        return this.f155717a;
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
