package com.google.apps.p3589d.p3595f;

import com.google.apps.p3589d.p3591b.C45719j;

/* renamed from: com.google.apps.d.f.d */
/* compiled from: PG */
final class C45801d extends C45814q {

    /* renamed from: a */
    private final C45812o f120431a;

    /* renamed from: b */
    private final C45719j f120432b;

    public C45801d(C45812o oVar, C45719j jVar) {
        this.f120431a = oVar;
        if (jVar != null) {
            this.f120432b = jVar;
            return;
        }
        throw new NullPointerException("Null variantGlyphIds");
    }

    /* renamed from: a */
    public final C45719j mo49940a() {
        return this.f120432b;
    }

    /* renamed from: b */
    public final C45812o mo49941b() {
        return this.f120431a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45814q) {
            C45814q qVar = (C45814q) obj;
            C45812o oVar = this.f120431a;
            if (oVar != null ? oVar.equals(qVar.mo49941b()) : qVar.mo49941b() == null) {
                if (this.f120432b.equals(qVar.mo49940a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f120431a);
        String obj = this.f120432b.toString();
        return "MathGlyphConstruction{assembly=" + valueOf + ", variantGlyphIds=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        C45812o oVar = this.f120431a;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f120432b.f120220a.hashCode();
    }
}
