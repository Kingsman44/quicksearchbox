package com.google.android.libraries.web.contrib.logging;

import com.google.android.libraries.web.p3353c.C43363h;

/* renamed from: com.google.android.libraries.web.contrib.logging.g */
/* compiled from: PG */
public final class C43699g extends C43701i {

    /* renamed from: a */
    private final C43363h f114003a;

    public C43699g(C43363h hVar) {
        this.f114003a = hVar;
    }

    /* renamed from: a */
    public final C43710m mo46731a() {
        return C43710m.PAGE_LOAD_ERROR;
    }

    /* renamed from: b */
    public final C43363h mo46732b() {
        return this.f114003a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C43711n) {
            C43711n nVar = (C43711n) obj;
            if (C43710m.PAGE_LOAD_ERROR != nVar.mo46731a() || !this.f114003a.equals(nVar.mo46732b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f114003a.hashCode();
    }

    public final String toString() {
        String obj = this.f114003a.toString();
        return "FailureReason{pageLoadError=" + obj + "}";
    }
}
