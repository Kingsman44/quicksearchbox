package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.g */
/* compiled from: PG */
final class C78552g extends C78553h {

    /* renamed from: a */
    private final C78537at f216307a;

    public C78552g(C78537at atVar) {
        this.f216307a = atVar;
    }

    /* renamed from: a */
    public final C78532ao mo73464a() {
        return C78532ao.GREETING;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78531an) {
            C78531an anVar = (C78531an) obj;
            if (C78532ao.GREETING != anVar.mo73464a() || !this.f216307a.equals(anVar.mo73469f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C78537at mo73469f() {
        return this.f216307a;
    }

    public final int hashCode() {
        return this.f216307a.hashCode();
    }

    public final String toString() {
        String obj = this.f216307a.toString();
        return "DoubleContent{greeting=" + obj + "}";
    }
}
