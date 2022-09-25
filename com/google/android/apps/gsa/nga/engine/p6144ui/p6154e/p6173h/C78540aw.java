package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.aw */
/* compiled from: PG */
public abstract class C78540aw {

    /* renamed from: a */
    public static final C78540aw f216294a;

    static {
        C78533ap apVar = C78533ap.f216277a;
        C78530am d = m126175d();
        C78518aa aaVar = (C78518aa) d;
        aaVar.f216257a = C78563r.m126231b(apVar);
        aaVar.f216258b = C78554i.m126206a(apVar);
        aaVar.f216259c = C78567v.m126238a(apVar);
        f216294a = d.mo73434a();
    }

    /* renamed from: d */
    public static C78530am m126175d() {
        C78518aa aaVar = new C78518aa();
        aaVar.f216257a = C78563r.m126231b(C78533ap.f216277a);
        aaVar.f216258b = C78554i.m126206a(C78533ap.f216277a);
        aaVar.f216259c = C78567v.m126238a(C78533ap.f216277a);
        return aaVar;
    }

    /* renamed from: a */
    public abstract C78531an mo73435a();

    /* renamed from: b */
    public abstract C78534aq mo73436b();

    /* renamed from: c */
    public abstract C78538au mo73437c();

    /* renamed from: e */
    public final boolean mo73483e() {
        if (!mo73435a().mo73464a().equals(C78532ao.EMPTY)) {
            return true;
        }
        return mo73435a().mo73467d().mo73470c();
    }

    /* renamed from: f */
    public final boolean mo73484f() {
        if (!mo73436b().mo73472a().equals(C78535ar.EMPTY)) {
            return true;
        }
        return mo73436b().mo73474c().mo73470c();
    }

    /* renamed from: g */
    public final boolean mo73485g() {
        if (!mo73437c().mo73481b().equals(C78539av.EMPTY)) {
            return true;
        }
        return mo73437c().mo73480a().mo73470c();
    }
}
