package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ai */
/* compiled from: PG */
final class C113256ai extends C113258ak {

    /* renamed from: a */
    private final String f313621a;

    public C113256ai(String str) {
        this.f313621a = str;
    }

    /* renamed from: b */
    public final int mo99930b() {
        return 1;
    }

    /* renamed from: e */
    public final String mo99942e() {
        return this.f313621a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113286bk) {
            C113286bk bkVar = (C113286bk) obj;
            if (bkVar.mo99930b() != 1 || !this.f313621a.equals(bkVar.mo99942e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313621a.hashCode();
    }

    public final String toString() {
        String str = this.f313621a;
        return "IconSource{uri=" + str + "}";
    }
}
