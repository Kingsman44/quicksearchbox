package com.google.android.libraries.web.contrib.logging;

/* renamed from: com.google.android.libraries.web.contrib.logging.h */
/* compiled from: PG */
public final class C43700h extends C43701i {

    /* renamed from: a */
    private final Throwable f114004a;

    public C43700h(Throwable th) {
        this.f114004a = th;
    }

    /* renamed from: a */
    public final C43710m mo46731a() {
        return C43710m.URL_FORMATION_ERROR;
    }

    /* renamed from: c */
    public final Throwable mo46736c() {
        return this.f114004a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43711n) {
            C43711n nVar = (C43711n) obj;
            if (C43710m.URL_FORMATION_ERROR != nVar.mo46731a() || !this.f114004a.equals(nVar.mo46736c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f114004a.hashCode();
    }

    public final String toString() {
        String obj = this.f114004a.toString();
        return "FailureReason{urlFormationError=" + obj + "}";
    }
}
