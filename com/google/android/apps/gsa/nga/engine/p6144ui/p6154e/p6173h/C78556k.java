package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.k */
/* compiled from: PG */
final class C78556k extends C78562q {

    /* renamed from: a */
    private final C78533ap f216309a;

    public C78556k(C78533ap apVar) {
        this.f216309a = apVar;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.EMPTY;
    }

    /* renamed from: c */
    public final C78533ap mo73474c() {
        return this.f216309a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.EMPTY != aqVar.mo73472a() || !this.f216309a.equals(aqVar.mo73474c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216309a.hashCode();
    }

    public final String toString() {
        String obj = this.f216309a.toString();
        return "SingleContent{empty=" + obj + "}";
    }
}
