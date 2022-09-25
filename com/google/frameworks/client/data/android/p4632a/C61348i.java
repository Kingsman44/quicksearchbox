package com.google.frameworks.client.data.android.p4632a;

/* renamed from: com.google.frameworks.client.data.android.a.i */
/* compiled from: PG */
final class C61348i extends C61333a {

    /* renamed from: b */
    private final String f165907b;

    /* renamed from: c */
    private final String f165908c;

    public C61348i(String str, String str2) {
        this.f165907b = str;
        this.f165908c = str2;
    }

    /* renamed from: d */
    public final String mo57903d() {
        return this.f165907b;
    }

    /* renamed from: e */
    public final String mo57904e() {
        return this.f165908c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61333a) {
            C61333a aVar = (C61333a) obj;
            String str = this.f165907b;
            if (str != null ? str.equals(aVar.mo57903d()) : aVar.mo57903d() == null) {
                if (this.f165908c.equals(aVar.mo57904e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f165907b;
        String str2 = this.f165908c;
        return "AuthContext{identifier=" + str + ", type=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f165907b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f165908c.hashCode();
    }
}
