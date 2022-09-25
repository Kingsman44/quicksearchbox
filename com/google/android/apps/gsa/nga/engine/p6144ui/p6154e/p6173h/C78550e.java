package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.e */
/* compiled from: PG */
final class C78550e extends C78553h {

    /* renamed from: a */
    private final C78533ap f216305a;

    public C78550e(C78533ap apVar) {
        this.f216305a = apVar;
    }

    /* renamed from: a */
    public final C78532ao mo73464a() {
        return C78532ao.EMPTY;
    }

    /* renamed from: d */
    public final C78533ap mo73467d() {
        return this.f216305a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78531an) {
            C78531an anVar = (C78531an) obj;
            if (C78532ao.EMPTY != anVar.mo73464a() || !this.f216305a.equals(anVar.mo73467d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216305a.hashCode();
    }

    public final String toString() {
        String obj = this.f216305a.toString();
        return "DoubleContent{empty=" + obj + "}";
    }
}
