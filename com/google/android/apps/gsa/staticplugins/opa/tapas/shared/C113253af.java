package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.af */
/* compiled from: PG */
final class C113253af extends C113258ak {

    /* renamed from: a */
    private final String f313618a;

    public C113253af(String str) {
        this.f313618a = str;
    }

    /* renamed from: a */
    public final String mo99929a() {
        return this.f313618a;
    }

    /* renamed from: b */
    public final int mo99930b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113286bk) {
            C113286bk bkVar = (C113286bk) obj;
            if (bkVar.mo99930b() != 4 || !this.f313618a.equals(bkVar.mo99929a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313618a.hashCode();
    }

    public final String toString() {
        String str = this.f313618a;
        return "IconSource{appIconPackageName=" + str + "}";
    }
}
