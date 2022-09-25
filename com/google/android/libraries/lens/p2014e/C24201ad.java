package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.e.ad */
/* compiled from: PG */
public abstract class C24201ad {
    /* renamed from: f */
    public static C24201ad m45035f(C24203af afVar, C24202ae aeVar, C24205ah ahVar, C24227s sVar) {
        C24217i iVar = new C24217i();
        iVar.f66240a = afVar;
        if (aeVar != null) {
            iVar.f66241b = aeVar;
            iVar.mo29677c(ahVar);
            iVar.mo29676b(sVar);
            return iVar.mo29675a();
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public abstract C24227s mo29678a();

    /* renamed from: b */
    public abstract C24202ae mo29679b();

    /* renamed from: c */
    public abstract C24203af mo29680c();

    /* renamed from: d */
    public abstract C24205ah mo29681d();

    /* renamed from: e */
    public abstract C58833ax mo29682e();

    /* renamed from: g */
    public final boolean mo29683g(C24201ad adVar) {
        return mo29679b().equals(adVar.mo29679b()) && mo29678a().equals(adVar.mo29678a());
    }
}
