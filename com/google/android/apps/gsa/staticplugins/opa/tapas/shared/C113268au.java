package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.au */
/* compiled from: PG */
final class C113268au extends C113341cl {

    /* renamed from: a */
    private final C113286bk f313647a;

    /* renamed from: b */
    private final boolean f313648b;

    public C113268au(C113286bk bkVar, boolean z) {
        this.f313647a = bkVar;
        this.f313648b = z;
    }

    /* renamed from: a */
    public final C113286bk mo99979a() {
        return this.f313647a;
    }

    /* renamed from: b */
    public final boolean mo99980b() {
        return this.f313648b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113341cl) {
            C113341cl clVar = (C113341cl) obj;
            return this.f313647a.equals(clVar.mo99979a()) && this.f313648b == clVar.mo99980b();
        }
    }

    public final int hashCode() {
        return ((this.f313647a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f313648b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f313647a.toString();
        boolean z = this.f313648b;
        return "SuggestionIcon{iconSource=" + obj + ", isGeneric=" + z + "}";
    }
}
