package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.an */
/* compiled from: PG */
final class C113261an extends C113496i {

    /* renamed from: a */
    private final Optional f313625a;

    /* renamed from: b */
    private final Optional f313626b;

    public C113261an(Optional optional, Optional optional2) {
        this.f313625a = optional;
        this.f313626b = optional2;
    }

    /* renamed from: a */
    public final Optional mo99951a() {
        return this.f313625a;
    }

    /* renamed from: b */
    public final Optional mo99952b() {
        return this.f313626b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113496i) {
            C113496i iVar = (C113496i) obj;
            return this.f313625a.equals(iVar.mo99951a()) && this.f313626b.equals(iVar.mo99952b());
        }
    }

    public final int hashCode() {
        return ((this.f313625a.hashCode() ^ 1000003) * 1000003) ^ this.f313626b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f313625a);
        String valueOf2 = String.valueOf(this.f313626b);
        return "AndroidIntentFulfillmentParams{androidIntentUrl=" + valueOf + ", packageName=" + valueOf2 + "}";
    }
}
