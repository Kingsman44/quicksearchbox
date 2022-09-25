package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.l */
/* compiled from: PG */
public final class C78557l extends C78562q {

    /* renamed from: a */
    private final C78537at f216310a;

    public C78557l(C78537at atVar) {
        this.f216310a = atVar;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.GREETING;
    }

    /* renamed from: d */
    public final C78537at mo73475d() {
        return this.f216310a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.GREETING != aqVar.mo73472a() || !this.f216310a.equals(aqVar.mo73475d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216310a.hashCode();
    }

    public final String toString() {
        String obj = this.f216310a.toString();
        return "SingleContent{greeting=" + obj + "}";
    }
}
