package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.aj */
/* compiled from: PG */
public final class C113257aj extends C113258ak {

    /* renamed from: a */
    private final C113424fe f313622a;

    public C113257aj(C113424fe feVar) {
        this.f313622a = feVar;
    }

    /* renamed from: b */
    public final int mo99930b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113286bk) {
            C113286bk bkVar = (C113286bk) obj;
            if (bkVar.mo99930b() != 5 || !this.f313622a.equals(bkVar.mo99947f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C113424fe mo99947f() {
        return this.f313622a;
    }

    public final int hashCode() {
        return this.f313622a.hashCode();
    }

    public final String toString() {
        String obj = this.f313622a.toString();
        return "IconSource{userBadgedIcon=" + obj + "}";
    }
}
