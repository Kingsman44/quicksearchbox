package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.r */
/* compiled from: PG */
public final class C113887r extends C113888s {

    /* renamed from: a */
    private final C28292j f315321a;

    public C113887r(C28292j jVar) {
        this.f315321a = jVar;
    }

    /* renamed from: b */
    public final int mo100709b() {
        return 1;
    }

    /* renamed from: c */
    public final C28292j mo100710c() {
        return this.f315321a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113857cl) {
            C113857cl clVar = (C113857cl) obj;
            if (clVar.mo100709b() != 1 || !this.f315321a.equals(clVar.mo100710c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f315321a.hashCode();
    }

    public final String toString() {
        String obj = this.f315321a.toString();
        return "InteractionInfo{ve=" + obj + "}";
    }
}
