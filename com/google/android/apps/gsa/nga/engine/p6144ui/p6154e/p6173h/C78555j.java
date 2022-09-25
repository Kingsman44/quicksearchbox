package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.j */
/* compiled from: PG */
final class C78555j extends C78562q {

    /* renamed from: a */
    private final C80787fh f216308a;

    public C78555j(C80787fh fhVar) {
        this.f216308a = fhVar;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.CHIPS;
    }

    /* renamed from: b */
    public final C80787fh mo73473b() {
        return this.f216308a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.CHIPS != aqVar.mo73472a() || !this.f216308a.equals(aqVar.mo73473b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216308a.hashCode();
    }

    public final String toString() {
        String obj = this.f216308a.toString();
        return "SingleContent{chips=" + obj + "}";
    }
}
