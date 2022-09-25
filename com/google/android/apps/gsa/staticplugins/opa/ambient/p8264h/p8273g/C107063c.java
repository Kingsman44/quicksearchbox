package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.c */
/* compiled from: PG */
public final class C107063c extends C107064d {

    /* renamed from: a */
    private final Object f298110a;

    public C107063c(Object obj) {
        this.f298110a = obj;
    }

    /* renamed from: b */
    public final int mo95752b() {
        return 1;
    }

    /* renamed from: c */
    public final Object mo95756c() {
        return this.f298110a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C107078r) {
            C107078r rVar = (C107078r) obj;
            if (rVar.mo95752b() != 1 || !this.f298110a.equals(rVar.mo95756c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f298110a.hashCode();
    }

    public final String toString() {
        String obj = this.f298110a.toString();
        return "ValueOrError{value=" + obj + "}";
    }
}
