package com.google.android.libraries.onegoogle.account.p2345a;

/* renamed from: com.google.android.libraries.onegoogle.account.a.e */
/* compiled from: PG */
final class C30160e extends C30163h {

    /* renamed from: a */
    private final boolean f81535a;

    /* renamed from: b */
    private final int f81536b;

    public C30160e(boolean z, int i) {
        this.f81535a = z;
        this.f81536b = i;
    }

    /* renamed from: a */
    public final boolean mo35563a() {
        return this.f81535a;
    }

    /* renamed from: b */
    public final int mo35564b() {
        return this.f81536b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30163h) {
            C30163h hVar = (C30163h) obj;
            return this.f81535a == hVar.mo35563a() && this.f81536b == hVar.mo35564b();
        }
    }

    public final int hashCode() {
        return (((true != this.f81535a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f81536b;
    }

    public final String toString() {
        boolean z = this.f81535a;
        int i = this.f81536b;
        return "GaiaAccountData{isG1User=" + z + ", isUnicornUser=" + C30162g.m56037a(i) + "}";
    }
}
