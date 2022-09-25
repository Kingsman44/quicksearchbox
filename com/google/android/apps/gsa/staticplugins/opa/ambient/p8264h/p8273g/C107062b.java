package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.b */
/* compiled from: PG */
public final class C107062b extends C107064d {

    /* renamed from: a */
    private final Throwable f298109a;

    public C107062b(Throwable th) {
        this.f298109a = th;
    }

    /* renamed from: a */
    public final Throwable mo95751a() {
        return this.f298109a;
    }

    /* renamed from: b */
    public final int mo95752b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C107078r) {
            C107078r rVar = (C107078r) obj;
            if (rVar.mo95752b() != 2 || !this.f298109a.equals(rVar.mo95751a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f298109a.hashCode();
    }

    public final String toString() {
        String obj = this.f298109a.toString();
        return "ValueOrError{error=" + obj + "}";
    }
}
