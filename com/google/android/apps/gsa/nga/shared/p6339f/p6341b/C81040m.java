package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.m */
/* compiled from: PG */
abstract class C81040m {
    /* renamed from: d */
    static C81039l m128987d() {
        C81028a aVar = new C81028a();
        aVar.mo74816b(false);
        return aVar;
    }

    /* renamed from: a */
    public abstract C58833ax mo74817a();

    /* renamed from: b */
    public abstract C58833ax mo74818b();

    /* renamed from: c */
    public abstract boolean mo74819c();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C81039l mo74826e() {
        C81028a aVar = new C81028a();
        aVar.mo74816b(mo74819c());
        C58833ax b = mo74818b();
        if (b != null) {
            aVar.f222087a = b;
            C58833ax a = mo74817a();
            if (a != null) {
                aVar.f222088b = a;
                return aVar;
            }
            throw new NullPointerException("Null sodaCallback");
        }
        throw new NullPointerException("Null sodaEventStore");
    }
}
