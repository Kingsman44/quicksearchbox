package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.c.a */
/* compiled from: PG */
final class C131183a extends C131191i {

    /* renamed from: a */
    private final Optional f358780a;

    /* renamed from: b */
    private final Optional f358781b;

    public C131183a(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f358780a = optional;
            if (optional2 != null) {
                this.f358781b = optional2;
                return;
            }
            throw new NullPointerException("Null signUpGeneratorInput");
        }
        throw new NullPointerException("Null card");
    }

    /* renamed from: a */
    public final Optional mo110106a() {
        return this.f358780a;
    }

    /* renamed from: b */
    public final Optional mo110107b() {
        return this.f358781b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131191i) {
            C131191i iVar = (C131191i) obj;
            return this.f358780a.equals(iVar.mo110106a()) && this.f358781b.equals(iVar.mo110107b());
        }
    }

    public final int hashCode() {
        return ((this.f358780a.hashCode() ^ 1000003) * 1000003) ^ this.f358781b.hashCode();
    }

    public final String toString() {
        String obj = this.f358780a.toString();
        String obj2 = this.f358781b.toString();
        return "DefaultCardGeneratorResult{card=" + obj + ", signUpGeneratorInput=" + obj2 + "}";
    }
}
