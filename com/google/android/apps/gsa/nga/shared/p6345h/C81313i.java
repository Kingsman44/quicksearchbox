package com.google.android.apps.gsa.nga.shared.p6345h;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.i */
/* compiled from: PG */
final class C81313i extends C81303cg {

    /* renamed from: a */
    private final Optional f222583a;

    /* renamed from: b */
    private final Optional f222584b;

    public C81313i(Optional optional, Optional optional2) {
        this.f222583a = optional;
        this.f222584b = optional2;
    }

    /* renamed from: a */
    public final Optional mo74988a() {
        return this.f222584b;
    }

    /* renamed from: b */
    public final Optional mo74989b() {
        return this.f222583a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81303cg) {
            C81303cg cgVar = (C81303cg) obj;
            return this.f222583a.equals(cgVar.mo74989b()) && this.f222584b.equals(cgVar.mo74988a());
        }
    }

    public final int hashCode() {
        return ((this.f222583a.hashCode() ^ 1000003) * 1000003) ^ this.f222584b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f222583a);
        String valueOf2 = String.valueOf(this.f222584b);
        return "SpeechPreferences{userProfileId=" + valueOf + ", textDependentModel=" + valueOf2 + "}";
    }
}
