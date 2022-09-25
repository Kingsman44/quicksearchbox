package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80751dz;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.m */
/* compiled from: PG */
public final class C78558m extends C78562q {

    /* renamed from: a */
    private final C80751dz f216311a;

    public C78558m(C80751dz dzVar) {
        this.f216311a = dzVar;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.LEGAL_NOTICE;
    }

    /* renamed from: e */
    public final C80751dz mo73476e() {
        return this.f216311a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.LEGAL_NOTICE != aqVar.mo73472a() || !this.f216311a.equals(aqVar.mo73476e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216311a.hashCode();
    }

    public final String toString() {
        String obj = this.f216311a.toString();
        return "SingleContent{legalNotice=" + obj + "}";
    }
}
