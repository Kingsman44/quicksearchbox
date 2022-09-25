package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.f */
/* compiled from: PG */
final class C78551f extends C78553h {

    /* renamed from: a */
    private final C80722cx f216306a;

    public C78551f(C80722cx cxVar) {
        this.f216306a = cxVar;
    }

    /* renamed from: a */
    public final C78532ao mo73464a() {
        return C78532ao.FRE_SUGGESTION;
    }

    /* renamed from: e */
    public final C80722cx mo73468e() {
        return this.f216306a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78531an) {
            C78531an anVar = (C78531an) obj;
            if (C78532ao.FRE_SUGGESTION != anVar.mo73464a() || !this.f216306a.equals(anVar.mo73468e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216306a.hashCode();
    }

    public final String toString() {
        String obj = this.f216306a.toString();
        return "DoubleContent{freSuggestion=" + obj + "}";
    }
}
