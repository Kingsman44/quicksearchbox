package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.p */
/* compiled from: PG */
public final class C78561p extends C78562q {

    /* renamed from: a */
    private final C80792fm f216314a;

    public C78561p(C80792fm fmVar) {
        this.f216314a = fmVar;
    }

    /* renamed from: a */
    public final C78535ar mo73472a() {
        return C78535ar.TRY_SAYING;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78534aq) {
            C78534aq aqVar = (C78534aq) obj;
            if (C78535ar.TRY_SAYING != aqVar.mo73472a() || !this.f216314a.equals(aqVar.mo73479h())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C80792fm mo73479h() {
        return this.f216314a;
    }

    public final int hashCode() {
        return this.f216314a.hashCode();
    }

    public final String toString() {
        String obj = this.f216314a.toString();
        return "SingleContent{trySaying=" + obj + "}";
    }
}
